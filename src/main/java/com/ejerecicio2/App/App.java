package com.ejerecicio2.App;

import com.ejerecicio2.Names.Bulbasur;
import com.ejerecicio2.Names.Charmander;
import com.ejerecicio2.Names.Pikachu;
import com.ejerecicio2.Names.Squirtel;

public class App {
    public static void main(String[] args){
        Squirtel squirtel = new Squirtel();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();

        squirtel.attackHydropump();
        squirtel.attackTackle();
        charmander.attackBait();
        charmander.attackFlamethrower();
        bulbasur.attackScratch();
        bulbasur.attackSewerSystem();
        pikachu.attackBait();
        pikachu.attackThundershock();
    }
}
