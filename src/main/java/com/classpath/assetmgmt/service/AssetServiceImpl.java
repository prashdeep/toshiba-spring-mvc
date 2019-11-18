package com.classpath.assetmgmt.service;

import com.classpath.assetmgmt.dao.AssetDAO;
import com.classpath.assetmgmt.model.Asset;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private final AssetDAO assetDAO;
    public AssetServiceImpl(@Qualifier("inmemory") AssetDAO assetDAO) {
        this.assetDAO = assetDAO;
    }

    @Override
    public Asset saveAsset(Asset asset) {
        return this.assetDAO.saveAsset(asset);
    }

    @Override
    public List<Asset> fetchAllAssets() {
        System.out.println("Came inside the fetch assets service");
        return this.assetDAO.fetchAllAssets();
    }

    @Override
    public Asset findAssetById(Long id) {
        return this.assetDAO.findAssetById(id);
    }

    @Override
    public void deleteAsset(Long id) {
        this.assetDAO.deleteAsset(id);
    }
}