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
@Table
@NamedNativeQueries({
    @NamedNativeQuery(name = "vistaReporte", query = "select la.id, l.nombre_libro as libro, la.editorial from autor a join libro_autor la on la.id_autor = a.id join libro l on l.id = la.id_libro where a.id = ?1", resultClass = Vista.class)
})
public class Vista implements Serializable{
    @Id
    private int id;
    @Column
    private String libro;
    @Column
    private String editorial;

    public Vista() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
