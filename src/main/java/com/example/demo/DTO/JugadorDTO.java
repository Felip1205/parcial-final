package com.example.demo.DTO;

public class JugadorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int numero;
    private Long equipoId;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Long getEquipoId() {
        return equipoId;
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