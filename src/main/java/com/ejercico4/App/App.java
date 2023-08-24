package com.ejercico4.App;

import com.ejercico4.Domain.Auto;
import com.ejercico4.Domain.Proprietary;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){

        Auto auto = new Auto();
        auto.setId(1L);
        auto.setMarca("Mazda");
        auto.setModel("cx5");

        List<Proprietary> listProprietary = new ArrayList<Proprietary>();

        Proprietary proprietary = new Proprietary();
        Proprietary proprietary2 = new Proprietary();
        Proprietary proprietary3 = new Proprietary();

        proprietary.setId(33L);
        proprietary.setName("brayan");
        proprietary.setLastName("Gomez");

        proprietary2.setId(22L);
        proprietary2.setName("valenttina");
        proprietary2.setLastName("Quiroga");

        proprietary3.setId(12L);
        proprietary3.setName("tercero");
        proprietary3.setLastName("ome");

        listProprietary.add(proprietary);
        listProprietary.add(proprietary2);
        listProprietary.add(proprietary3);

        auto.setListProprietary(listProprietary);

        System.out.println("El auto " + auto.getMarca() + " " + auto.getModel() + " tiene como propietarios a: " +
                auto.getListProprietary());
    }
}
