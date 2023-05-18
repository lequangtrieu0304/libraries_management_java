package com.libraries.BTL.dto.return_book;

public class ReturnDto {
    private Integer loan_id;

    public ReturnDto(Integer loan_id) {
        this.loan_id = loan_id;
    }

    public ReturnDto() {
    }

    public Integer getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(Integer loan_id) {
        this.loan_id = loan_id;
    }

}
