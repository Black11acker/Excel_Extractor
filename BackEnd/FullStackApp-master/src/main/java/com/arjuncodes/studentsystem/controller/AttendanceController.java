//package com.arjuncodes.studentsystem.controller;
//
//import com.arjuncodes.studentsystem.model.Attendance;
//
//import com.arjuncodes.studentsystem.service.AttendanceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/Attendance")
//@CrossOrigin
//public class AttendanceController {
//    @Autowired
//    private AttendanceService attendanceService;
//
//    @PostMapping("/add")
//    public String add(@RequestBody Attendance attendance){
//    	attendanceService.saveAttendance(attendance);
//        return "New Attendance is added";
//    }
//
//    @GetMapping("/getAll")
//    public List<Attendance> list(){
//        return attendanceService.getAllAttendances();
//    }
//}
