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
public class Bai10 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap luong: ");
        double luong =sc.nextDouble();
        System.out.print("Nhap gio lam viec: ");
        int time =sc.nextInt();
        double thuong;
        if(time>=200){
            thuong=luong*20/100;
        }else if(time>=100&&time<200){
            thuong=luong*10/100;
        }else{
            thuong = 0;
        }
        System.out.println("Thuong cua nhan vien trong thang: "+thuong);
    }
}
