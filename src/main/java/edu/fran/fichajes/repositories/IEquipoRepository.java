package edu.fran.fichajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.fichajes.entities.Equipo;

public interface IEquipoRepository extends JpaRepository<Equipo, Long> {
    
}
