package edu.fran.fichajes.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "fichajes")

public class Fichaje {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne 
    @JoinColumn (name = "jugador_id")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn (name = "equipo_id")
    private Equipo equipo;

    public Fichaje() {
    }

    public Fichaje(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fichaje [id=" + id + ", fecha=" + fecha + "]";
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    

    

    
}
