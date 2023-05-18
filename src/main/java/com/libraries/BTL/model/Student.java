package com.libraries.BTL.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "student_code")
    private Integer msv;
    private String name;
    private String address;
    private double fine = 0.0;
    public Student(Integer msv, String name, String address, double fine) {
        this.msv = msv;
        this.name = name;
        this.address = address;
        this.fine = fine;
    }

    public Student() {
    }

    public Integer getMsv() {
        return msv;
    }

    public void setMsv(Integer msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
