/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.fundamentals.inventario.app.repositories;

import com.java.fundamentals.inventario.app.model.Store;

/**
 *
 * @author edala
 */
public interface StoreRepositoryI {
    
    Store create(Store storeToCreate);
    
    Store findById(short idStore);
    
    Store[] findAll();
    
    Store update(Store storeToUpdate);
    
    void delete(short idStore);
}
