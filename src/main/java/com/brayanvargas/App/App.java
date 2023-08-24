package com.brayanvargas.App;

import com.brayanvargas.Domain.Alumno;

public class App {

    public static void main(String[] args){

        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno(2, "Brayan", "Gomez");

        System.out.println("La id del alumno es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getName());
        System.out.println("El apellido es: " + alumno2.getLastName());

        alumno.setId(10);
        alumno.setName("Kevin");
        alumno.setLastName("Botero");

        System.out.println("---------------------------------");
        System.out.println("La id del alumno es: " + alumno.getId());
        System.out.println("El nombre es: " + alumno.getName());
        System.out.println("El apellido es: " + alumno.getLastName());
        System.out.println("---------------------------------");

        alumno2.setId(69); //cambio de id

        System.out.println("La id del alumno es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getName());
        System.out.println("El apellido es: " + alumno2.getLastName());

    }

}
