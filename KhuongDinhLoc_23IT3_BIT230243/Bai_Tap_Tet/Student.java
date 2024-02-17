import java.time.LocalDate;

public class Student {
    private String code;
    private String fullname;
    private LocalDate dateOfBirth;
    private double mark1;
    private double mark2;
    private double mark3;

    public Student(String code, String fullname, LocalDate dateOfBirth, 
                   double mark1, double mark2, double mark3) {
        this.code = code;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    public void printInfo() {
        System.out.println("Student Code: " + code);
        System.out.println("Fullname: " + fullname);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }


    public double getAverageMark() {
        return (mark1 + mark2 + mark3) / 3;
    }

    public String getLevel() {
        double averageMark = getAverageMark();
        if (averageMark >= 9.0) {
            return "Xuat xac";
        } else if (averageMark >= 8.0) {
            return "Gioi";
        } else if (averageMark >= 7.0) {
            return "Kha";
        } else if (averageMark >= 5.0) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}
