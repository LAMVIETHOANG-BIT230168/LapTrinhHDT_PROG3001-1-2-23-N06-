package baitapcautrucdieukhienp1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: " );
        b=sc.nextDouble();
        if(a!=0){
        x=-b/a;
        System.out.println("Nghiem cua phuong trinh a*x+b=0 la: "+x);
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
