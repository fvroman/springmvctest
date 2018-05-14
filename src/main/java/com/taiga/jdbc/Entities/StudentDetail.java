package com.taiga.jdbc.Entities;

import javax.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {

    public StudentDetail() {

    }

    public StudentDetail(String gender) {
        this.gender = gender;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DETAIL_SEQ")
    @SequenceGenerator(name = "DETAIL_SEQ", sequenceName = "DETAIL_SEQ", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private int id;


    @Column(name = "gender")
    private String gender;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
