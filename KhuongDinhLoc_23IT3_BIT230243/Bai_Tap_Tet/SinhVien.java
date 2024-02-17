public class SinhVien {
    public int Masv;
    public String Hoten;
    public float  DiemLT;
    public float DiemTH;
    public SinhVien(){

    }

    public SinhVien(int _Masv,String _Hoten,float _DiemLT,float _DiemTH){
        this.Masv = _Masv;
        this.Hoten = _Hoten;
        this.DiemLT = _DiemLT;
        this.DiemTH = _DiemTH;
    }

    public int getmasv(){
        return Masv;
    }
    public void setMasv(int Masv){
        this.Masv = Masv;
    }
    public String getHoTen(){
        return Hoten;
    }
    public void setHoTen(String Hoten){
        this.Hoten = Hoten;
    }
    public float getdiemTt(){
        return DiemLT;
    }
    public void setdiemLt(float DiemLT){
        this.DiemLT = DiemLT;
    }
    public float getdiemTh(){
        return DiemTH;
    }
    public void setdiemTh(float DiemTH){
        this.DiemTH = DiemTH;
    }

    public float TB(){
        return (DiemLT + DiemTH) / 2;
    }
    public String toString(){
        return String.format("%-10d%-20s%-10.2f%-10.2f%-10.2f", Masv, Hoten, DiemLT, DiemTH, TB());
        
    }
}
