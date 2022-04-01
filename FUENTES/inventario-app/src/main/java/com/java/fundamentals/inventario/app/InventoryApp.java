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
        
        if("findAllStores".equals(args[0])){
            inventoryApp.findAllStores();      
        }else if("findStoreById".equals(args[0])){
            inventoryApp.findStoreById();            
        }else if("update".equals(args[0])){
            inventoryApp.update();
        }else if("delete".equals(args[0])){
            inventoryApp.delete();
        }else{
            System.out.println("No se reconoció ninguna operacion");
        }
                
    }
    
    public void findAllStores(){
        Store[] foundStores = this.storeServiceI.findAll();
        for (Store foundStore : foundStores) {
            if(foundStore != null){
                System.out.println("Las tiendas encontradas son : " + foundStore);            
            }
        }        
    }
    
    public void findStoreById(){
        Store foundStore = this.storeServiceI.findById((short)2);
        
        System.out.println("La información de la tienda es: " + foundStore);
    }
    
    public void  update(){
        Store storeToUpdate = new Store();
        storeToUpdate.setId((short)2);
        storeToUpdate.setName("Nueva tienda 5");
        storeToUpdate.setAddress("direccion 2");
        storeToUpdate.setCiudad("Nueva tienda 2");
        
        Store updatedStore = this.storeServiceI.update(storeToUpdate);
        System.out.println("La tienda actualizada es: " + updatedStore);
        
        //Array actualizado
        this.findAllStores();
    }
    
    public void delete(){
        this.storeServiceI.delete((short)3);
        
        //Array actualizado
        this.findAllStores();
    }
}
