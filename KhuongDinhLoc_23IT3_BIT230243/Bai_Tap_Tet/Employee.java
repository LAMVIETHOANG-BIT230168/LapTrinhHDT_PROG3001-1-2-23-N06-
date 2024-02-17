import java.time.LocalDate;

public class Employee {
    private String code;
    private String fullName;
    private String gender;
    private LocalDate birthday;
    private LocalDate joinedDate;
    private double salary;
    private double bonus;

    
    public Employee(String code, String fullName, String gender, 
                    LocalDate birthday, LocalDate joinedDate, 
                    double salary, double bonus) {
        this.code = code;
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.joinedDate = joinedDate;
        this.salary = salary;
        this.bonus = bonus;
    }


    public void printInfo() {
        System.out.println("Employee Code: " + code);
        System.out.println("Full Name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("Birthday: " + birthday);
        System.out.println("Joined Date: " + joinedDate);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }


    public double getTotalSalary() {
        return salary + bonus;
    }
}
