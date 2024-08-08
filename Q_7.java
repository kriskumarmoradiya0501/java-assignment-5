class Employee3 {
    String emp_name;
    int emp_id;
    double salary;

    public Employee3(String emp_name, int emp_id, double salary) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

class Manager3 extends Employee3 {
    double travel_allo;
    double house_rent;

    public Manager3(String emp_name, int emp_id, double salary, double travel_allo, double house_rent) {
        super(emp_name, emp_id, salary);
        this.travel_allo = travel_allo;
        this.house_rent = house_rent;
    }

    @Override
    double getSalary() {
        return salary + travel_allo + house_rent;
    }
}

public class Q_7 {
    public static void main(String[] args) {
        Employee3 e = new Employee3("Krish", 101, 50000);
        Manager3 m = new Manager3("Smit", 102, 70000, 5000, 10000);

        System.out.println("Employee Salary: " + e.getSalary());
        System.out.println("Manager Salary: " + m.getSalary());
    }
}
