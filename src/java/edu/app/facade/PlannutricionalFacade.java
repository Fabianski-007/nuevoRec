/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.facade;

import edu.app.entity.Plannutricional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author naiba
 */
@Stateless
public class PlannutricionalFacade extends AbstractFacade<Plannutricional> implements PlannutricionalFacadeLocal {

    @PersistenceContext(unitName = "RecepcionistaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlannutricionalFacade() {
        super(Plannutricional.class);
    }
    
}