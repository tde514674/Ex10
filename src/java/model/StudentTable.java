/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Student;

/**
 *
 * @author Tinip
 */
public class StudentTable {
    
     public static List<Student> findStudentsById(int id) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex10PU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findById");
        query.setParameter("id", id);
        List<Student> studentList = (List<Student>) query.getResultList();
        return studentList;
    }
     
    public static List<Student> findAllStudents() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex10PU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findAll");
        List<Student> studentList = (List<Student>) query.getResultList();
        return studentList;
    }
    
    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex10PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
