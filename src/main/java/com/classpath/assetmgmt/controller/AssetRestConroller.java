package com.classpath.assetmgmt.controller;

import com.classpath.assetmgmt.model.Asset;
import com.classpath.assetmgmt.service.AssetService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping("/v1/assets/")
public class AssetRestConroller {


    private final AssetService assetService;

    public AssetRestConroller(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping(produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public List<Asset> listAssets(){
        return this.assetService.fetchAllAssets();
    }

    @GetMapping(value="/{id}", produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE})
    public Asset fetchAssetById(@PathVariable Long id){
        return this.assetService.findAssetById(id);
    }

    @PostMapping( consumes = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE},
                  produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE}
                 )
    public Asset saveAsset(@RequestBody Asset asset){
        return this.assetService.saveAsset(asset);
    }
}