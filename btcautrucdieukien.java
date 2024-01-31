import java.util.Scanner;

public class btcautrucdieukien {
// Bài 1:
  /*   public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so thu nhat a =");
        a = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Nhap he so thu hai b =");
        b = sc.nextDouble();
        System.out.println("");
        if  (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Nghiem cua phuong trinh la: x=" + -b/a);
        }
        
    }*/
// Bài 2:
/*public static void main(String[] args) {
    double a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap he so thu nhat a =");
    a = sc.nextDouble();
    System.out.println(" ");
    System.out.print("Nhap he so thu hai b =");
    b = sc.nextDouble();
    System.out.println("");
    System.out.print("Nhap he so thu ba c =");
    c = sc.nextDouble();
    System.err.println(" ");


    double delta = b * b - 4 * a * c;

    
    if (delta > 0) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
    } else if (delta == 0) {
        double x = -b / (2 * a);
        System.out.println("Phuong trinh co nghiem kep: x = " + x);
    } else {
        System.out.println("Phuong trinh vo nghiem");
    }
}*/
// Bài 3:
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a;
    System.out.print("Nhap gia tri cua so nguyen a =");
    a = sc.nextInt();
    if (a % 2 == 0) {
        System.out.println(a + " La so chan");
    } else {
        System.out.println(a + " La so le");
    }
}*/
// Bài 4:
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a;
    System.out.print("Nhap gia tri cua so nguyen a =");
    a = sc.nextInt(); 
    if (isSoNguyenTo(a)) {
        System.out.println(a + " La so nguyen to");
    } else {
        System.out.println(a + " Khong phai la so nguyen to");
    }
}

public static boolean isSoNguyenTo(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}*/
// Bài 5:
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap mot ki bat ki");
    char c = sc.next().charAt(0);
    switch (c) {
        case  'u' :
        case 'e' :
        case 'o' :
        case 'a' :
        case 'i' :
         case  'U' :
        case 'E' :
        case 'O' :
        case 'A' :
        case 'I' :
            System.out.println(c+" La mot phu am");
            break;
        default:
            System.out.println(c+" La mot nguyen am");
    }
}*/
//Bài 6:
/*public static  void main(String[] args) {
    double a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("+__________________________________+");
    System.out.print("|   Nhap he so thu nhat a =        |");
    a = sc.nextDouble();
    System.out.println("|                                  |");
    System.out.print("|   Nhap he so thu hai b =         |");
    b = sc.nextDouble();
    System.out.println("+__________________________________+");

        int choice;
    
        do {
            System.out.println("+__________________________________+");
            System.out.println("|   CHON PHEP TINH CAN THUC HIEN   |");
            System.out.println("|   1. PHEP CONG                   |");
            System.out.println("|   2. PHEP TRU                    |");
            System.out.println("|   3. PHEP NHAN                   |");
            System.out.println("|   4. PHEP CHIA                   |");
            System.out.println("|   0. Thoat chuong trinh          |");
            System.out.println("|   Lua chon cua ban la gi:        |");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("|   "+ (a+b)+"                           |");
                    System.out.println("+__________________________________+");
                    break;
                case 2:
                    System.out.println("|   "+ (a-b) +"                           |");
                    System.out.println("+__________________________________+");
                    break;
                case 3:
                    System.out.println("|   "+ (a*b) +"                           |");
                    System.out.println("+__________________________________+");
                    break;
                case 4:
                    System.out.println("|   "+ (a*b) +"                           |");
                    System.out.println("+__________________________________+");
                case 0:
                    System.out.println("|   Thoat chuong trinh             |");
                    System.out.println("+__________________________________+");
                    break;
    
                default:
                    System.out.println("|  Khong hop le.Vui long chon lai. |");
                    System.out.println("+__________________________________+");
            }
    
        } while (choice != 0);


}*/
//Bài 7:
/*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double diem;
        System.out.print("Nhap diem: ");
        diem= sc.nextDouble();
        
        if (diem >= 8){
            System.out.println(" Xep loai A");
        } else if (diem>=6 && diem <8){
            System.out.println("Xep loai B");
        } else {
            System.out.println(" Xep loai C");
        }
    }*/
// Bài 8:
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap 1 thang bat ki: ");
    int thang;
    thang = sc.nextInt();
    System.out.print("Nhap 1 nam bat ki: ");
    int nam;
    nam = sc.nextInt();
    switch (thang) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 10:
        case 12:
        case 8:
            System.out.println("Thang " +thang+ " co 31 ngay");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Thang " +thang+ " co 30 ngay");
            break;
        case 2:
            if (nam %4 ==0) {
                System.out.println("Thang "+thang+" co 29 ngay");
            }   else { System.out.println("Thang "+thang+" co 28 ngay");}
            break;
        default:
            System.out.println("Thang nhap vao khong hop le");
    }
}*/
// Baì 9:
  /*  public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 4;

        int max = Math.max(Math.max(a, b), Math.max(c, d));
        int min = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri lnho nha la: " + min);

        System.out.println("Cac so theo thu tu tang dam:");
        inThuTuTangDan(a, b, c, d);

        System.out.println("Cac so theo thu tu giam dan:");
        inThuTuGiamDan(a, b, c, d);
    }

    
    public static void inThuTuTangDan(int... numbers) {
        java.util.Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }


    public static void inThuTuGiamDan(int... numbers) {
        java.util.Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
    }*/
//Bài 10:
 /*    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong nhan vien: ");
        double luong = sc.nextDouble();

        System.out.print("Nhap so gio lam viec: ");
        int gioLamViec = sc.nextInt();

        double thuong = tinhThuong(gioLamViec, luong);
        System.out.println("Thuong cua nhan vien: " + thuong);

    }

    public static double tinhThuong(int gioLamViec, double luong) {
        double thuong = 0;

        if (gioLamViec >= 200) {
            thuong = 0.2 * luong;
        } else if (gioLamViec >= 100) {
            thuong = 0.1 * luong;
        }

        return thuong;
    }*/
//Bài 11:
/*public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap diem trung binh: ");
    double diemTrungBinh = scanner.nextDouble();


    double hocBong = xetHocBong(diemTrungBinh);

  
    if (hocBong > 0) {
        System.out.println("Hoc bong cua ban la: " + hocBong);
    } else {
        System.out.println("Ban khong dat duoc hoc bong.");
    }

}

public static double xetHocBong(double diemTrungBinh) {
    double hocBong = 0;

    if (diemTrungBinh >= 9) {
        hocBong = 5000000;
    } else if (diemTrungBinh >= 8) {
        hocBong = 3000000;
    } else if (diemTrungBinh >= 7) {
        hocBong = 1000000;
    }

    return hocBong;
}*/
//Bài 12:
/*public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap nam san xua cua may tinh: ");
    int namSanXuat = scanner.nextInt();

    
    String deXuat = xetDeXuat(namSanXuat);

  
    System.out.println(" " + deXuat);

    
}


public static String xetDeXuat(int namSanXuat) {
    String deXuat = "Khong co de xuat";

    if (namSanXuat >= 15) {
        deXuat = "Thay the";
    } else if (namSanXuat >= 10) {
        deXuat = "Bao tri";
    }

    return deXuat;
}*/
//Bài 13:
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap do tuoi: ");
    int tuoi = scanner.nextInt();

   
    String luaTuoi = xacDinhLuaTuoi(tuoi);

    System.out.println(" " + luaTuoi);

   
    scanner.close();
}


public static String xacDinhLuaTuoi(int tuoi) {
    String luaTuoi = "Khong xac dinh";

    if (tuoi > 0 && tuoi <= 2) {
        luaTuoi = "Tre so sinh";
    } else if (tuoi > 2 && tuoi <= 10) {
        luaTuoi = "Nhi dong";
    } else if (tuoi > 10 && tuoi <= 17) {
        luaTuoi = "Vi thanh nien";
    } else if (tuoi > 17 && tuoi <= 39) {
        luaTuoi = "Thanh nien";
    } else if (tuoi > 39 && tuoi <= 50) {
        luaTuoi = "Trung nien";
    } else if (tuoi > 50) {
        luaTuoi = "Cao nien";
    }

    return luaTuoi;
}
}








