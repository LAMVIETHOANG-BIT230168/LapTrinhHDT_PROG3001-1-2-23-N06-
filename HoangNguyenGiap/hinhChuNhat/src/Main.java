import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return "Chiều dài: " + chieuDai + "\nChiều rộng: " + chieuRong +
               "\nDiện tích: " + tinhDienTich() + "\nChu vi: " + tinhChuVi();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);

        System.out.println("Thông tin hình chữ nhật:");
        System.out.println(hinhChuNhat);
    }
}
