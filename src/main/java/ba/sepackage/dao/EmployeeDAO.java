package ba.sepackage.dao;

import ba.sepackage.data.Employee;
import ba.sepackage.exceptions.NonUniqueResultException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAO {
    private Connection connection;

    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Employee> getAllEmployeesFromDB() {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Employees");

        List<Employee> result = new ArrayList<>();
        while (rs.next()) { // parsing
            Employee employee = new Employee();
            // add information from rs to employee (we don't have a table or properties.. so easy :) )
            result.add(employee);
        }

        return result;
    }


    public Optional<Employee> getEmployeeById(int id) throws NonUniqueResultException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM Employees WHERE id = ?");
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            Employee employee = new Employee();
            // add information from rs to employee (we don't have a table or properties.. so easy :) )
            if (rs.next()) throw new NonUniqueResultException("I'm afraid I can't let you do that Dave...");
            return Optional.of(employee);
        }
        return Optional.empty();
    }
}
