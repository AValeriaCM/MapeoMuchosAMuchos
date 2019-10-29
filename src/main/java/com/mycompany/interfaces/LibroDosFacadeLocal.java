/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Libro;
import com.mycompany.entity.LibroDos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author angie
 */
@Local
public interface LibroDosFacadeLocal {

    void create(LibroDos libroDos);

    void edit(LibroDos libroDos);

    void remove(LibroDos libroDos);

    LibroDos find(Object id);

    List<LibroDos> findAll();

    List<LibroDos> findRange(int[] range);

    int count();
    
    List<LibroDos> reporteAutor(int id);
    
    List<LibroDos> filtroLibro(int id);
    
}
