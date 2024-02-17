import java.time.LocalDate;

public class Product {
    private String code;
    private String name;
    private LocalDate importedDate;
    private double price;
    private double promotionsPercent;
    private int stock;

    // Constructor
    public Product(String code, String name, LocalDate importedDate, 
                   double price, double promotionsPercent, int stock) {
        this.code = code;
        this.name = name;
        this.importedDate = importedDate;
        this.price = price;
        this.promotionsPercent = promotionsPercent;
        this.stock = stock;
    }

    // Print product information
    public void printInfo() {
        System.out.println("Product Code: " + code);
        System.out.println("Product Name: " + name);
        System.out.println("Imported Date: " + importedDate);
        System.out.println("Price: " + price);
        System.out.println("Promotions Percent: " + promotionsPercent);
        System.out.println("Stock: " + stock);
    }

    // Calculate price after promotions
    public double getPrice() {
        double discount = price * (promotionsPercent / 100);
        return price - discount;
    }
}
