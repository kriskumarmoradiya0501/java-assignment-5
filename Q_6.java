import java.util.Scanner;

abstract class Person2 {
    abstract void accept();
    abstract void display();
}

class Employee2 extends Person2 {
    String emp_no;
    String emp_name;
    String address;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        emp_no = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.nextLine();
        System.out.print("Enter Employee Address: ");
        address = scanner.nextLine();
    }

    void display() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Address: " + address);
    }
}

class Worker2 extends Person2 {
    String name;
    int working_hour;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Worker Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Working Hours: ");
        working_hour = scanner.nextInt();
    }

    void display() {
        System.out.println("Worker Name: " + name);
        System.out.println("Working Hours: " + working_hour);
    }
}

public class Q_6 {
    public static void main(String[] args) {
        Person2 employee = new Employee2();
        Person2 worker = new Worker2();

        System.out.println("Enter Employee Details:");
        employee.accept();
        System.out.println("\nEmployee Details:");
        employee.display();

        System.out.println("\nEnter Worker Details:");
        worker.accept();
        System.out.println("\nWorker Details:");
        worker.display();
    }
}
