package hrs;
import java.util.Date;

public class Employee {
    public String code;
    public String fullname;
    public String gender;
    public Date birthday;
    public Date joined;
    public double salary;
    public double bonus;
    Employee(){
        
    }
    Employee(String _code,String _fullname,String _gender,Date _birthday,Date _joined,double _salary,double _bonus){
        this.code=_code;
        this.fullname=_fullname;
        this.gender=_gender;
        this.birthday=_birthday;
        this.joined=_joined;
        this.salary=_salary;
        this.bonus=_bonus;
    }
    public void Inthongtin(){
        System.out.println("Ma so nhan su: "+code);
        System.out.println("Ho va ten: "+fullname);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Sinh nhat: "+birthday);
        System.out.println("Ngay vao cong ty: "+joined);
        System.out.println("Luong: "+salary);
        System.out.println("Thuong: "+bonus);
    }
    public void Tongluong(){
        System.out.println("Tong luong duoc nhan: "+(salary+bonus));
    }
}
