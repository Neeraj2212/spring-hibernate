package com.hibernate.demo;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {

            // Create Transaction
            session.beginTransaction();

            System.out.println("All Students ");

            List<Student> allStudents = session.createQuery("from Student", Student.class).list();

            displayStudents(allStudents);

            System.out.println("\nStudents with last name Patil:");

            List<Student> queryStudents = session
                    .createQuery("from Student s where s.lastName = 'Patil'", Student.class).list();

            displayStudents(queryStudents);

            System.out.println("\nStudents with last name Duck or first name starts with Monkey:");

            queryStudents = session
                    .createQuery("from Student s where s.lastName = 'duck' OR s.firstName LIKE 'Monkey%'",
                            Student.class)
                    .list();

            displayStudents(queryStudents);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> allStudents) {
        for (Student student : allStudents) {
            System.out.println(student);
        }
        System.out.println();
    }
}
