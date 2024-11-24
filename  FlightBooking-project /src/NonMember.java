package coe528.lab1;

public class NonMember extends Passenger {
    public NonMember(String name, int age) {
        super(name, age);
    }

    public double applyDiscount(double price) {
        if (this.getAge() > 65) {
            return price * 0.9;
        } else {
            return price;
        }
    }
}
