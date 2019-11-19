package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;

import java.util.List;

public interface AssetDAO {

    Asset saveAsset(Asset asset) ;

    List<Asset> fetchAllAssets();

    Asset findAssetById(Long id);

    void deleteAsset(Long id);
}