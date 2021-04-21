/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.facade;

import edu.app.entity.Ordencompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author naiba
 */
@Local
public interface OrdencompraFacadeLocal {

    void create(Ordencompra ordencompra);

    void edit(Ordencompra ordencompra);

    void remove(Ordencompra ordencompra);

    Ordencompra find(Object id);

    List<Ordencompra> findAll();

    List<Ordencompra> findRange(int[] range);

    int count();
    
}
