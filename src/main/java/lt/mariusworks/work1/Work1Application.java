package lt.mariusworks.work1;

import lombok.RequiredArgsConstructor;
import lt.mariusworks.work1.services.SchoolService;
import lt.mariusworks.work1.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RequiredArgsConstructor
@SpringBootApplication
public class Work1Application {

    private final SchoolService schoolService;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(Work1Application.class, args);
    }
}
