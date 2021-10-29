package com.usb.appliga.modelo;

import java.io.Serializable;

public class Heroe implements Serializable {

    private String nombre;
    private int imagen;
    private String poder;

    public Heroe(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Heroe(String nombre, int imagen, String poder) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
}
