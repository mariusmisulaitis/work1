package lt.mariusworks.work1.controllers;

import lombok.AllArgsConstructor;
import lt.mariusworks.work1.entities.Student;
import lt.mariusworks.work1.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RequestMapping (value = "/students")
@AllArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable Long id) {
        System.out.println(id);
        return this.studentService.getStudentByIdOrThrow(id);
    }

}
