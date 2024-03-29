import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    // Constructor
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Getter và Setter
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Chieu dai: " + chieuDai + "\nChieu rong: " + chieuRong + "\nDien tich: " + tinhDienTich() + "\nChu vi: " + tinhChuVi();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();

        // Tạo đối tượng hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);

        // In thông tin của hình chữ nhật
        System.out.println(hinhChuNhat);
    }
}