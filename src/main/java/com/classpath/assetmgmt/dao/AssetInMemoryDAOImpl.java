package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository("inmemory")
public class AssetInMemoryDAOImpl implements AssetDAO {
    private static final List<Asset> assets = new ArrayList<>();
    private static long assetId = 1000;

    @Override
    public Asset saveAsset(Asset asset) {
        Asset savedAsset = Asset.builder().id(assetId++).name(asset.getName()).price(asset.getPrice()).build();
        assets.add(savedAsset);
        return savedAsset;
    }

    @Override
    public List<Asset> fetchAllAssets() {
        return assets;
    }

    @Override
    public Asset findAssetById(Long id) {
        Optional<Asset> optionalAsset = assets.stream().filter(asset -> asset.getId() == id).findFirst();
        IllegalArgumentException ex = new IllegalArgumentException("Invalid assetId passed");

        return optionalAsset.orElseThrow(() -> ex);
    }

    @Override
    public void deleteAsset(Long id) {
        assets.removeIf(asset -> asset.getId()==id);
    }
}