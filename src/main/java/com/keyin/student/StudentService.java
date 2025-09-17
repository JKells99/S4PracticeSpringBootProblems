package com.keyin.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        return "Student with id " + id + " has been deleted.";
    }

    public Iterable<Student> searchStudentsByGrade(String grade) {

        return studentRepository.findStudentsByGrade(grade);
    }
}
