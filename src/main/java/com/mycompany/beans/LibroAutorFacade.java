/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.LibroAutorFacadeLocal;
import com.mycompany.entity.LibroAutor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author angie
 */
@Stateless
public class LibroAutorFacade extends AbstractFacade<LibroAutor> implements LibroAutorFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingManyToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroAutorFacade() {
        super(LibroAutor.class);
    }
    
}
