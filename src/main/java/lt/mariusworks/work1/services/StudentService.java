package lt.mariusworks.work1.services;

import lombok.RequiredArgsConstructor;
import lt.mariusworks.work1.entities.Student;
import lt.mariusworks.work1.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Student getStudentByIdOrThrow(Long id) {
        return this.studentRepository.findById(id).orElseThrow();
    }
}
