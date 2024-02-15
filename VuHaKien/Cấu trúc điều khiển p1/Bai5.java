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
public class Bai5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        char c=sc.next().charAt(0);
        if(c=='e' ||c=='u'|| c=='o'||c=='a'||c=='i'){
            System.out.println("Ky tu "+c+" la nguyen am");
        }else{
            System.out.println("Ky tu "+c+" la phu am");
        }
    }
}
