package com.marcos.pccomponentes;

public class GraphicCard {

    private Integer id;
    private String marca;
    private String modelo;
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

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }

}
