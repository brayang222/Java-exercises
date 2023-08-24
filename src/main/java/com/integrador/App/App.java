package com.integrador.App;

import com.integrador.Logic.Arbol;
import com.integrador.Logic.Arbusto;
import com.integrador.Logic.Flor;

public class App {
    public static void main(String[] args){

        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();

        arbol.queSoy();
        flor.queSoy();
        arbusto.queSoy();


    }
}
