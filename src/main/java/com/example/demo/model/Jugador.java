package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private int numero;

    @ManyToOne
    @JoinColumn(name = "equipoSan_id")
    private Equipo equipo;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEquipoSan(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

}