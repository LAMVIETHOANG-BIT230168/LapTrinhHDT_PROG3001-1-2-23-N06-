/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btap.pkg1.pkgif.pkgelse;
import java.util.Scanner;

/**
 *
 * @author My Vuz
 */
public class Btap1IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        giaiPhuongTrinhBacMot(a, b);

        scanner.close();
    }

    public static void giaiPhuongTrinhBacMot(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}
    }
    
}
