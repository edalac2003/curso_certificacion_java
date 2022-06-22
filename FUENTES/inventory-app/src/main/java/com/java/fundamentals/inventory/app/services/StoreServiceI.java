package com.java.fundamentals.inventory.app.services;

import com.java.fundamentals.inventory.app.entities.Store;
import com.java.fundamentals.inventory.app.exceptions.StoreNotFoundException;
import java.util.List;
import java.util.Set;

/**
 *
 * @author capri
 */
public interface StoreServiceI {
    
    List<Store> findAll();
    Store findById(short storeId) throws Exception, StoreNotFoundException;
    Store update(Store storeToUpdate) throws Exception, StoreNotFoundException;
    void checkStores();
    String checkIfStoreHasValidName(Store storeToVerify);
    
    List<String> findNameStoreWithFiveCharacterOrMore();
    Set<Store> findAllStoresSortedByName();
    Set<Store> findAllStoresSortedById();
}
