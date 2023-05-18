package com.libraries.BTL.controller;

import com.libraries.BTL.dto.book_loan.LoanDto;
import com.libraries.BTL.model.Loan;
import com.libraries.BTL.service.impl.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookloan")
public class LoanController {
    @Autowired
    LoanServiceImpl bookLoanServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<Loan> createBookLoan(@RequestBody LoanDto loanDto){
        Loan loan = bookLoanServiceImpl.createBookLoan(loanDto);
        return new ResponseEntity<>(loan, HttpStatus.CREATED);
    }
}
