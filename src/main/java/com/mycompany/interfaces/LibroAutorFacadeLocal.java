/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.LibroAutor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author angie
 */
@Local
public interface LibroAutorFacadeLocal {

    void create(LibroAutor libroAutor);

    void edit(LibroAutor libroAutor);

    void remove(LibroAutor libroAutor);

    LibroAutor find(Object id);

    List<LibroAutor> findAll();

    List<LibroAutor> findRange(int[] range);

    int count();
    
}
