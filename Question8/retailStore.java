import java.util.ArrayList;
import java.util.List;

public class retailStore {
    private List<product> products;

    public retailStore() {
        products = new ArrayList<>();
    }

    // Add product to the store
    public void addProduct(product product) {
        products.add(product);
    }

    // Edit product details
    public void editProduct(int index, String name, double price, int quantity) {
        if (index >= 0 && index < products.size()) {
            product product = products.get(index);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products in the store
    public void displayProducts() {
        System.out.println("\nProducts in the Store:");
        for (product product : products) {
            product.displayDetails();
        }
    }
}