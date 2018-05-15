package com.taiga.jdbc.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "girls")
public class Girl {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GIRLS_SEQ")
    @SequenceGenerator(name = "GIRLS_SEQ", sequenceName = "GIRLS_SEQ", allocationSize = 1, initialValue = 1)
    @Column(name = "girl_id")
    private long girlId;

    @Column(name = "girl_name")
    private String girlName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "student_girls",
            joinColumns = @JoinColumn(name = "girl_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    public Girl() {

    }

    public Girl(String girlName) {
        this.girlName = girlName;
    }

    public long getGirlId() {
        return girlId;
    }

    public void setGirlId(long girlId) {
        this.girlId = girlId;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "girlId=" + girlId +
                ", girlName='" + girlName + '\'' +
                ", students=" + students +
                '}';
    }
}
