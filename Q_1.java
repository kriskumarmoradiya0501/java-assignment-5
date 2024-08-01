/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */
class Pro {
    // Static variable
    static int count = 0;

    // Static method to increment the count
    static void counter() {
        count++;
    }

    public static int retur() {
        return count;
    }
}

public class Q_1{
    public static void main(String[] args) {
        Pro.counter();
        Pro.counter();
        Pro.counter();

        System.out.println("Counter = " + Pro.retur());
        Pro.counter();
        System.out.println("Counter = " + Pro.retur());
    }
}

