package RelationalMapping;

import com.hib.DemoHibernate.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class MyApp
{
    public static void main( String[] args )
    {
        Laptop laptop = new Laptop();
        laptop.setLapTopId(101);
        laptop.setLaptopName("DELL");

        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setId(1);
        student.setName("Ram");
        student.setColour("Red");
        student.setLaptop(laptop);




        // Steps to create session in hibernate
        Configuration con = new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(student);  //Code to save data
        session.save(laptop); //Code to create and save laptop data
//        student = (Student) session.get(Student.class,1); //Code helps us to fetch the data from DB using Hibernate
        Transaction tx = session.beginTransaction();
        tx.commit();
        sessionFactory.close();


    }
}
