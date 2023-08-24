package com.ejerecicio2.Names;

import com.ejerecicio2.Domain.IElectric;
import com.ejerecicio2.Domain.Pokemon;

public class Pikachu extends Pokemon implements IElectric {

    public Pikachu(){

    }
    @Override
    public void attackTackle() {
        System.out.println("Picachu utilizó placaje");
    }

    @Override
    public void attackScratch() {
        System.out.println("Picachu utilizó arañazo");
    }

    @Override
    public void attackBait() {
        System.out.println("Picachu utilizó mordisco");
    }

    @Override
    public void attackThundershock() {
        System.out.println("Picachu utilizó impactrueno");
    }

    @Override
    public void attackThunderPunch() {
        System.out.println("Picachu utilizó puño eléctrico");
    }
}
