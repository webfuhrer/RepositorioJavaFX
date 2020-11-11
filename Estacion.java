/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocontaminacionretrofit;

/**
 *
 * @author FPMananaA
 */
public class Estacion {
    private String estacion_analizador_NO2, estacion_analizador_SO2, estacion_municipio, estacion_direccion_postal;

    public String getEstacion_analizador_NO2() {
        return estacion_analizador_NO2;
    }

    public void setEstacion_analizador_NO2(String estacion_analizador_NO2) {
        this.estacion_analizador_NO2 = estacion_analizador_NO2;
    }

    public String getEstacion_analizador_SO2() {
        return estacion_analizador_SO2;
    }

    public void setEstacion_analizador_SO2(String estacion_analizador_SO2) {
        this.estacion_analizador_SO2 = estacion_analizador_SO2;
    }

    public String getEstacion_municipio() {
        return estacion_municipio;
    }

    public void setEstacion_municipio(String estacion_municipio) {
        this.estacion_municipio = estacion_municipio;
    }

    public String getEstacion_direccion_postal() {
        return estacion_direccion_postal;
    }

    public void setEstacion_direccion_postal(String estacion_direccion_postal) {
        this.estacion_direccion_postal = estacion_direccion_postal;
    }

    @Override
    public String toString() {
        return "Estacion{" + "estacion_analizador_NO2=" + estacion_analizador_NO2 + " estacion_analizador_SO2=" + estacion_analizador_SO2 + ", estacion_municipio=" + estacion_municipio + " estacion_direccion_postal=" + estacion_direccion_postal + '}';
    }
    
}
