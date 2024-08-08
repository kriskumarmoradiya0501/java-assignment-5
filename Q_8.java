abstract class Vehicle {
    abstract int numwheels();
}

class Twowheeler extends Vehicle {
    int numwheels() {
        return 2;
    }
}

class Fourwheeler extends Vehicle {
    int numwheels() {
        return 4;
    }
}

public class Q_8 {
    public static void main(String[] args) {
        Vehicle bike = new Twowheeler();
        Vehicle car = new Fourwheeler();

        System.out.println("Number of wheels in Twowheeler: " + bike.numwheels());
        System.out.println("Number of wheels in Fourwheeler: " + car.numwheels());
    }
}
