package com.ejerecicio2.Names;

import com.ejerecicio2.Domain.IWater;
import com.ejerecicio2.Domain.Pokemon;

public class Squirtel extends Pokemon implements IWater {

    public Squirtel(){

    }
    @Override
    public void attackTackle() {
        System.out.println("Squirtel utilizó placaje");
    }

    @Override
    public void attackScratch() {
        System.out.println("Squirtel utilizó arañazo");
    }

    @Override
    public void attackBait() {
        System.out.println("Squirtel utilizó mordisco");
    }

    @Override
    public void attackHydropump() {
        System.out.println("Squirtel utilizó hidrobomba");
    }

    @Override
    public void attackBubble() {
        System.out.println("Squirtel utilizó burbuja");
    }

    @Override
    public void attackWaterGun() {
        System.out.println("Squirtel utilizó pistola de agua");
    }
}
