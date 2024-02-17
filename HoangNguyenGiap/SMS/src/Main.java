import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sản phẩm:");
        System.out.print("Mã số sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Ngày nhập (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date importedDate = dateFormat.parse(dateString);
        System.out.print("Giá bán: ");
        double price = scanner.nextDouble();
        System.out.print("Khuyến mãi (%): ");
        double promotionsPercent = scanner.nextDouble();
        System.out.print("Tồn kho: ");
        int stock = scanner.nextInt();

        Product product = new Product(code, name, importedDate, price, promotionsPercent, stock);

        System.out.println("\nThông tin sản phẩm:");
        product.displayInfo();

        System.out.println("\nGiá bán sau khi giảm giá / khuyến mãi: " + product.getPrice());
    }
}
