
import java.util.Scanner;
public class QuanLySv{
    public static void main(String[] args) {
       SinhVien sv1 = new SinhVien(125, "Khuong Dinh Loc", 9f, 9.5f);
       SinhVien sv2 = new SinhVien(156, "Nguyen Thu Phuong", 9f, 9.5f);
       SinhVien sv3 = new SinhVien();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap thong tin sinh vien");
       System.out.print("Nhap ma sinh vien: ");
       int Masv= sc.nextInt();
       sc.nextLine();
       System.out.print("Ho Ten: ");
       String Hoten = sc.nextLine();
       System.out.print("Diem Ly Thuyet: ");
       float DiemLt = sc.nextFloat();
       System.out.print("Diem Thuc hanh: ");
       float DiemTh = sc.nextFloat();
       sv3.setMasv(Masv);
       sv3.setHoTen(Hoten);
       sv3.setdiemLt(DiemLt);
       sv3.setdiemTh(DiemTh); 
       System.out.println("\nBảng danh sách sinh viên:");
       System.out.println("MSSV      Hoten               Diem LT   Diem TH   Diem TB");
       System.out.println(sv1);
       System.out.println(sv2);
       System.out.println(sv3);
    }
}