package com.example.demo.Repositorio;

import com.example.demo.model.Equipo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepositorio extends JpaRepository<Equipo, Long> {
    
}
