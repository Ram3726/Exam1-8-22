package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {


        Employee emp1 = new Employee("Hari", 1000);
        Employee emp2 = new Employee("sri", 300);
        Employee emp3 = new Employee("ravi", 1000);
        Employee emp4 = new Employee("raj", 200);
        Employee emp5 = new Employee("Ravin", 1000);


        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);


        Collections.sort(employees);

        for(Employee empDetails : employees){
            System.out.println(empDetails.getName());
        }


    }


}