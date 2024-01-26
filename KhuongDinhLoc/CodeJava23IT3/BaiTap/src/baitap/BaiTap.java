
package baitap;
import java.lang.Math;
import java.util.Scanner;
public class BaiTap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a so a,b, ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if(a>0 && b>0 &c>0) {
            System.out.println("la ba canh cua tam giac");
        } else {
            System.out.println("khong phai ba canh cua mot tam giac");
        }
       System.out.println("so lon nhat la " +Math.max(Math.max(a,b),c));
    }
    
}
