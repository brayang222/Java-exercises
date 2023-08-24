package com.ejercicio3.App;

import com.ejercicio3.Domain.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args){
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "Brayan", 22));

        System.out.println("------PRUEBA FOR COMÚN--------");
        //recorrido for por índice
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }

        System.out.println("------PRUEBA FOREACH--------");
        //recorrido por foreach
        for (Persona persona:lista) {
            System.out.println("prueba " + persona.getNombre());
        }
        // se puede agregar de manera bidimensional
        List<Persona> lista2 = new LinkedList<Persona>(); // LinkedList solo se puede recorrer por forEach
        lista2.add(new Persona(1, "Gabriel", 69));
        lista2.add(new Persona(2, "Luisina", 30));
        lista2.add(0, new Persona(3, "primero", 30));
        System.out.println("------PRUEBA FOREACH LinkedList--------");

        for (Persona persona2:lista2) {
            System.out.println("prueba " + persona2.getNombre());
        }

    }
}
