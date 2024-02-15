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
public class Bai11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap diem trung binh: ");
        double diem=sc.nextDouble();
        double hocbong;
        if(diem>=9){
            hocbong=5000000;
        }else if(diem>=8&&diem<9){
            hocbong=3000000;
        }else if(diem>=7&&diem<8){
            hocbong =1000000;
        }else{
            hocbong=0;
        }
        System.out.println("Hoc bong doi voi diem trung binh "+diem+" la "+hocbong);
    }
}
