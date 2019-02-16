package com.souvik.bank.repository;

import com.souvik.bank.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchRepo extends JpaRepository<Branch, String> {

    Optional<Branch> findByIfsc(String ifsc);
}