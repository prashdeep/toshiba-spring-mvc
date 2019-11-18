package com.classpath.assetmgmt.dao;

import com.classpath.assetmgmt.model.Asset;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hibernateDAO")
public class HibernateAssetDAOImpl implements AssetDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Asset saveAsset(Asset asset) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(asset);
        return asset;
    }

    @Override
    public List<Asset> fetchAllAssets() {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.createQuery("from Asset").list();
    }

    @Override
    public Asset findAssetById(Long id) {
        return sessionFactory.getCurrentSession().get(Asset.class, id);
    }

    @Override
    public void deleteAsset(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Asset asset = session.byId(Asset.class).load(id);
        session.delete(asset);
    }
}