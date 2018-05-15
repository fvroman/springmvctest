package com.taiga.jdbc;

import com.taiga.jdbc.Entities.Course;
import com.taiga.jdbc.Entities.Student;
import com.taiga.jdbc.Entities.StudentDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Locale;


public class EagerLazyTester {
    public static void main(String[] args) {
        //TODO Выяснить как избавиться от этой хрени
        Locale.setDefault(Locale.ENGLISH);

        //Create Session Factory
        SessionFactory factory = new Configuration().
                configure().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(StudentDetail.class).
                addAnnotatedClass(Course.class).
                buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {
           long testId = 23;
            session.beginTransaction();

            Student student = session.get(Student.class, testId);

            session.getTransaction().commit();

            session.close();

            System.out.println("HERRRRRRRRRRRE I AM!!!");
            System.out.println(student.getCourses());

            //List<Student> students = session.createQuery("from Student").getResultList();
            //System.out.println(students);


            //session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
