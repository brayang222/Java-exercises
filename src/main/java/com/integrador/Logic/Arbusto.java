package com.integrador.Logic;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean domestico;
    private String variedadArbusto;
    private String colorHojas;
    private double podar;

    public Arbusto() {
    }

    public Arbusto(String name, int altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto,
                   boolean domestico, String variedadArbusto, String colorHojas, double podar) {
        super(name, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.domestico = domestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.podar = podar;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public double getPodar() {
        return podar;
    }

    public void setPodar(double podar) {
        this.podar = podar;
    }

    @Override
    public void queSoy() {
        System.out.println("Hola, soy un arbusto");
    }
}
