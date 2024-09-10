package Fakturka.JavaProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Employees {
    private ArrayList<EmployeeProfile> employees_database = new ArrayList<EmployeeProfile>();

    public int load_employees_database(String database_filename) {
        return 0;
    }

    public int save_employees_database(String database_filename) {
        return 0;
    }

    public EmployeeProfile find_employee(String profile_name) {
        return null;
    }

    public int add_employee_to_database(EmployeeProfile employee_profile) {
        return 0;
    }

    public int remove_employee_from_database(String profile_name) {
        return 0;
    }
}
