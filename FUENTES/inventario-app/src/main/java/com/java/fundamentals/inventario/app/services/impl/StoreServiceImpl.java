package com.java.fundamentals.inventario.app.services.impl;

import com.java.fundamentals.inventario.app.exceptions.AtLeastOneStoreIsRequiredException;
import com.java.fundamentals.inventario.app.exceptions.StoreNameTooLongException;
import com.java.fundamentals.inventario.app.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventario.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventario.app.services.StoreServiceI;

/**
 *
 * @author Edwin Acosta Bravo
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

    @Override
    public Store findById(short id) throws StoreNotFoundException {
        return storeRepository.findById(id);
    }

    @Override
    public Store update(Store storeToUpdate) throws StoreNotFoundException, StoreNameTooLongException{
        if(storeToUpdate.getName().length() > 8){
            throw new StoreNameTooLongException("El nombre de la tienda excede el tamaño permitido.");
        }
        return storeRepository.update(storeToUpdate);
    }

    @Override
    public void delete(short idStore) {
        storeRepository.delete(idStore);
    }

    @Override
    public void checkStores() {
        Store[] stores = storeRepository.findAll();
        if(stores == null || stores.length == 0){
            throw new AtLeastOneStoreIsRequiredException(); 
            
        }
    }
    
    
}
