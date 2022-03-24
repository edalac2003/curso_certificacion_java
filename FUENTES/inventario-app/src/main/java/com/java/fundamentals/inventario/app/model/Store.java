package com.java.fundamentals.inventario.app.model;

/**
 *
 * @author edala
 */
public class Store {
    private short id;
    private String name;
    private String address;
    private String ciudad;
    private Company empresa;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Company getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Company empresa) {
        this.empresa = empresa;
    }
    
    
}
