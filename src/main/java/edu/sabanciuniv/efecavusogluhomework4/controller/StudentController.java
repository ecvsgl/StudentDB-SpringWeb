package edu.sabanciuniv.efecavusogluhomework4.controller;

import edu.sabanciuniv.efecavusogluhomework4.model.Student;
import edu.sabanciuniv.efecavusogluhomework4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {return studentService.getAllStudents();}

    @PostMapping("/students")
    public  Student addNewStudent(@RequestBody Student student) { return studentService.addNewStudent(student);}

    @PutMapping("/students")
    public Student updateExistingStudent (@RequestBody Student student) {return studentService.updateExistingStudent(student);}

    @DeleteMapping("/students")
    public void deleteExistingStudent(@RequestBody Student student) {studentService.deleteExistingStudent(student);}

    @GetMapping("/students/{student_id}")
    public Optional<Student> getStudentWithId(@PathVariable int student_id) {return studentService.getStudentWithId(student_id);}
}
