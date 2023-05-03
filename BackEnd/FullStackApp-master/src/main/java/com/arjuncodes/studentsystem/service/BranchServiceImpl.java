package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Branch;
import com.arjuncodes.studentsystem.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public List<Branch> getAllBranchs() {
        return branchRepository.findAll();
    }
}
