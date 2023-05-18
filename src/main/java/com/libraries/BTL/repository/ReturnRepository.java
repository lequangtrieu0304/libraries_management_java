package com.libraries.BTL.repository;

import com.libraries.BTL.model.Book;
import com.libraries.BTL.model.Loan;
import com.libraries.BTL.model.ReturnBook;
import com.libraries.BTL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnRepository extends JpaRepository<ReturnBook, Integer> {
    ReturnBook findByLoan(Loan loan);
}
