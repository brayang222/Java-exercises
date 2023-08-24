package com.ejercico4.Domain;

public class Proprietary {

    private Long id;
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "Proprietary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Proprietary(){

    }

    public Proprietary(Long id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
