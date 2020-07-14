package unnathi.springframework.chucknorrisforactuator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int employeeId;
    private String employeeSalary;
    private int employeeAge;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(int employeeName) {
        this.employeeId = employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType='" + employeeId + '\'' +
                ", employeeSalary='" + employeeSalary + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }
}
