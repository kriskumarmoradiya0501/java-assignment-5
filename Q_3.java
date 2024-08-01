/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */

class Person{
    String Person_id;
    String name;
    Person(String Person_id,String name){
        this.Person_id=Person_id;
        this.name = name;
    }
    void dis(){
        System.out.println(Person_id+name);
    }
}
class Student extends Person{
    String course;
    float fees;
    Student(String Person_id,String name,String course,float fees){
        super(Person_id,name);
        this.course =course;
        this.fees=fees;
    }
    void display(){
        super.dis();
        System.out.println("Course name : "+course);
        System.out.println("Fees : "+fees);
    }
}

class Feculty extends Person{
    String sub_name;
    float exp;
    Feculty(String Person_id,String name,String sub_name,float exp){
        super(Person_id, name);
        this.sub_name=sub_name;
        this.exp=exp;
    }
    void display(){
        super.dis();
        System.out.println("Subject name : "+sub_name);
        System.out.println("Experience : "+exp);
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Person p = new Person("22"," name");
        p.dis();

        Feculty f = new Feculty("22BCa136","Krish","Gujarati",1.2f);
        f.display();

        Student s = new Student("22BCa136","Krish","BCA",25000.0f);
        s.display();

    }
}










