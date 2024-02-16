/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object_class;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float dai,rong;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai=sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong=sc.nextFloat();
        Hinhchunhat cn=new Hinhchunhat(dai,rong);
        System.out.println("Thong tin hinh chu nhat: ");
        System.out.println(cn.toString());
    }
}
