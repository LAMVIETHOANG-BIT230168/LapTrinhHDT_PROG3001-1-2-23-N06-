/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapcautrucdieukhienp1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=sc.nextInt();
        if(n<=1){
            System.out.print(n+" khong phai so nguyen to");
        }else{
            
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("So "+n+" khong phai so nguyen to");
                break;
            }
            System.out.println("So "+n+" la so nguyen to");
            break;
        }
        }
    }
}
