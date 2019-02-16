package com.souvik.bank.service;

import com.souvik.bank.model.Branch;
import org.springframework.stereotype.Service;

@Service
public interface BranchServiceDao {

    Branch getDetailsByIfsc(String ifsc);

}