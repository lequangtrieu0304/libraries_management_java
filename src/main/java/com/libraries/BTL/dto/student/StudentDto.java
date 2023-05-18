package com.libraries.BTL.dto.student;
import com.libraries.BTL.model.Loan;

import java.util.List;

public class StudentDto {
    private Integer msv;
    private String name;
    private String address;

    private List<Loan> loans;
    public StudentDto(Integer msv, String name, String address) {
        this.msv = msv;
        this.name = name;
        this.address = address;
    }

    public StudentDto() {
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

}
