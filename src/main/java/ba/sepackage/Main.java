package ba.sepackage;

import ba.sepackage.data.ConnectionManager;
import ba.sepackage.view.EmployeeView;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // User requirements
        // 1. Input employee data (Name, address, phonenumber, birthday, function, dpt, startdate_contract, salary_per_hour, extra_legal_benefits)
        // 2. Store employee data in db
        // 3. View/read employee data
        // 4. Update/Change employee data
        // 5. Delete/Fire/Disemploy an employee
        // 6. Hire/Add employee
        // 7. Calculate salary
        // 8. Add, update, delete worked hours per employee
        // 9. View worked hours per employee

        try {
            ConnectionManager.getInstance().init();
            Connection connection = ConnectionManager.getInstance().getConnection();


            ConnectionManager.getInstance().close();
        } catch (SQLException e) {
            System.out.println("Couldn't create connection to database.... Check yourself, before you wreck yourself... - Public Enemy");
        }
    }
}
