package com.hibernate.demo;

import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateDemo {
    public static void main(String[] args) {

        // Create Session Factory

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {

            // Create the objects
            // Instructor instructor = new Instructor("Chad", "Mosby",
            // "Mosby@dare2code.com");
            // InstructorDetail instructorDetail = new
            // InstructorDetail("http://www.dare2code.com/youtube", "Dare 2 Code");

            Instructor instructor = new Instructor("Barney", "Stinson", "Barney@please.com");
            InstructorDetail instructorDetail = new InstructorDetail("http://www.barney.com/youtube", "Suit Up");

            // Associate the objects
            instructor.setInstructorDetail(instructorDetail);

            // Create Transaction
            session.beginTransaction();

            // Because of cascade.all it will also save ins detail object
            System.out.println("Saving instructor: " + instructor);
            session.save(instructor);

            // Commit Transaction
            session.getTransaction().commit();

            System.out.println("Done !!");

        } finally {
            factory.close();
        }
    }
}
