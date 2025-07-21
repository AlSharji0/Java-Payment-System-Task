public class CreditCard extends PaymentMethod {
    public CreditCard(String _name) {
        super(_name);
    }

    @override
    void pay(double amount) {
        System.out.printf("Paid: %f using Credit Card: %s%n", amount, getName());
    }
}