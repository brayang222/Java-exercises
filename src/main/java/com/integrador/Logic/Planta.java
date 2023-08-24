package com.integrador.Logic;

public abstract class Planta {
    private String name;
    private int altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }
    public Planta(String name, int altoTallo, boolean tieneHojas, String climaIdeal) {
        this.name = name;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(int altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void queSoy();
}
