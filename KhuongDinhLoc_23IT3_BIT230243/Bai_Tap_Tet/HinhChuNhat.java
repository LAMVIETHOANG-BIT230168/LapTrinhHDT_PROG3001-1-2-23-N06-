
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }


    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }


    public String toString() {
        return String.format("Chieu dai: %.2f\nChieu rong: %.2f\nDien tich: %.2f\nChu vi: %.2f",chieuDai, chieuRong, tinhDienTich(), tinhChuVi());
    }
}
    
