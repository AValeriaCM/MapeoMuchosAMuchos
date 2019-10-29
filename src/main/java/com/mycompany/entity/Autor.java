/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "autor")
public class Autor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column (name = "nombre_autor")
    private String nombreAutor;
    
    @JoinTable(name = "libro_autor", 
            joinColumns = @JoinColumn(name = "id_autor", nullable = false), 
            inverseJoinColumns = @JoinColumn(name = "id_libro", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Libro> listaLibro;
    

    public Autor() {
    }

    public Autor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public List<Libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(List<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
    
    
    
}
