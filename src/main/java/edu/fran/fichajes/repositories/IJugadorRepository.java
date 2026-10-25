package edu.fran.fichajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.fichajes.entities.Jugador;

public interface IJugadorRepository extends JpaRepository<Jugador, Long> {
    
}
