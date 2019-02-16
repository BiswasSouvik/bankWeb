package com.souvik.bank.repository;

import com.souvik.bank.model.BankBranch;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankBranchRepo extends PagingAndSortingRepository<BankBranch, String> {

    Optional<List<BankBranch>> findByBankNameAndCity(String bankName, String City, Pageable pageable);

}