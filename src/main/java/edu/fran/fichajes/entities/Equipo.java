package edu.fran.fichajes.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "equipos")

public class Equipo {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @Column (name = "nombre_equipo")
    private String nombre;

    @OneToMany (mappedBy = "equipo")
    private List<Fichaje> fichajes = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo [id=" + id + ", nombre=" + nombre + "]";
    }

    public List<Fichaje> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<Fichaje> fichajes) {
        this.fichajes = fichajes;
    }

    


    
}
