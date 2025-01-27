package com.jsp.hibernate.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Movie m=new Movie();
    	m.setMovieId(1);
    	m.setMovieName("hlo");
    	m.setMovieDirector("tom");
    	m.setMovieRating(3);

    	
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
       et.begin();
        
        m.setMovieDirector("joy");
        em.merge(m);
        em.find(Movie.class, 1);
        
        em.persist(m);
        
        et.commit();
    	em.close();
    	emf.close();
    	

        
    }
}
