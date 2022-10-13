package com.marcos.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        /**
         * Placa Base
         */

        PlacaBase gigabit = new PlacaBase();
        gigabit.setId(1);
        gigabit.setFabricante("gigabit");
        gigabit.setModelo("m400");
        gigabit.setPrecio(50);

        System.out.println(gigabit.getId());
        System.out.println(gigabit.getFabricante());
        System.out.println(gigabit.getModelo());
        System.out.println(gigabit.getPrecio());
    }
}