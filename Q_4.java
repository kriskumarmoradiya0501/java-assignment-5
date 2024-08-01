/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */

class Employee{
    int number;
    String name;
    float salary;
    Employee(int number,String name,float salary){
        this.number=number;
        this.name= name;
        this.salary=salary;
    }
}
class Calculate extends Employee {
    String dep_name;
    float incentive;
    Calculate(int number,String name,float salary,String dep_name,float incentive){
        super(number,name,salary);
        this.dep_name=dep_name;
        this.incentive = incentive;
    }
    void display(){
        System.out.println("Employee Number : "+super.number);
        System.out.println("Name : "+super.name);
        System.out.println("Salary : "+super.salary);
        System.out.println("Department name : "+dep_name);
        System.out.println("Employee incentive : "+incentive);
        System.out.println("Total Salary : "+(super.salary+incentive));
    }
}

public class Q_4 {
    public static void main(String[] args) {
        Calculate c = new Calculate(136, "Krish", 250000.0f, "BCAA", 2000.0f);
        c.display();
    }
}
