package com.hib.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Alien student = new Alien();
        student.setAid(1);
        student.setAlienme("Ram");
        student.setColour("Red");


        // Steps to create session in hibernate
        Configuration con = new Configuration().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        session.save(student);  //Code to save data
        student = (Alien) session.get(Alien.class,1); //Code helps us to fetch the data from DB using Hibernate
        Transaction tx = session.beginTransaction();
        tx.commit();
        sessionFactory.close();

//        try {
//            // Create the SessionFactory from hibernate.cfg.xml
//            SessionFactory sessionFactory =new Configuration().addAnnotatedClass(Alien.class).buildSessionFactory();
//            System.out.println("SessionFactory created successfully.");
//
//            // Your application logic here...
//
//            // Clean up
//            sessionFactory.close();
//        } catch (Throwable ex) {
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }

    }
}
