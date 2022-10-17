package com.marcos.pccomponentes;

public class PowerSupply {

    private Integer id;
    private String marca;
    private String potencia;
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

    public String getPotencia(){
        return potencia;
    }

    public void setPotencia(String potencia){
        this.potencia = potencia;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
}
