import Employee.java.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân sự:");
        System.out.print("Mã số nhân sự: ");
        String code = scanner.nextLine();
        System.out.print("Họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Sinh nhật (dd/MM/yyyy): ");
        String birthdayString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = dateFormat.parse(birthdayString);
        System.out.print("Ngày vào công ty (dd/MM/yyyy): ");
        String joinedDateString = scanner.nextLine();
        Date joinedDate = dateFormat.parse(joinedDateString);
        System.out.print("Lương: ");
        double salary = scanner.nextDouble();
        System.out.print("Thưởng: ");
        double bonus = scanner.nextDouble();

        Employee employee = new Employee(code, fullName, gender, birthday, joinedDate, salary, bonus);

        System.out.println("\nThông tin nhân sự:");
        employee.displayInfo();

        System.out.println("\nTổng lương thực nhận: " + employee.calculateTotalSalary());
    }
}
