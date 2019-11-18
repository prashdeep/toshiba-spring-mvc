package com.classpath.assetmgmt.controller;

import com.classpath.assetmgmt.model.Asset;
import com.classpath.assetmgmt.service.AssetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/assets")
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public String fetchAllAssets(ModelMap modelMap){
        List<Asset> assets = this.assetService.fetchAllAssets();
        modelMap.addAttribute("assets", assets);
        modelMap.addAttribute("message", "hello world");
        return  "assets";
    }

    @GetMapping("/{id}")
    public Asset fetchAssetById(long id){
        return this.assetService.findAssetById(id);
    }

    @GetMapping("/register")
    public ModelAndView assetForm(){
        return new ModelAndView("assetForm", "asset", new Asset());
    }

    @PostMapping("/save")
    public String saveAsset(@Valid Asset asset, BindingResult bindingResult, Model model){
        System.out.println("Inside the asset save controller....");
        System.out.println(asset);
        System.out.println(bindingResult.hasErrors());
        if(bindingResult.hasErrors()){
            return "assetForm";
        }
        Asset saveAsset = assetService.saveAsset(asset);
        model.addAttribute("asset", saveAsset);
        return "success";
    }

    @PutMapping("/{id}")
    public void updateAsset(Asset asset){
        this.assetService.saveAsset(asset);
    }

    @DeleteMapping("/{id}")
    public void deleteAssetById(long id){
        this.assetService.deleteAsset(id);
    }


}