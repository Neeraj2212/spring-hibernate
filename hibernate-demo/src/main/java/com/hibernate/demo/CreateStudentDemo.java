package com.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {
    public static void main(String[] args) {

        // Create Session Factory

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {

            // Create Student Object
            System.out.println("Creating New Student Object...");
            Student student = new Student("Neeraj", "Patil", "neeraj2212@github.com");

            // Create Transaction
            session.beginTransaction();

            // Save Student Object
            System.out.println("Saving the Student Object");
            session.save(student);

            // Commit Transaction
            session.getTransaction().commit();

            System.out.println("Done !!");

        } finally {
            factory.close();
        }
    }
}
