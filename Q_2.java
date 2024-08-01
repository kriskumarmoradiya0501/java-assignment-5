/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */

class Inp {
    int a;
    float b;
    String c;
    double d;

    Inp(int a, float b, String c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void display() {
        System.out.println("Integer : " + a);
        System.out.println("Float : " + b);
        System.out.println("String : " + c);
        System.out.println("Double : " + d);
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Inp i = new Inp(10, 10.10f, "Krish", 10.20);

        i.display();
    }
}



