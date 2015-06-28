/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring.model;

/**
 *
 * @author alumno
 */
public class Musico {

    private String nombre;
    private Instrumento instrumento;
    private int canciones;

    public Musico(int canciones) {
        this.canciones = canciones;
    }

    public Musico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public void who() {

        System.out.println("soy un musico ;D ");

    }

}
