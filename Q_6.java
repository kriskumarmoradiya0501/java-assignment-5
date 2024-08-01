abstract class Person1 {
    abstract void accept();
    abstract void display();
}

class Employee1 extends Person1 {
    String emp_no;
    String emp_name;
    String emp_add;

    void accept() {
    }

    void accept(String emp_no, String emp_name, String emp_add) {
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.emp_add = emp_add;
    }

    void display() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Address: " + emp_add);
    }
}

class Worker1 extends Person1 {
    String work_no;
    String work_name;
    String work_add;

    void accept() {
    }

    void accept(String work_no, String work_name, String work_add) {
        this.work_no = work_no;
        this.work_name = work_name;
        this.work_add = work_add;
    }

    void display() {
        System.out.println("Worker Number: " + work_no);
        System.out.println("Worker Name: " + work_name);
        System.out.println("Worker Address: " + work_add);
    }
}

public class Q_6 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        Worker1 w = new Worker1();

        e.accept("22BCA090", "Harmin", "Ashirwad Hostel");
        w.accept("22BCA128", "Sahil", "Gurukul");

        e.display();
        w.display();
    }
}
