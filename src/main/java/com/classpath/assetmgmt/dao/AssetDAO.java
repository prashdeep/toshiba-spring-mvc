package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;

import java.util.List;

public interface AssetDAO {

    void saveAsset(Asset asset);

    List<Asset> fetchAllAssets();

    Asset findAssetById(long id);

    void deleteAsset(long id);
}