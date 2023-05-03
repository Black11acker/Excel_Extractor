package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Branch;

import java.util.List;

public interface BranchService {
    public Branch saveBranch(Branch branch);
    public List<Branch> getAllBranchs();
}
