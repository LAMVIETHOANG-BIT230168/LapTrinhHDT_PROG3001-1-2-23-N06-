/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapcautrucdieukhienp1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap nam san xuat cua may tinh: ");
        int year=sc.nextInt();
        if(year>=15){
            System.out.println("Thay the");
            
        }else if(year>=10&&year<15){
            System.out.println("Bao tri");
        }else{
            System.out.println("Khong co de xuat");
        }
    }
}
