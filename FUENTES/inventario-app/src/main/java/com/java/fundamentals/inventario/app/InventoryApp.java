package com.java.fundamentals.inventario.app;

import com.java.fundamentals.inventario.app.exceptions.StoreNameTooLongException;
import com.java.fundamentals.inventario.app.exceptions.StoreNotFoundException;
import com.java.fundamentals.inventario.app.model.Store;
import com.java.fundamentals.inventario.app.repositories.StoreRepositoryI;
import com.java.fundamentals.inventario.app.repositories.impl.StoreRepositoryImpl;
import com.java.fundamentals.inventario.app.services.StoreServiceI;
import com.java.fundamentals.inventario.app.services.impl.StoreServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin Acosta Bravo
 */
public class InventoryApp {
    
    private StoreServiceI storeServiceI;

    public InventoryApp(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }
    
    public static void main(String[] args) {
        var storeRepositoryImpl = new StoreRepositoryImpl();
        var storeService = new StoreServiceImpl(storeRepositoryImpl);
        
        var inventoryApp = new InventoryApp(storeService);
        
        storeService.checkStores();            
        switch(args[0]){
            default:
                System.out.println("No se reconoció ninguna operacion");
                break;
            case "findAllStores":
                inventoryApp.findAllStores(); 
                break;
            case "findStoreById":
                inventoryApp.findStoreById();
                break;
            case "update":
                inventoryApp.update();
                break;
            case "delete":
                inventoryApp.delete();
                break;
        }               
    }
    
    public void findAllStores(){
        List<Store> foundStores = this.storeServiceI.findAll();
                
        for(Store foundStore: foundStores) {
            if(foundStore != null){
                System.out.println("Las tiendas encontradas son : " + foundStore);            
            }
        }        
    }
    
    public void findStoreById(){
        Store foundStore;
        try {
            foundStore = this.storeServiceI.findById((short)2);
            System.out.println("La información de la tienda es: " + foundStore);
        } catch (StoreNotFoundException ex) {
            Logger.getLogger(InventoryApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void  update(){
        try {
            var storeToUpdate = new Store((short)1, "Tienda", "Una Nueva direccion", "New York");                        
            var updatedStore = this.storeServiceI.update(storeToUpdate);
            System.out.println("La tienda actualizada es: " + updatedStore);
            
        } catch (StoreNotFoundException ex) {
            Logger.getLogger(InventoryApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (StoreNameTooLongException ex1) {
            Logger.getLogger(InventoryApp.class.getName()).log(Level.SEVERE, ex1.getMessage(), ex1);
        }
    }
    
    public void delete(){
        this.storeServiceI.delete((short)3);
        
        this.findAllStores();
    }
}
