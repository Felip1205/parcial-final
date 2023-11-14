package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Equipo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private int copasInternacionales;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setCopasInternacionales(int copasInternacionales) {
        this.copasInternacionales = copasInternacionales;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public int getCopasInternacionales() {
        return copasInternacionales;
    }
    public Long getId() {
        return id;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public String getNombre() {
        return nombre;
    }
}