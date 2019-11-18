package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hibernate")
public class HibernateAssetDAOImpl implements AssetDAO {

    @Override
    public void saveAsset(Asset asset) {

    }

    @Override
    public List<Asset> fetchAllAssets() {
        return null;
    }

    @Override
    public Asset findAssetById(long id) {
        return null;
    }

    @Override
    public void deleteAsset(long id) {

    }
}