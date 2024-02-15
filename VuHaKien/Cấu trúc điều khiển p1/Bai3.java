/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapcautrucdieukhienp1;
import java.util.Scanner;


/**
 *
 * @author Admi
 */
public class Bai3 {
        public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    int n;
    System.out.print("Nhap n: ");
    n=sc.nextInt();
    if(n==0){
        System.out.println("n la zero");
    }else if(n%2==0){
        System.out.println("n la so chan");
    }else{
        System.out.println("n la so le");
    }
}
}