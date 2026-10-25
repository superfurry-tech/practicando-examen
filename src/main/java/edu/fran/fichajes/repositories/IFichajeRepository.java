package edu.fran.fichajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.fichajes.entities.Fichaje;

public interface IFichajeRepository extends JpaRepository<Fichaje, Long> {
    
}
