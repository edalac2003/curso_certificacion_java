package com.java.fundamentals.inventario.app.model;

/**
 *
 * @author edala
 */
public class Product {
    private short id;
    private String name;
    private float currentQuantity;
    private float minQuantity;
    private String measureUnit;
    private Store store;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(float currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public float getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(float minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    
    
}
