package com.example.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Jugador;

public interface JugadorRepositorio extends JpaRepository<Jugador, Long> {
    
}