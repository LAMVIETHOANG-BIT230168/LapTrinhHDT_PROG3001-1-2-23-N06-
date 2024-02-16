/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapcautrucdieukhienp1;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Bai9 {
    public static void main(String[] args){
        int a=3,b=5,c=2,d=4;
        int x= Math.max(a, b);
        int y= Math.max(c, d);
        System.out.println("Gia tri lon nhat la: "+Math.max(x, y));
        
        int m=Math.min(a, b);
        int n=Math.min(c, d);
        System.out.println("Gia tri nho nhat: "+Math.min(m, n));
        
        int[] arrtang ={a,b,c,d};
       java.util.Arrays.sort(arrtang);
       System.out.print("Thu tu tang dan la: ");
       for(int i=0;i<=3;i++){
           System.out.print(arrtang[i]+ " ");
       }
       System.out.print("\n");
       
        int[] arrgiam={a,b,c,d};
       java.util.Arrays.sort(arrgiam);
       System.out.print("Thu tu giam dan la: ");
       for(int i=3;i>=0;i--){
           System.out.print(arrgiam[i]+ " ");
       }
       
    }
}
