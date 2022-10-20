package com.marcos.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        /**
         * Procesador
         */

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");
        amd.setPrecio(200);

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
        System.out.println(amd.getPrecio());

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

        /**
         * Tarjeta gráfica
         */

        GraphicCard gtx = new GraphicCard();
        gtx.setId(1);
        gtx.setMarca("nvidia");
        gtx.setModelo("gtx 1660");
        gtx.setPrecio(200);

        System.out.println(gtx.getId());
        System.out.println(gtx.getMarca());
        System.out.println(gtx.getModelo());
        System.out.println(gtx.getPrecio());

        /**
         * Box
         */

        Box caja = new Box();
        caja.setId(1);
        caja.setMarca("corsair");
        caja.setModelo("410");
        caja.setPrecio(200);

        System.out.println(caja.getId());
        System.out.println(caja.getMarca());
        System.out.println(caja.getModelo());
        System.out.println(caja.getPrecio());

        /**
         * Cpu Fan
         */

        CpuFan ventilador = new CpuFan();
        ventilador.setId(1);
        ventilador.setMarca("cooler master");
        ventilador.setRpm("120");
        ventilador.setPrecio(50);

        System.out.println(ventilador.getId());
        System.out.println(ventilador.getMarca());
        System.out.println(ventilador.getRpm());
        System.out.println(ventilador.getPrecio());

        /**
         * Hard disk
         */

        HardDisk disco = new HardDisk();
        disco.setId(1);
        disco.setMarca("toshiba");
        disco.setCapacidad("500GB");
        disco.setPrecio(50);

        System.out.println(disco.getId());
        System.out.println(disco.getMarca());
        System.out.println(disco.getCapacidad());
        System.out.println(disco.getPrecio());

        /**
         * power supply
         */

        PowerSupply fuente = new PowerSupply();
        fuente.setId(1);
        fuente.setMarca("NOX");
        fuente.setPotencia("500W");
        fuente.setPrecio(75);

        System.out.println(fuente.getId());
        System.out.println(fuente.getMarca());
        System.out.println(fuente.getPotencia());
        System.out.println(fuente.getPrecio());

        /**
         * RAM
         */

        RamMemory ram = new RamMemory();
        ram.setId(1);
        ram.setMarca("Crucial");
        ram.setCapacidad("8GB");
        ram.setPrecio(75);

        System.out.println(ram.getId());
        System.out.println(ram.getMarca());
        System.out.println(ram.getCapacidad());
        System.out.println(ram.getPrecio());

        /**
         * Sound card
         */

        SoundCard sonido = new SoundCard();
        sonido.setId(1);
        sonido.setMarca("sound blaster");
        sonido.setModelo("6492");
        sonido.setPrecio(40);

        System.out.println(sonido.getId());
        System.out.println(sonido.getMarca());
        System.out.println(sonido.getModelo());
        System.out.println(sonido.getPrecio());

        /**
         * Grabadora DVD
         */

        GrabadoraDVD dvd = new GrabadoraDVD();
        dvd.setId(1);
        dvd.setMarca("toshiba");
        dvd.setModelo("6298");
        dvd.setPrecio(20);

        System.out.println(dvd.getId());
        System.out.println(dvd.getMarca());
        System.out.println(dvd.getModelo());
        System.out.println(dvd.getPrecio());

        /**
         * Screen
         */

        Screen pantalla = new Screen();
        pantalla.setId(1);
        pantalla.setMarca("asus");
        pantalla.setModelo("144");
        pantalla.setPrecio(150);

        System.out.println(pantalla.getId());
        System.out.println(pantalla.getMarca());
        System.out.println(pantalla.getModelo());
        System.out.println(pantalla.getPrecio());

        /**
         * Teclado
         */

        Keyboard teclado = new Keyboard();
        teclado.setId(1);
        teclado.setMarca("logitec");
        teclado.setModelo("430");
        teclado.setPrecio(70);

        System.out.println(teclado.getId());
        System.out.println(teclado.getMarca());
        System.out.println(teclado.getModelo());
        System.out.println(teclado.getPrecio());

        /**
         * Raton
         */

        Mouse raton = new Mouse();
        raton.setId(1);
        raton.setMarca("logitec");
        raton.setModelo("120");
        raton.setPrecio(50);

        System.out.println(raton.getId());
        System.out.println(raton.getMarca());
        System.out.println(raton.getModelo());
        System.out.println(raton.getPrecio());

        /**
         * Altavoces
         */

        Speakers altavoz = new Speakers();
        altavoz.setId(1);
        altavoz.setMarca("mars gaming");
        altavoz.setModelo("1660");
        altavoz.setPrecio(45);

        System.out.println(altavoz.getId());
        System.out.println(altavoz.getMarca());
        System.out.println(altavoz.getModelo());
        System.out.println(altavoz.getPrecio());

    }
}