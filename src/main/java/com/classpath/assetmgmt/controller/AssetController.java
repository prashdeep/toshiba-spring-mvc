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
    public String fetchAssetById(@PathVariable Long id, Model model){
        model.addAttribute("asset", this.assetService.findAssetById(id));
        return "asset-details";
    }

    @GetMapping("/register")
    public ModelAndView assetForm(){
        return new ModelAndView("assetForm", "asset", new Asset());
    }

    @PostMapping("/save")
    public String saveAsset(@Valid Asset asset, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "assetForm";
        }
        Asset saveAsset = assetService.saveAsset(asset);
        model.addAttribute("asset", saveAsset);
        return "success";
    }

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleException(RuntimeException ex)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", ex.getMessage());
        return modelAndView;
    }
}