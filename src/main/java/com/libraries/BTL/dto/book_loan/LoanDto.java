package com.libraries.BTL.dto.book_loan;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoanDto {
    private String payDate;

    private Integer student_id;

    private Integer book_id;

    public LoanDto() {
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }
}
