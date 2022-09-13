package com.example.myapp_1;

public class Mes {
    private Integer numero;
    private String Nombre;

    public Mes(){

    }

    public Mes(Integer numero, String nombre){
        this.numero= numero;
        this.Nombre=nombre;

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumeroMes(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "numeroMes=" + numero +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
