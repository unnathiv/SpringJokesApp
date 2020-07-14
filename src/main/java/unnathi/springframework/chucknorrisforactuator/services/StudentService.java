package unnathi.springframework.chucknorrisforactuator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import unnathi.springframework.chucknorrisforactuator.model.Student;
import unnathi.springframework.chucknorrisforactuator.repositories.StudentRepository;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentDetailsById(int id){

        if(studentRepository.findById(id).isPresent())
            return studentRepository.findById(id).get();

        return null;
    }

    public boolean postStudentDetails(Student student){
        studentRepository.save(student);
        return true;
    }

    public String deleteStudentDetailsById(int id){
        studentRepository.deleteById(id);
        return "deleted the user";
    }
}
