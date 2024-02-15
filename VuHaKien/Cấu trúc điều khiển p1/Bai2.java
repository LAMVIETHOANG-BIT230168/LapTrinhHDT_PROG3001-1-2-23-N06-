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
public class Bai2 {
    public static void main(String[] args){
   int a,b,c;
   double x1,x2,delta;
   Scanner sc=new Scanner(System.in);
   System.out.print("Nhap a: ");
   a=sc.nextInt();
   System.out.print("Nhap b: ");
   b=sc.nextInt();
   System.out.print("Nhap c: ");
   c=sc.nextInt();
   if(a==0){
       if(b==0){
           if(c==0){
                System.out.print("Phuong trinh vo so nghiem");
           }
                System.out.print("Phuong trinh vo nghiem");
       }
       x1=-b/c;
       System.out.print("Phuong trinh co nghiem: "+x1);
   }
   delta=b*b-4*a*c;
   if(delta>0){
       x1=(-b-Math.sqrt(delta))/(2*a);
       x2=(-b+Math.sqrt(delta))/(2*a);
       System.out.println("Phuong trinh co 2 nghiem:");
       System.out.println("x1: "+x1);
       System.out.println("x2: "+x2);
   }else if(delta==0){
       x1=-b/2*a;
       System.out.println("Phuong trinh co nghiem duy nhat: "+x1);
   }else{
       System.out.println("Phuong trinh vo nghiem");
   }
}
}
