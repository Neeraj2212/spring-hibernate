package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {
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

            // Create Transaction
            session.beginTransaction();

            // Get instructor by primary key
            int instructor_id = 1;
            Instructor instructor = session.get(Instructor.class, instructor_id);

            System.out.println("Found Instructor: " + instructor);

            // delete the instructor
            // NOTE :- It will also delete instructor detail object assicated with it

            if (instructor != null) {
                System.out.println("Deleting the instructor: " + instructor);
                session.delete(instructor);
            }

            // Commit Transaction
            session.getTransaction().commit();

            System.out.println("Done !!");

        } finally {
            factory.close();
        }
    }
}
