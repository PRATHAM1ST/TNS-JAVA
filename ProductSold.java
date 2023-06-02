package student;
class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
        } else {
            System.out.println("Insufficient quantity available.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class ProductSold {
    public static void main(String[] args) {
        Product p1 = new Product("Product 1", 10.99, 50);
        Product p2 = new Product("Product 2", 5.99, 20);
        Product p3 = new Product("Product 3", 2.99, 100);

        p1.sell(20);
        p2.sell(10);
        p3.sell(50);

        System.out.println("Total quantity sold: " + Product.getTotalSold());
    }
}

