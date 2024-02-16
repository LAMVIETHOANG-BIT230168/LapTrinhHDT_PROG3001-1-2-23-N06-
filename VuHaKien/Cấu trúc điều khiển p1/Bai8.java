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
public class Bai8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int nam=sc.nextInt();
        System.out.print("Nhap thang: ");
        int thang=sc.nextInt();
        switch(thang){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        System.out.println("Thang "+thang+" nam "+nam+" co 31 ngay");
        }
        switch(thang){
            case 4:
            case 6:
            case 9:
            case 11:
        System.out.println("Thang "+thang+" nam "+nam+" co 30 ngay");             
        }
        switch(thang){
            case 2:
        if(nam%4==0){
            System.out.println("Thang 2 "+"nam "+nam+" co 29 ngay");
        }else{
            System.out.println("Thang 2 "+"nam "+nam+" co 28 ngay");
        }
    }
    }
}
