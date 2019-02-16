package com.souvik.bank.service.daoimpl;

import com.souvik.bank.exception.ResourceNotFoundException;
import com.souvik.bank.model.BankBranch;
import com.souvik.bank.repository.BankBranchRepo;
import com.souvik.bank.service.BankBranchServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bankBranchServiceDao")
public class BankBranchServiceDaoImpl implements BankBranchServiceDao {
    private static final Logger logger = LoggerFactory.getLogger(BankBranchServiceDaoImpl.class);

    @Autowired
    private BankBranchRepo bankBranchRepo;

    @Override
    public List<BankBranch> getByNameAndCity(String bankName, String city, int page) {
        Optional<List<BankBranch>> bankBranches = bankBranchRepo.findByBankNameAndCity(bankName, city,
                PageRequest.of(page,10, Sort.by("ifsc").ascending()));
        logger.debug("getByNameAndCity: Returned list");
        return bankBranches.orElseThrow(() -> new ResourceNotFoundException("No branches found with name: "
                + bankName + " in city: " + city));
    }
}