package coe528.lab1;

public abstract class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the passenger's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the passenger's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the passenger's age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the passenger's age.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Applies a discount based on specific criteria.
     *
     * @param price the original price
     * @return the discounted price
     */
    public abstract double applyDiscount(double price);
}
