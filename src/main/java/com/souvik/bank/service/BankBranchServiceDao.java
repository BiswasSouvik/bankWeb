package com.souvik.bank.service;

import com.souvik.bank.model.BankBranch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankBranchServiceDao {
    List<BankBranch> getByNameAndCity(String bankName, String city, int page);
}
