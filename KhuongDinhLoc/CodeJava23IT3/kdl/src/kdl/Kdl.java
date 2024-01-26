/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdl;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Kdl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu trong day: ");
        int n = scanner.nextInt();

    
        int[] array = new int[n];

    
        System.out.println("Nhap cac phan tu cua day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

    
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        System.out.println("Tong cua day so la: " + sum);


        scanner.close();
    }

    @Override
    public String toString() {
        return "kdl []";
    }
}

