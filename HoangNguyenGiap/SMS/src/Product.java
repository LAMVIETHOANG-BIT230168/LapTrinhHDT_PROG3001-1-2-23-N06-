import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private final String code;
    private final String name;
    private final Date importedDate;
    private final double price;
    private final double promotionsPercent;
    private final int stock;

    public Product(String code, String name, Date importedDate, double price, double promotionsPercent, int stock) {
        this.code = code;
        this.name = name;
        this.importedDate = importedDate;
        this.price = price;
        this.promotionsPercent = promotionsPercent;
        this.stock = stock;
    }

    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã số sản phẩm: " + code);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Ngày nhập: " + dateFormat.format(importedDate));
        System.out.println("Giá bán: " + price);
        System.out.println("Khuyến mãi: " + promotionsPercent + "%");
        System.out.println("Tồn kho: " + stock);
    }

    public double getPrice() {
        double discountedPrice = price - (price * promotionsPercent / 100);
        return Math.max(discountedPrice, 0); // Giảm giá không được âm
    }
}

