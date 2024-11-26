public abstract class Insurance {
    private String name;
    private double price;

    public Insurance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculate();

    @Override
    public String toString() {
        return "Insurance{name='" + name + "', price=" + price + "}";
    }
}
