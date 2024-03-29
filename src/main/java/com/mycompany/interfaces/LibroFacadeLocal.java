/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Autor;
import com.mycompany.entity.Libro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author angie
 */
@Local
public interface LibroFacadeLocal {

    void create(Libro libro);

    void edit(Libro libro);

    void remove(Libro libro);

    Libro find(Object id);

    List<Libro> findAll();

    List<Libro> findRange(int[] range);

    int count();
    
    List<Libro> reporteAutor(int id);
    
    List<Libro> filtroLibro(int id);
    
}
