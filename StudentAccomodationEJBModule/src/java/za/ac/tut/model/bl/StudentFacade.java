/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Student;

/**
 *
 * @author Hello
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentAccomodationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }


    @Override
public Student findUsername(String email) {
    try {
        return em.createQuery("SELECT s FROM Student s WHERE s.email = :email", Student.class)
                 .setParameter("email", email)
                 .getSingleResult();
    } catch (NoResultException e) {
        return null;
    }
}

    
}
