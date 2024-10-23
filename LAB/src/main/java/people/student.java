package people;

class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0; // Initialize credits to 0
    }

    public void study() {
        this.credits++; // Increase credits by 1 when study is called
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString(); // Calls the Person's toString method
    }
}
