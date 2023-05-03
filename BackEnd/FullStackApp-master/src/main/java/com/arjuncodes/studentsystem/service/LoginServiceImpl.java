//package com.arjuncodes.studentsystem.service;
//
//import com.arjuncodes.studentsystem.model.Login;
//import com.arjuncodes.studentsystem.repository.LoginRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class LoginServiceImpl implements LoginService {
//
//    @Autowired
//    private LoginRepository loginRepository;
//
//    @Override
//    public Login saveLogin(Login login) {
//        return loginRepository.save(login);
//    }
//
//    @Override
//    public List<Login> getAllLogins() {
//        return loginRepository.findAll();
//    }
//}
