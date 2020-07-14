package unnathi.springframework.chucknorrisforactuator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unnathi.springframework.chucknorrisforactuator.model.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Optional<Employee> findByEmployeeId(int employeeId);
}
