/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "libro_autor")
public class LibroAutor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_libro", nullable = false)
    private LibroDos libro;
    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private AutorDos autor;
    @Column
    private String editorial;

    public LibroAutor() {
    }

    public LibroAutor(LibroDos libro, AutorDos autor, String editorial) {
        this.libro = libro;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LibroDos getLibro() {
        return libro;
    }

    public void setLibro(LibroDos libro) {
        this.libro = libro;
    }

    public AutorDos getAutor() {
        return autor;
    }

    public void setAutor(AutorDos autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
