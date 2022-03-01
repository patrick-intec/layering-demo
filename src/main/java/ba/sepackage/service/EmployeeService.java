package ba.sepackage.service;

import ba.sepackage.dao.EmployeeDAO;
import ba.sepackage.data.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private EmployeeDAO dao;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.dao = employeeDAO;
    }

    public List<Employee> getAllEmployees() {
        return this.dao.getAllEmployeesFromDB(); // just placeholder, don't shoot me pliz
    }

    public Optional<Employee> getEmployeeById(int id) {
        return this.dao.getEmployeeById(id);
    }
}
