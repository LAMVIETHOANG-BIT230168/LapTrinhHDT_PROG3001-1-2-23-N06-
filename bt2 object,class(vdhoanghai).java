class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    // Constructor mặc định
    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    // Constructor thứ hai
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // Getter và Setter
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

    // Phương thức tính điểm trung bình
    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Ma SV: " + maSV + "\nHo ten: " + hoTen + "\nDiem LT: " + diemLT + "\nDiem TH: " + diemTH + "\nDiem TB: " + tinhDiemTB();
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo 3 đối tượng sinh viên
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", 7.5f, 8.0f);
        SinhVien sv2 = new SinhVien(2, "Tran Thi B", 6.5f, 7.0f);
        SinhVien sv3 = new SinhVien(); // Sử dụng constructor mặc định

        // In thông tin của từng sinh viên
        System.out.println("Sinh vien 1:");
        System.out.println(sv1);
        System.out.println("\nSinh vien 2:");
        System.out.println(sv2);
        System.out.println("\nSinh vien 3:");
        System.out.println(sv3);
    }
}
