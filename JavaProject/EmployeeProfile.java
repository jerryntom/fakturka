package Fakturka.JavaProject;

import java.util.ArrayList;

public class EmployeeProfile {
    private String employee_firstname;
    private String employee_lastname;
    private String date_of_birth;
    private int PESEL;
    private String role;
    private String tel_number;
    private String address;
    private String profile_name;

    public EmployeeProfile(String employee_firstname, String employee_lastname, String date_of_birth,
                           int PESEL, String role, String tel_number, String address, String profile_name) {
        this.employee_firstname = employee_firstname;
        this.employee_lastname = employee_lastname;
        this.date_of_birth = date_of_birth;
        this.PESEL = PESEL;
        this.role = role;
        this.tel_number = tel_number;
        this.address = address;
        this.profile_name = profile_name;
    }

    public int save_to_employee_database(Employees employees_database) {
        return 0;
    }

    public ArrayList<String> get_employee_data() {
        return null;
    }

    public int update_employee_data() {
        return 0;
    }
}
