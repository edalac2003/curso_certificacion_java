package com.java.fundamentals.inventario.app.repositories.impl;

import com.java.fundamentals.inventario.app.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;

/**
 *
 * @author edala
 */
public class StoreRepositoryImpl implements StoreRepositoryI{
    
    private Store[] stores = {
        new Store((short)1, "Tienda 1", "Direccion 1"),
        new Store((short)2, "Tienda 2", "Direccion 2"),
        new Store((short)3, "Tienda 3", "Direccion 3")
    };
    
    public StoreRepositoryImpl(){
        
    }
    
    @Override
    public Store create(Store storeToCreate){
        return null;
    }
    
    @Override
    public Store findById(short idStore) throws StoreNotFoundException{
        Store foundStore = null;
        for(Store storeIterate : stores){
            if(idStore == storeIterate.getId()){
                foundStore = storeIterate;
                break;
            }
        }
        if(foundStore == null){
            throw new StoreNotFoundException("El id suministrado " + idStore + " no produjo ningún resultado.");
        }
        
        return foundStore;
    }
    
    @Override
    public Store[] findAll(){
        return stores;
    }
    
    @Override
    public Store update(Store storeToUpdate) throws StoreNotFoundException{
        Store foundStore = findById(storeToUpdate.getId());
        foundStore.setName(storeToUpdate.getName());
        foundStore.setAddress(storeToUpdate.getAddress());
        foundStore.setCiudad(storeToUpdate.getCiudad());
                
        return storeToUpdate;
    }
    
    @Override
    public void delete(short idStore){
        //Buscar y eliminar el Store
        for (int i = 0; i < stores.length; i++) {
            if(stores[i].getId() == idStore){
                stores[i] = null;
                break;
            }
        }
        
        //Recorrer y ordenar el array
        for (int i = 0; i < stores.length-1; i++) {
            if(stores[i] == null && stores[i+1] != null){
                stores[i] = stores[i+1];
                stores[i+1] = null;
            }
        }
    }
}
