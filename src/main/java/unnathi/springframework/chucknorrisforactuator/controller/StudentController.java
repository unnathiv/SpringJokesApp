package unnathi.springframework.chucknorrisforactuator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unnathi.springframework.chucknorrisforactuator.model.Student;
import unnathi.springframework.chucknorrisforactuator.services.StudentService;

@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/studentId/{id}")
    public Student getStudentdetails(@PathVariable int id){
      return  studentService.getStudentDetailsById(id);

    }

    @PostMapping("/studentDetails")
    public boolean postStudentDetails(@RequestBody Student student){
        studentService.postStudentDetails(student);
        return true;
    }

    @DeleteMapping("/studentDetails/{id}")
    public String deleteStudentDetails(@PathVariable int id){
        studentService.deleteStudentDetailsById(id);
        return "deleted the user";
    }
}
