package com.marcos.pccomponentes;

public class RamMemory {

    private Integer id;
    private String marca;
    private String capacidad;
    private Integer precio;

    /**
     * Métodos, funciones, comportamiento
     */
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(String capacidad){
        this.capacidad = capacidad;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}
