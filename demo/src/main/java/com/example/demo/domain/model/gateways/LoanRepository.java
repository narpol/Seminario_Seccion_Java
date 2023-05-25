package com.example.demo.domain.model.gateways;

import com.example.demo.domain.model.Loan;

public interface LoanRepository {

    Loan saveLoan(Loan loan);
}
