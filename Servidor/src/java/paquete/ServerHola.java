/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;

/**
 *
 * @author junio
 */
@WebService(serviceName = "ServerHola")
public class ServerHola {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
               // TODO add your handling code here:
          EntityManager em;
        EntityManagerFactory emf;
        emf = javax.persistence.Persistence.createEntityManagerFactory("ServidorPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        //-Buscar----------------------------------------
        Curso c = em.find(Curso.class,txt.toUpperCase());
        if(c != null){
        txt =c.getDescripcion();
        }else{
            txt = "No se encontró el código ";
        }
        
        
        return "Resultado: " + txt + " !";
    }
}
