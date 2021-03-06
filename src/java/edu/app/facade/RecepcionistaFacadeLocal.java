/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.facade;

import edu.app.entity.Recepcionista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author naiba
 */
@Local
public interface RecepcionistaFacadeLocal {

    void create(Recepcionista recepcionista);

    void edit(Recepcionista recepcionista);

    void remove(Recepcionista recepcionista);

    Recepcionista find(Object id);

    List<Recepcionista> findAll();

    List<Recepcionista> findRange(int[] range);

    int count();
    
}
