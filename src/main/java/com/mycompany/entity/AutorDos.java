/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "autor")
public class AutorDos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column (name = "nombre_autor")
    private String nombreAutor;
    
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private Set<LibroAutor> listaAutores = new HashSet();

    public AutorDos() {
    }

    public AutorDos(String nombreAutor) {
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

    public Set<LibroAutor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(Set<LibroAutor> listaAutores) {
        this.listaAutores = listaAutores;
    }
    
}
