package com.java.fundamentals.inventario.app.repositories.impl;

import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;

/**
 *
 * @author edala
 */
public class StoreRepositoryImpl implements StoreRepositoryI{
    
    private Store[] stores = new Store[3];
    
    public StoreRepositoryImpl(){
        Store store1 = new Store();
        store1.setId((short)1);
        store1.setName("Tienda 1");
        store1.setAddress("Direccion 1");
        
        stores[0] = store1;
                
        Store store2 = new Store();
        store2.setId((short)2);
        store2.setName("Tienda 2");
        store2.setAddress("Direccion 2");
        
        stores[1] = store2;
        
        Store store3 = new Store();
        store3.setId((short)3);
        store3.setName("Tienda 3");
        store3.setAddress("Direccion 3");
        
        stores[2] = store3;        
    }
    
    @Override
    public Store create(Store storeToCreate){
        return null;
    }
    
    @Override
    public Store findById(short idStore){
        return null;
    }
    
    @Override
    public Store[] findAll(){
        return stores;
    }
    
    @Override
    public Store update(Store storeToUpdate){
        return null;
    }
    
    @Override
    public void delete(short idStore){
        
    }
}
