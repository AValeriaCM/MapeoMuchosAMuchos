/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.entity.Libro;
import com.mycompany.interfaces.LibroDosFacadeLocal;
import com.mycompany.entity.LibroDos;
import com.mycompany.interfaces.LibroFacadeLocal;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 *
 * @author angie
 */
@Stateless
public class LibroDosFacade extends AbstractFacade<LibroDos> implements LibroDosFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_MappingManyToMany-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    ModelMapper mp = new ModelMapper();
    
    @EJB
    LibroFacadeLocal libroFacade;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroDosFacade() {
        super(LibroDos.class);
    }
    
    @Override
    public List<LibroDos> reporteAutor(int id){
        TypedQuery<Libro> cons = em.createNamedQuery("reporte_libros", Libro.class);
        cons.setParameter("autorId", id);
        Type listType = new TypeToken<List<LibroDos>>() {}.getType();
        List<LibroDos> listaReporte = mp.map(cons.getResultList(), listType);
        return listaReporte;
    }
    
    @Override
    public List<LibroDos> filtroLibro(int id){
        List<Libro> obtLibros= libroFacade.findAll();
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
        Type listType = new TypeToken<List<LibroDos>>() {}.getType();
        List<LibroDos> listaLibros = mp.map(tempLibro, listType);
        return listaLibros;
    }
    
}
