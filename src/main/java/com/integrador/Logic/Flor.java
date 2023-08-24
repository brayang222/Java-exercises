package com.integrador.Logic;

public class Flor extends Planta{
    private String colorPetalos;
    private int promedioPetalos;
    private String colorPiso;
    private String variedadFlor;
    private String estacion;

    public Flor() {
    }
    public Flor(String colorPetalos, int promedioPetalos, String colorPiso, String variedadFlor, String estacion) {
        this.colorPetalos = colorPetalos;
        this.promedioPetalos = promedioPetalos;
        this.colorPiso = colorPiso;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(int promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    public String getColorPiso() {
        return colorPiso;
    }

    public void setColorPiso(String colorPiso) {
        this.colorPiso = colorPiso;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void queSoy() {
        System.out.println("Hola, soy una flor");
    }
}
