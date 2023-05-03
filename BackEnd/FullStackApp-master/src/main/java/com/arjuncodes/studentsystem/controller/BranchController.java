package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Branch;

import com.arjuncodes.studentsystem.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Branch")
@CrossOrigin
public class BranchController {
    @Autowired
    private BranchService branchService;

    @PostMapping("/add")
    public String add(@RequestBody Branch branch){
    	branchService.saveBranch(branch);
        return "New Branch is added";
    }

    @GetMapping("/getAll")
    public List<Branch> list(){
        return branchService.getAllBranchs();
    }
}
