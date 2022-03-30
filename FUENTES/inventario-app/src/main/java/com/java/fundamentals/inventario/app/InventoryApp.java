/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.fundamentals.inventario.app;

import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventario.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventario.app.services.StoreServiceI;
import com.java.fundamentals.inventario.app.services.impl.StoreServiceImpl;

/**
 *
 * @author edala
 */
public class InventoryApp {
    
    private StoreServiceI storeServiceI;

    public InventoryApp(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }
    
    public static void main(String[] args) {
        StoreRepositoryI storeRepositoryImpl = new StoreRepositoryImpl();
        StoreServiceI storeService = new StoreServiceImpl(storeRepositoryImpl);
        
        InventoryApp inventoryApp = new InventoryApp(storeService);
        
        inventoryApp.findAllStores();
    }
    
    public void findAllStores(){
        Store[] foundStores = this.storeServiceI.findAll();
        System.out.println("Las tiendas encontradas son : " + foundStores.length);
    }
}
