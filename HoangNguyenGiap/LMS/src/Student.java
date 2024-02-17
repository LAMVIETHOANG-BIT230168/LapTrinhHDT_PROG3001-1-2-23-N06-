import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private final String code;
    private final String fullName;
    private final Date dateOfBirth;
    private final float mark1;
    private final float mark2;
    private final float mark3;

    public Student(String code, String fullName, Date dateOfBirth, float mark1, float mark2, float mark3) {
        this.code = code;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã số SV: " + code);
        System.out.println("Họ và Tên: " + fullName);
        System.out.println("Ngày sinh: " + dateFormat.format(dateOfBirth));
        System.out.println("Điểm 1: " + mark1);
        System.out.println("Điểm 2: " + mark2);
        System.out.println("Điểm 3: " + mark3);
    }

    public float getAverageMark() {
        return (mark1 + mark2 + mark3) / 3;
    }

    public String getLevel() {
        float avgMark = getAverageMark();
        if (avgMark >= 9) {
            return "Xuất sắc";
        } else if (avgMark >= 8) {
            return "Giỏi";
        } else if (avgMark >= 7) {
            return "Khá";
        } else if (avgMark >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
