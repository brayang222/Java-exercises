package com.ejercico4.Domain;

import java.util.List;

public class Auto {
    private long id;
    private String marca;
    private String model;
   // private Proprietary proprietary; // esto crea una relacion 1 a 1, falta agregar en construct, get y set
    private List<Proprietary> listProprietary; // esto crea una relacion uno a muchos

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", listProprietary=" + listProprietary +
                '}';
    }

    public Auto(){
    }

    public Auto(long id, String marca, String model, List<Proprietary> listProprietary) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.listProprietary = listProprietary;
    }

    public Long getId(){
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }
    public String setMarca(String marca){
        this.marca = marca;
        return marca;
    }

    public String getModel(){
        return model;
    }
    public String setModel(String model){
        this.model = model;
        return model;
    }

   /* public Proprietary getProprietary() {
        return proprietary;
    }

    public void setProprietary(Proprietary proprietary) {
        this.proprietary = proprietary;
    }*/

    public List<Proprietary> getListProprietary() {
        return listProprietary;
    }

    public void setListProprietary(List<Proprietary> listProprietary) {
        this.listProprietary = listProprietary;
    }
}
