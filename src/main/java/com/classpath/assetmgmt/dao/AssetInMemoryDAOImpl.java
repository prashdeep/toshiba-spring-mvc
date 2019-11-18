package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("inmemory")
public class AssetInMemoryDAOImpl implements AssetDAO {

    @Override
    public void saveAsset(Asset asset) {
    }

    @Override
    public List<Asset> fetchAllAssets() {
        return Arrays.asList(
                Asset.builder().id(23).name("macbook").price(45000).build(),
                Asset.builder().id(25).name("lenovo").price(50000).build(),
                Asset.builder().id(26).name("hp").price(45000).build(),
                Asset.builder().id(26).name("dell").price(50000).build());
    }

    @Override
    public Asset findAssetById(long id) {
        return null;
    }

    @Override
    public void deleteAsset(long id) {

    }
}