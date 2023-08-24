package com.ejerecicio2.Names;

import com.ejerecicio2.Domain.IPlant;
import com.ejerecicio2.Domain.Pokemon;

public class Bulbasur extends Pokemon implements IPlant {

    public Bulbasur(){

    }
    @Override
    public void attackTackle() {
        System.out.println("bulbasur utilizó placaje");
    }

    @Override
    public void attackScratch() {
        System.out.println("bulbasur utilizó arañazo");
    }

    @Override
    public void attackBait() {
        System.out.println("bulbasur utilizó Mordisco");
    }

    @Override
    public void attackSewerSystem() {
        System.out.println("bulbasur utilizó drenaje");
    }

    @Override
    public void attackParalyze() {
        System.out.println("bulbasur utilizó paralizar");
    }
}
