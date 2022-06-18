
import java.util.Date;


public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private String nhaXB;
    private Date ngayNhap;
    private int soLuong;
    private double gia;
    
    public Sach(){
        
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXB, String nhaXB, Date ngayNhap, int soLuong, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.nhaXB = nhaXB;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", namXB=" + namXB + ", nhaXB=" + nhaXB + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong + ", gia=" + gia + '}';
    }


}
