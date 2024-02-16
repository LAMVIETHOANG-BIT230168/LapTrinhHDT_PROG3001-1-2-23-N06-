import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(1001, "Nguyen Trung Duc", 8.5f, 9.0f);

  
        System.out.println("Nhập thông tin sinh viên sv2:");
        System.out.print("MSSV: ");
        int maSV2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Họ tên: ");
        String hoTen2 = scanner.nextLine();
        System.out.print("Điểm LT: ");
        float diemLT2 = scanner.nextFloat();
        System.out.print("Điểm TH: ");
        float diemTH2 = scanner.nextFloat();
        SinhVien sv2 = new SinhVien(maSV2, hoTen2, diemLT2, diemTH2);

   
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhập thông tin sinh viên sv3:");
        System.out.print("MSSV: ");
        int maSV3 = scanner.nextInt();
        sv3.setMaSV(maSV3);
        scanner.nextLine(); 
        System.out.print("Họ tên: ");
        String hoTen3 = scanner.nextLine();
        sv3.setHoTen(hoTen3);
        System.out.print("Điểm LT: ");
        float diemLT3 = scanner.nextFloat();
        sv3.setDiemLT(diemLT3);
        System.out.print("Điểm TH: ");
        float diemTH3 = scanner.nextFloat();
        sv3.setDiemTH(diemTH3);

   
        System.out.println("Bảng danh sách sinh viên:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
