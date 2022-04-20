package com.java.fundamentals.inventario.app.repositories;

import com.java.fundamentals.inventario.app.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventario.app.model.Store;

/**
 *
 * @author Edwin Acosta Bravo
 */
public interface StoreRepositoryI {
    
    Store create(Store storeToCreate);
    
    Store findById(short idStore) throws StoreNotFoundException;
    
    Store[] findAll();
    
    Store update(Store storeToUpdate) throws StoreNotFoundException;
    
    void delete(short idStore);
}
