/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuethunhap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Thuethunhap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double luong, thuong, thuNhap,thue;
        System.out.print("Nhap luong:");
        luong = sc.nextDouble();
        System.out.print("Nhap thuong:");
        thuong = sc.nextDouble();
        thuNhap = luong + thuong;
        if(thuNhap >= 0 && thuNhap <=9000000){
            thue = thuNhap * 0;
        }else if(thuNhap >=9000000 && thuNhap <15000000){
            thue = thuNhap * 0.1;
        }else if(thuNhap >=15000000 && thuNhap<30000000){
            thue = thuNhap * 0.15;
        }else {
            thue = thuNhap * 0.2;
        }
        System.out.println("Thu Nhap co muc thu la:" + thuNhap);
    }
}