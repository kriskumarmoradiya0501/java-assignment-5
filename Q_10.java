interface A {
    void method1();
    void method2();
}

class Myclass implements A {
    private String message;

    public Myclass(String message) {
        this.message = message;
    }

    public void method1() {
        System.out.println("message " + message);
    }

    public void method2() {
        System.out.println("method 2");
    }
}

public class Q_10 {
    public static void main(String[] args) {
        Myclass mc = new Myclass("method 1");
        mc.method1();
        mc.method2();
    }
}
