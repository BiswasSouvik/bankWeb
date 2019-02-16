package com.souvik.bank.repository;

import com.souvik.bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

    Optional<Bank> findByName(String name);
}