package com.taiga.jdbc;

import com.taiga.jdbc.Entities.Course;
import com.taiga.jdbc.Entities.Student;
import com.taiga.jdbc.Entities.StudentDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Locale;


public class CreateStudentDemo {
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
            Student student = new Student("fdf", "ss" +
                    "", "mgagyx@mail.ru");

            student.setStudentDetail(new StudentDetail("gfg"));
            Course bukaCourse = new Course("Buka");
            Course rukaCourse = new Course("Ruka");

            student.addCourse(bukaCourse);
            student.addCourse(rukaCourse);
            session.beginTransaction();
            System.out.println("saving " + student);
            session.save(student);
            session.save(bukaCourse);
            session.save(rukaCourse);

            session.getTransaction().commit();

            System.out.println("NEW STUDENT IS " + student);
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("GETTING STUDENT" + student.getStudentId());
            Student sameStudent = session.get(Student.class, student.getStudentId());
            System.out.println("GOT THIS GUY" + sameStudent);

            //List<Student> students = session.createQuery("from Student").getResultList();
            //System.out.println(students);


            //session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
