package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("h2Dao")
public class H2AssetDAOImpl implements AssetDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public H2AssetDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Asset saveAsset(Asset asset) {
        long id = (int)(Math.ceil(Math.random()*1000));
        this.jdbcTemplate.execute("insert into assets (asset_id, asset_name, asset_price) " +
                "values ("+id+",'"+asset.getName()+"',"+asset.getPrice()+" )");
        asset.setId(id);
        return asset;
    }

    @Override
    public List<Asset> fetchAllAssets() {
        String fetchAllQuery = "select * from assets";
        List<Asset> assets = this.jdbcTemplate.query(fetchAllQuery,
                (resultSet,rowNum) ->
                        Asset.builder()
                                .id(resultSet.getLong("asset_id"))
                                .name(resultSet.getString("asset_name"))
                                .price(resultSet.getLong("asset_price"))
                                .build());

        return assets;
    }

    @Override
    public Asset findAssetById(Long id) {
        String query = "select * from assets where asset_id="+id;
        Asset asset = this.jdbcTemplate.queryForObject(query, ((resultSet, i) ->
                Asset.builder()
                        .id(resultSet.getLong("asset_id"))
                        .name(resultSet.getString("asset_name"))
                        .price(resultSet.getLong("asset_price"))
                        .build()));
        return asset;
    }

    @Override
    public void deleteAsset(Long id) {
        this.jdbcTemplate.update("delete from assets where asset_id="+id);
    }
}