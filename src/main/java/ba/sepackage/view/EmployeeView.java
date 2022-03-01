package ba.sepackage.view;

import ba.sepackage.data.Employee;
import ba.sepackage.service.EmployeeService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class EmployeeView {
    private EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<Employee> getEmployees() {
        // a lot more code to do with presenting information....
        return employeeService.getAllEmployees();
    }

    public Optional<Employee> getEmployee(int id) {
        return employeeService.getEmployeeById(id);
    }

    public BigDecimal calculateSalary() {
        return null;
    }
}
