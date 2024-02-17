import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Mã số SV: ");
        String code = scanner.nextLine();
        System.out.print("Họ và Tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Ngày sinh (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = dateFormat.parse(dateString);
        System.out.print("Điểm 1: ");
        float mark1 = scanner.nextFloat();
        System.out.print("Điểm 2: ");
        float mark2 = scanner.nextFloat();
        System.out.print("Điểm 3: ");
        float mark3 = scanner.nextFloat();

  
        Student student = new Student(code, fullName, dateOfBirth, mark1, mark2, mark3);

 
        System.out.println("\nThông tin sinh viên:");
        student.displayInfo();

     
        System.out.println("\nĐiểm trung bình: " + student.getAverageMark());
        System.out.println("Xếp loại: " + student.getLevel());
    }
}