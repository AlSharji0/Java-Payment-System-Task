public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("Visa");
        Cash cash = new Cash("Wallet");

        card.pay(50);
        cash.pay(20);
    }
}