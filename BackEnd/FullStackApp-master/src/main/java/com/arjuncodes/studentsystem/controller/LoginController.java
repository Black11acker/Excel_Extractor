//package com.arjuncodes.studentsystem.controller;
//
//import com.arjuncodes.studentsystem.model.Login;
//
//import com.arjuncodes.studentsystem.service.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/Login")
//@CrossOrigin
//public class LoginController {
//    @Autowired
//    private LoginService loginService;
//
//    @PostMapping("/add")
//    public String add(@RequestBody Login login){
//    	loginService.saveLogin(login);
//        return "New Login is added";
//    }
//
//    @GetMapping("/getAll")
//    public List<Login> list(){
//        return loginService.getAllLogins();
//    }
//}
