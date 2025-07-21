public class Cash extends PaymentMethod {
    public Cash(String _name) {
        super(_name);
    }

    @Override
    void pay(double amount) {
        System.out.printf("Paid %f, using Cash: %s%n", amount, getName());
    }
}