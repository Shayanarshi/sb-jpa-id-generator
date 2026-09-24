package in.ashokit.runner;

import in.ashokit.model.Student;
import in.ashokit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    StudentRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        saveStudent();
    }
    private  void saveStudent(){
        Student student = new Student();
        student.setStudentName("Jack");
        student.setMarks(599);

        Student student2 = new Student();
        student2.setStudentName("Turner");
        student2.setMarks(528);

//        repository.saveAll(List.of(student,student2));

        repository.save(student);
        repository.save(student2);
    }
}
