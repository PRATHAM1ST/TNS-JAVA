package student;

//Create a class called Product with the following attributes and methods:
//
//Attributes:
//name (String)
//price (double)
//quantity (int)
//totalSold (static int)
//Methods:
//void sell(int quantity): This method should decrease the quantity of the product by the given quantity and update the totalSold static variable accordingly.
//static int getTotalSold(): This method should return the total quantity of products sold so far.
//In the Main class, test the Product class by doing the following:
//Create multiple instances of Product and set their name, price, and quantity.
//Call the sell() method for some of the product instances to simulate selling them.
//Print the total quantity of products sold using the getTotalSold() method.
//Write the code to solve the problem

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

