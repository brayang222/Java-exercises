package com.ejerecicio2.Names;

import com.ejerecicio2.Domain.IFire;
import com.ejerecicio2.Domain.Pokemon;

public class Charmander extends Pokemon implements IFire {
    public Charmander(){

    }
    @Override
    public void attackTackle() {
        System.out.println("Charmander utilizó placaje");
    }

    @Override
    public void attackScratch() {
        System.out.println("Charmander utilizó arañazo");
    }

    @Override
    public void attackBait() {
        System.out.println("Charmander utilizó Mordisco");
    }

    @Override
    public void attackFirePunch() {
        System.out.println("Charmander utilizó puño fuego");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("Charmander utilizó lanzallamas");
    }

    @Override
    public void attackEmbers() {
        System.out.println("Charmander utilizó ascuas");
    }
}
