package com.melson.base.dao;

import com.melson.base.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nelson on 2020/7/23.
 */
@Repository
public interface IStoreDao extends JpaRepository<Store,String> {
}
