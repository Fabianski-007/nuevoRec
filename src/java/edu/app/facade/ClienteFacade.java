/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.facade;

import edu.app.entity.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author naiba
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "RecepcionistaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    @Override
          public Cliente validarCliente( String emailIn, String passwordIn){
        
        try{
            
            Query qt = em.createQuery("SELECT c FROM Cliente c WHERE c.contrasenia = :passwordIn AND c.correo = :emailIn");
            qt.setParameter("passwordIn", passwordIn);
            qt.setParameter("emailIn", emailIn);
            return (Cliente) qt.getSingleResult();
        
        } catch (Exception e){
            System.out.println("edu.app.facade.ClienteFacade.validarCliente() " +e.getMessage());
            return new Cliente();
        }
    
    }
}
