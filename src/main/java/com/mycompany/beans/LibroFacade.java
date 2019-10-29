/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.entity.Autor;
import com.mycompany.interfaces.LibroFacadeLocal;
import com.mycompany.entity.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author angie
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro> implements LibroFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingManyToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroFacade() {
        super(Libro.class);
    }
    
    @Override
    public List<Libro> reporteAutor(int id){
        TypedQuery<Libro> cons = em.createNamedQuery("reporte_libros", Libro.class);
        cons.setParameter("autorId", id);
        return cons.getResultList();
    }
    
    @Override
    public List<Libro> filtroLibro(int id){
        List<Libro> obtLibros= findAll();
        TypedQuery<Libro> cons = em.createNamedQuery("reporte_libros", Libro.class);
        cons.setParameter("autorId", id);
        List<Libro> relacionados = cons.getResultList();
        List<Libro> tempLibro = new ArrayList();
        
        if(obtLibros.size() > relacionados.size()){
            for (Libro t1 : obtLibros) {
                if(!relacionados.contains(t1)){
                    tempLibro.add(t1);
                }
            }
        }
        return tempLibro;
    }
    
}
