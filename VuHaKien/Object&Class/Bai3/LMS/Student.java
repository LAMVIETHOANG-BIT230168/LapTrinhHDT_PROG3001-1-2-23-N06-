package lms;
import java.time.LocalDate;

public class Student {
    public String code;
    public String fullname;
    public LocalDate dateofbirth;
    public double mark1;
    public double mark2;
    public double mark3;
    private double avg;
    Student(){
        
    }
    Student(String _code,String _fullname,LocalDate _dateofbirth,double _mark1,double _mark2,double _mark3){
        this.code =_code;
        this.fullname =_fullname;
        this.dateofbirth=_dateofbirth;
        this.mark1 =_mark1;
        this.mark2= _mark2;
        this.mark3=_mark3;
    }
    public void Inthongtin(){
        System.out.println("Ma so SV: "+code);
        System.out.println("Ho va ten: "+fullname);
        System.out.println("Ngay sinh: "+dateofbirth);
        System.out.println("Diem 1: "+mark1);
        System.out.println("Diem 2: "+mark2);
        System.out.println("Diem 3: "+mark3);        
    }
    public void getAverageMark(){
        avg = (mark1+mark2+mark3)/3;
        System.out.println("Diem trung binh la: "+avg);
        
    }
    public void getLevel(){
        if(avg>=9){
            System.out.println("Xuat sac");
        }else if(avg >=8&&avg<9){
            System.out.println("Gioi");
        }else if(avg>=7&&avg<8){
            System.out.println("Kha");
        }else{
            System.out.println("Trung binh");
        }
    }
}
