package com.keyin.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public Iterable<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student Student) {
        return studentService.addStudent(Student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        return studentService.deleteStudentById(id);
    }

    @GetMapping("/search")
    public Iterable<Student> searchStudentsByGrade(@RequestParam String grade) {
        return studentService.searchStudentsByGrade(grade);
    }
}
