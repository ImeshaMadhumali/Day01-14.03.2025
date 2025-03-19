public class vegetables extends product {
    public vegetables(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Vegetable: " + getName() + " | Price: " + getPrice() + " | Quantity: " + getQuantity());
    }
}