package com.libraries.BTL.service.impl;

import com.libraries.BTL.dto.book_loan.LoanDto;
import com.libraries.BTL.exception.BaseException;
import com.libraries.BTL.model.Book;
import com.libraries.BTL.model.Loan;
import com.libraries.BTL.model.Student;
import com.libraries.BTL.repository.LoanRepository;
import com.libraries.BTL.repository.BookRepository;
import com.libraries.BTL.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImpl {
    @Autowired
    LoanRepository loanRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    StudentRepository studentRepository;
    public Loan createBookLoan(LoanDto loanDto) {
        Optional<Book> optionalBook = bookRepository.findById(loanDto.getBook_id());
        Optional<Student> optionalStudent = studentRepository.findById(loanDto.getStudent_id());
        if(optionalBook.isEmpty()){
            throw new BaseException("Khong ton tai san pham");
        }
        else if(optionalStudent.isEmpty()){
            throw new BaseException("Khong ton tai student");
        }
        else if(optionalBook.get().getQuantity() <= 0){
            throw new BaseException(optionalBook.get().getNameBook() + " da het");
        }

        Loan loan = new Loan();
        loan.setPayDate(loanDto.getPayDate());
        loan.setBorrowDate();
        loan.setBook(optionalBook.get());
        loan.setStudent(optionalStudent.get());
        loan.setStatus("false");
        loanRepository.save(loan);

        int updateQuantity = optionalBook.get().getQuantity() - 1;
        optionalBook.get().setQuantity(updateQuantity);
        bookRepository.save(optionalBook.get());
        return loan;
    }
}
