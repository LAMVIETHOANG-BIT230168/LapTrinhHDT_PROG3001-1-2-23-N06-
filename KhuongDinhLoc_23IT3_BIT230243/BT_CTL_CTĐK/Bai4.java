import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Nhap hai so nguyen bat ki:");
        a= sc.nextInt(); b = sc.nextInt();
        System.out.println("Cac so nguyen to tu "+a+" den "+b+" la:");
        for (int i=a; i<=b; i++){
            if (SoNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean SoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
