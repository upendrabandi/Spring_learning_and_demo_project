package com.luv2code.hibernate.demo;

import com.lu2code.com.hibernate.demo.entity.Instructor;
import com.lu2code.com.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session=factory.getCurrentSession();
        try {


            session.beginTransaction();
            int theId=1;
            Instructor tempInstructor=session.get(Instructor.class,theId);
            System.out.println("found instructor"+tempInstructor);
            if(tempInstructor!=null){
                System.out.println("deleting"+tempInstructor);
                session.delete(tempInstructor);

            }

            session.getTransaction().commit();
            System.out.println("done!");
        }
        finally {
            //session.close();
            factory.close();
        }

    }
}
