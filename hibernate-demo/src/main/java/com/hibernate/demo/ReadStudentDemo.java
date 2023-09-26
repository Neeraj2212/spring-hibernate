package com.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {

            // Create Student Object
            System.out.println("\nCreating New Student Object...");
            Student tempStudent = new Student("Monkey.D", "Luffy", "luffy@github.com");

            // Create Transaction
            session.beginTransaction();

            // Save Student Object
            System.out.println("Saving the Student Object");
            session.save(tempStudent);

            // Commit Transaction
            session.getTransaction().commit();
            System.out.println("Student saved with id: " + tempStudent.getId());

            session = factory.getCurrentSession();
            session.beginTransaction();

            // Retrive Student by ID
            System.out.println("\nFetching student with id: " + tempStudent.getId());

            Student myStudent = session.get(Student.class, tempStudent.getId());
            System.out.println("Get Complete: " + myStudent);

            session.getTransaction().commit();
            System.out.println("DONE! \n");

        } finally {
            factory.close();
        }
    }
}
