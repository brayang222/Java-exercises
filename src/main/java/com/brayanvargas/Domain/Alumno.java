package com.brayanvargas.Domain;

public class Alumno {
    int id;
    String name;
    String lastName;

    public Alumno(){
    }

    public Alumno(int id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public int setId(int id){
        this.id = id;
        return id;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }

    public void showName(){
        System.out.println("Hi, i'm an alumno");
    }

    public void approved (double calificacion){

    }
}
