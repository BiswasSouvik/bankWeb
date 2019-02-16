package com.souvik.bank.service.daoimpl;

import com.souvik.bank.exception.ResourceNotFoundException;
import com.souvik.bank.model.Branch;
import com.souvik.bank.repository.BranchRepo;
import com.souvik.bank.service.BranchServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("branchServiceDao")
public class BranchServiceDaoImpl implements BranchServiceDao {
    private static final Logger logger = LoggerFactory.getLogger(BranchServiceDaoImpl.class);

    @Autowired
    private BranchRepo branchRepo;

    @Override
    public Branch getDetailsByIfsc(String ifsc) {
        Optional<Branch> branch = branchRepo.findByIfsc(ifsc);
        logger.debug("getDetailsByIfsc: Returned list");
        return branch.orElseThrow(() -> new ResourceNotFoundException("No branch details found with IFSC: " + ifsc));
    }
}
