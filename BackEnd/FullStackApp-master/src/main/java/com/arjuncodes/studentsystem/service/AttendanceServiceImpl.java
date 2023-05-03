//package com.arjuncodes.studentsystem.service;
//
//import com.arjuncodes.studentsystem.model.Attendance;
//import com.arjuncodes.studentsystem.repository.AttendanceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AttendanceServiceImpl implements AttendanceService {
//
//    @Autowired
//    private AttendanceRepository attendanceRepository;
//
//    @Override
//    public Attendance saveAttendance(Attendance attendance) {
//        return attendanceRepository.save(attendance);
//    }
//
//    @Override
//    public List<Attendance> getAllAttendances() {
//        return attendanceRepository.findAll();
//    }
//}
