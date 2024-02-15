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
public class Bai13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tuoi cua mot nguoi: ");
        int tuoi=sc.nextInt();
        if(tuoi>0&&tuoi<=2){
            System.out.println("Tre so sinh");
        }else if(tuoi>2&&tuoi<=10){
            System.out.println("Nhi dong");
        }else if(tuoi>10&&tuoi<=17){
            System.out.println("Vi thanh nien");
        }else if(tuoi>17&&tuoi<=39){
            System.out.println("Thanh nien");
        }else if(tuoi>39&&tuoi<=50){
            System.out.println("Trung nien");
        }else{
            System.out.println("Cao nien");
        }
    }
}
