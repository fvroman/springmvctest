package com.taiga.jdbc;

import com.taiga.jdbc.Entities.Course;
import com.taiga.jdbc.Entities.Girl;
import com.taiga.jdbc.Entities.Student;
import com.taiga.jdbc.Entities.StudentDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Locale;

public class CreateGirlsAndStudents {
    public static void main(String[] args) {
        //TODO Выяснить как избавиться от этой хрени
        Locale.setDefault(Locale.ENGLISH);

        //Create Session Factory
        SessionFactory factory = new Configuration().
                configure().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(StudentDetail.class).
                addAnnotatedClass(Course.class).
                addAnnotatedClass(Girl.class).
                buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Girl girl1 = new Girl("Jessica");
            Girl girl2 = new Girl("Messy");
            Girl girl3 = new Girl("Lissy");

            Student student = new Student("Jimmy", "Big", "ne uzaet");
            Student student2 = new Student("Gaylord", "Big", "iamgay@gmail.com");
            Student student3 = new Student("Nasty", "Small", "ne uzaet");

            student.addGirl(girl1);
            student.addGirl(girl2);
            student.addGirl(girl3);

            student3.addGirl(girl3);

            session.save(student);
            session.save(student2);
            session.save(student3);

            session.save(girl1);
            session.save(girl2);
            session.save(girl3);

            session.getTransaction().commit();


        } finally {
            factory.close();
        }

    }
}
