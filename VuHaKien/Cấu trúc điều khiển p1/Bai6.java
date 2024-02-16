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
public class Bai6 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a,b;
    double n;
    System.out.print("Nhap so thu nhat: ");
    a=sc.nextInt();
    System.out.print("Nhap so thu hai: ");
    b=sc.nextInt();
    System.out.print("Chon phep tinh (+,-,*,/): ");
    char ct=sc.next().charAt(0);
    System.out.println("Ket qua cua phep tinh giua so thu nhat ca so thu hai la:");
    switch(ct){
        case '+':
            n = a+b;
                System.out.println(a + " + " + b + " = " + n);
            break;
        case '-':
            n=a-b;
            System.out.println(a + " - " + b + " = " + n);
            break;
        case '*':
            n=a*b;
            System.out.println(a + " * "+ b + " = " + n);
            break;
        case '/':
            if(b!=0){
                n=a/(double)b;
                System.out.println(a + " / " + b + " = " + n);
            }else{
                System.out.println("Loi");
            }
    }

    }
}