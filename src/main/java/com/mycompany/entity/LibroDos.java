/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "libro")
public class LibroDos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "nombre_libro")
    private String nombreLibro;
    
    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private Set<LibroAutor> listaLibros;

    public LibroDos() {
    }

    public LibroDos(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Set<LibroAutor> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Set<LibroAutor> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
}
