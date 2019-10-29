/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.AutorDosFacadeLocal;
import com.mycompany.entity.AutorDos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author angie
 */
@Stateless
public class AutorDosFacade extends AbstractFacade<AutorDos> implements AutorDosFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingManyToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutorDosFacade() {
        super(AutorDos.class);
    }
    
}
