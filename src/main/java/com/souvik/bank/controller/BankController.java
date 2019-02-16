package com.souvik.bank.controller;

import com.souvik.bank.model.BankBranch;
import com.souvik.bank.model.Branch;
import com.souvik.bank.service.BankBranchServiceDao;
import com.souvik.bank.service.BranchServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banks")
class BankController {
    private static final Logger logger = LoggerFactory.getLogger(BankController.class);

    @Autowired
    private BankBranchServiceDao bankBranchServiceDao;
    @Autowired
    private BranchServiceDao branchServiceDao;

    @RequestMapping(value = "/{ifsc}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Branch getBranchByIfsc(@PathVariable(name = "ifsc") String ifsc) {
        logger.info("getBranchByIfsc: returned branch with ifsc {}", ifsc);
        return branchServiceDao.getDetailsByIfsc(ifsc);
    }

    @RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
    public List<BankBranch> getByBankNameAndCity(@RequestParam("name") String name,
                                                 @RequestParam("city") String city,
                                                 @RequestParam("page") int page) {
        logger.info("getByBankNameAndCity: returned branches of bank {} in city {} of page: {}", name, city, page);
        return bankBranchServiceDao.getByNameAndCity(name, city, page);
    }
}
