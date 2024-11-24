
package coe528.lab1;

public class Member extends Passenger {
    private int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    public double applyDiscount(double price) {
        if (yearsOfMembership > 5) {
            return price * 0.5;
        } else if (yearsOfMembership > 1) {
            return price * 0.9;
        } else {
            return price;
        }
    }
}
