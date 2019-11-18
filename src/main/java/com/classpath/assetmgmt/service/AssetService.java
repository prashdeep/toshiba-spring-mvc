package com.classpath.assetmgmt.service;

import com.classpath.assetmgmt.model.Asset;

import java.util.List;

public interface AssetService {

    void saveAsset(Asset asset);

    List<Asset> fetchAllAssets();

    Asset findAssetById(long id);

    void deleteAsset(long id);
}