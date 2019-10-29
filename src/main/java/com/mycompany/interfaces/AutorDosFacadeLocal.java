/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.AutorDos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author angie
 */
@Local
public interface AutorDosFacadeLocal {

    void create(AutorDos autorDos);

    void edit(AutorDos autorDos);

    void remove(AutorDos autorDos);

    AutorDos find(Object id);

    List<AutorDos> findAll();

    List<AutorDos> findRange(int[] range);

    int count();
    
}
