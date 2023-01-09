package employee;

public class Employee implements Comparable<Employee> {

    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.salary == emp.getSalary()) {
            return 0;

        } else if (this.salary > emp.getSalary()) {
            return -1;
        } else {
            return 1;

        }
    }
}

