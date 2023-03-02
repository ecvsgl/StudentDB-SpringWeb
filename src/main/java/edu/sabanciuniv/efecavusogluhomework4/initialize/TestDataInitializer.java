package edu.sabanciuniv.efecavusogluhomework4.initialize;

import edu.sabanciuniv.efecavusogluhomework4.model.Student;
import edu.sabanciuniv.efecavusogluhomework4.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInitializer implements CommandLineRunner {

    private final StudentRepository studentRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if(studentRepository.count()==0){
            Student stu1 = new Student("Efe Cavusoglu", "CE", "2013", 3.56d);
            Student stu2 = new Student("Hale Cavusoglu", "SRP", "1987", 2.75d);
            Student stu3 = new Student("Selim Cavusoglu", "ARCH", "1984", 2.30d);
            Student stu4 = new Student("Yagmur Cavusoglu", "MED", "2023", 3.3d);
            Student stu5 = new Student("Nuri Cavusoglu", "CE", "1965", 2.9d);

            studentRepository.save(stu1);
            studentRepository.save(stu2);
            studentRepository.save(stu3);
            studentRepository.save(stu4);
            studentRepository.save(stu5);
        }
    }
}
