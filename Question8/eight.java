public class eight {
    public static void main(String[] args) {
        retailStore store = new retailStore();

        store.addProduct(new fruit("Apple", 1.2, 100));
        store.addProduct(new vegetables("Carrot", 0.5, 150));
        store.addProduct(new grocery("Rice", 2.5, 50));

        store.displayProducts();

        store.editProduct(0, "Apple", 1.5, 120);

        System.out.println("\nAfter editing Apple:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting Carrot:");
        store.displayProducts();
    }
}

// Output
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question8 (main) $ javac eight.java
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question8 (main) $ java eight

// Products in the Store:
// Fruit: Apple | Price: 1.2 | Quantity: 100
// Vegetable: Carrot | Price: 0.5 | Quantity: 150
// Grocery: Rice | Price: 2.5 | Quantity: 50

// After editing Apple:

// Products in the Store:
// Fruit: Apple | Price: 1.5 | Quantity: 120
// Vegetable: Carrot | Price: 0.5 | Quantity: 150
// Grocery: Rice | Price: 2.5 | Quantity: 50

// After deleting Carrot:

// Products in the Store:
// Fruit: Apple | Price: 1.5 | Quantity: 120
// Grocery: Rice | Price: 2.5 | Quantity: 50