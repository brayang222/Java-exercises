package com.TryCatch.App;

public class App {
    public static void main(String[] args){
        int[] edades = {15, 12, 23, 56 };

        try {
            System.out.println("la edad de la pos 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentas acceder a un arreglo que no existe ");
        }
    }
}
