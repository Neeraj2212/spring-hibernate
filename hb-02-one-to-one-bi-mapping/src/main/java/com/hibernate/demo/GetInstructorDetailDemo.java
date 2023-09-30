package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {
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

            // Get the instructor detail object
            int instructor_detail_id = 25;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, instructor_detail_id);

            // Print instructor detail
            System.out.println("\nInstructor Detail: " + instructorDetail);

            // Print the associated instructor
            // NOTE:- This is not defined in table schema it is handled by hibernate
            // If the instruction detail is null, below line will throw nullPointerException
            System.out.println("Assocated Instructor: " + instructorDetail.getInstructor());

            // Commit Transaction
            session.getTransaction().commit();

            System.out.println("Done !!\n");

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {
            // Hanlde Connection Leak
            session.close();
            factory.close();
        }
    }
}
