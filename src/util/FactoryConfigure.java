package util;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigure {
    private static FactoryConfigure factoryConfigure;
    private SessionFactory sessionFactory;
    private FactoryConfigure(){
        Configuration configuration = new Configuration().addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();

    }
    public static FactoryConfigure getInstance(){
        return (factoryConfigure==null)?factoryConfigure=new FactoryConfigure():factoryConfigure;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
