package com.libraries.BTL.service.impl;

import com.libraries.BTL.dto.return_book.ReturnDto;
import com.libraries.BTL.exception.BaseException;
import com.libraries.BTL.model.Book;
import com.libraries.BTL.model.Loan;
import com.libraries.BTL.model.ReturnBook;
import com.libraries.BTL.model.Student;
import com.libraries.BTL.repository.LoanRepository;
import com.libraries.BTL.repository.BookRepository;
import com.libraries.BTL.repository.ReturnRepository;
import com.libraries.BTL.repository.StudentRepository;
import com.libraries.BTL.ultis.CompareDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl {
    @Autowired
    LoanRepository loanRepository;
    @Autowired
    ReturnRepository returnRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CompareDate compareDate;
    public String createReturnBook(ReturnDto returnDto) {
        Loan loan = loanRepository
                        .findById(returnDto.getLoan_id())
                        .orElseThrow(() -> new BaseException("khong co phieu muon"));

        loan.setStatus("true");
        loanRepository.save(loan);

        ReturnBook returnBook = new ReturnBook();
        returnBook.setReturn_date();
        String returnDate = returnBook.getReturn_date();
        returnBook.setBook(loan.getBook());
        returnBook.setStudent(loan.getStudent());
        returnBook.setLoan(loan);
        returnRepository.save(returnBook);

        Book book = loan.getBook();
        book.setQuantity(book.getQuantity() + 1);
        bookRepository.save(book);

        String payDate = loan.getPayDate();
        if(compareDate.compare(returnDate, payDate) > 0 ){
            Student student = loan.getStudent();
            student.setFine(student.getFine() + 10.0);
            studentRepository.save(student);
        }
        return "success";
    }
}
