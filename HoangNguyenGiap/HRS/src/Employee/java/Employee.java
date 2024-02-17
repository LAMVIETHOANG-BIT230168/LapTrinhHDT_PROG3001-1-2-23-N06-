package Employee.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private final String code;
    private final String fullName;
    private final String gender;
    private final Date birthday;
    private final Date joinedDate;
    private final double salary;
    private final double bonus;

    public Employee(String code, String fullName, String gender, Date birthday, Date joinedDate, double salary, double bonus) {
        this.code = code;
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.joinedDate = joinedDate;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã số nhân sự: " + code);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Giới tính: " + gender);
        System.out.println("Sinh nhật: " + dateFormat.format(birthday));
        System.out.println("Ngày vào công ty: " + dateFormat.format(joinedDate));
        System.out.println("Lương: " + salary);
        System.out.println("Thưởng: " + bonus);
    }

    public double calculateTotalSalary() {
        return salary + bonus;
    }
}
