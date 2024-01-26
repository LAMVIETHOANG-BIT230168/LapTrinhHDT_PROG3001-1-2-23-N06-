/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuethunhsp;
import java.util.Scanner;
import java.lang.Math;

public class Thuethunhsp {

    public static void main(String[] args) {
         Scanner sr = new Scanner(System.in);
         double luong,thunhap;
         System.out.print("Nhap so tien luong :");
         luong = sr.nextDouble();
         double thuong;
         System.out.println();
         System.out.println("Nhap so tien thuong:");
         thuong = sr.nextDouble();
         thunhap = luong+thuong;
       if (thunhap < 15000000 && thunhap >= 9000000) {
    System.out.println("Ban Phai dong theu la:" + (thunhap * 10 / 100));
} else if (thunhap >= 15000000 && thunhap < 30000000) {
    System.out.println("Ban Phai dong theu la:" + (thunhap * 15 / 100));
} else {
    System.out.println("Ban Phai dong theu la:" + (thunhap * 20 / 100));
}

    }
}
