package unnathi.springframework.chucknorrisforactuator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unnathi.springframework.chucknorrisforactuator.model.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

     Optional<Student> findById(Integer id);

}
