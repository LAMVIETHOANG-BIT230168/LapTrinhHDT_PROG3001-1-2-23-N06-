import java.util.Scanner;
public class HCN{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap chieu dai: ");
    double chieuDai = scanner.nextDouble();
    System.out.print("Nhap chieu rong: ");
    double chieuRong = scanner.nextDouble();


    HinhChuNhat hinhChuNhat = new HinhChuNhat();
    hinhChuNhat.setChieuDai(chieuDai);
    hinhChuNhat.setChieuRong(chieuRong);


    System.out.println("\nThong tin hinh chu nhat:");
    System.out.println(hinhChuNhat);

    scanner.close();
}
}