package lt.mariusworks.work1.controllers;

import lombok.AllArgsConstructor;
import lt.mariusworks.work1.entities.School;
import lt.mariusworks.work1.entities.Student;
import lt.mariusworks.work1.services.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping(value = "/schools")
@AllArgsConstructor
@RestController
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return this.schoolService.getAllSchools();
    }

    @GetMapping(value = "/{id}")
    public School getSchoolById(@PathVariable Long id) {
        System.out.println(id);
        return this.schoolService.getSchoolByIdOrThrow(id);
    }

    @GetMapping(value = "/{id}/students")
    public List<Student> getStudentsBySchoolId(@PathVariable Long id) {
        System.out.println(id);
        return this.schoolService.getSchoolByIdOrThrow(id).getStudents();
    }

    @GetMapping(value = "/{schoolId}/students/{studentId}")
    public Student getStudentBySchoolIdAndStudentId(@PathVariable Long schoolId, @PathVariable Long studentId) {
        return this.schoolService.getStudentBySchoolAndId(schoolId, studentId);
    }
}
