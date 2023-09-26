package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
    public static void main(String[] args) {
        int studentId = 1;

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Student student = session.get(Student.class, studentId);

            // Change first name of first object in table
            student.setFirstName("Luffy");

            session.createQuery("update Student set email='jmd@gmail.com'").executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
