public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculate() {
        // Örnek hesaplama
        return getPrice() * 1.2;
    }
}
