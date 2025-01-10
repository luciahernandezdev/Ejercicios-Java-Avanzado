package org.example.entities;

public class Auto {
    private int id;
    private String marca;
    private String modelo;
    private int kilometraje;

    public Auto(String marca, int id, String modelo, int kilometraje) {
        this.marca = marca;
        this.id = id;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString(){
        return "Auto{id=" + id + ", " +
                "marca='" + marca + "'," +
                " modelo='" + modelo + "'," +
                " kilometraje=" + kilometraje + "}";
    }
}
