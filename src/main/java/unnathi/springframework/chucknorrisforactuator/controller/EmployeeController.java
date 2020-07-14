package unnathi.springframework.chucknorrisforactuator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unnathi.springframework.chucknorrisforactuator.model.Employee;
import unnathi.springframework.chucknorrisforactuator.repositories.EmployeeRepository;
import unnathi.springframework.chucknorrisforactuator.services.EmployeeService;

@RequestMapping
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/EmployeeId/{id}")
    public Employee getEmployeeDetailsById(@PathVariable int employeeId){
        return employeeService.getEmployeeById(employeeId);

    }
}
