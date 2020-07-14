package unnathi.springframework.chucknorrisforactuator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import unnathi.springframework.chucknorrisforactuator.model.Employee;
import unnathi.springframework.chucknorrisforactuator.repositories.EmployeeRepository;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeById(int employeeId){

        if(employeeRepository.findByEmployeeId(employeeId).isPresent())
        return employeeRepository.findByEmployeeId(employeeId).get();

        return null;

    }

  //  public Employee postEmployeeDetails
}
