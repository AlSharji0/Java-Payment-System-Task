public abstract class PaymentMethod {
    private String name;

    public PaymentMethod(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    abstract void pay(double amount);
}