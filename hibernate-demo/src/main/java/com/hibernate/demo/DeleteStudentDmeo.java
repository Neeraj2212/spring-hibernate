package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDmeo {
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

            // Delete student object of id 1
            session.delete(student);

            session.createQuery("delete from Student where id = 2").executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
