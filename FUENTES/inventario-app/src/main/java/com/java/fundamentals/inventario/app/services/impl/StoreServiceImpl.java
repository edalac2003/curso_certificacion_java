/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.fundamentals.inventario.app.services.impl;

import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventario.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventario.app.services.StoreServiceI;

/**
 *
 * @author edala
 */
public class StoreServiceImpl implements StoreServiceI{

    private StoreRepositoryI storeRepository; 
    
    public StoreServiceImpl(StoreRepositoryI storeRepositoryImpl) {
        this.storeRepository = storeRepositoryImpl;
    }
    
    @Override
    public Store[] findAll() {
        return storeRepository.findAll();
    }
    
}
