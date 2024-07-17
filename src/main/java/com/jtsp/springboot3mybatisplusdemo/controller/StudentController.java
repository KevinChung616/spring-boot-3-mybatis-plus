package com.jtsp.springboot3mybatisplusdemo.controller;

import com.jtsp.springboot3mybatisplusdemo.entity.Student;
import com.jtsp.springboot3mybatisplusdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentMapper.selectList(null));
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentMapper.selectById(id));
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        studentMapper.insert(student);
        return ResponseEntity.ok("create success");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteStudentById(@PathVariable Long id) {
        studentMapper.deleteById(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping
    public ResponseEntity<String> updateStudentById(@RequestBody Student student) {
        studentMapper.updateById(student);
        return ResponseEntity.ok("update success");
    }
 }
