package com.classpath.assetmgmt.service;

import com.classpath.assetmgmt.model.Asset;

import java.util.List;

public interface AssetService {

    Asset saveAsset(Asset asset);

    List<Asset> fetchAllAssets();

    Asset findAssetById(Long id);

    void deleteAsset(Long id);
}