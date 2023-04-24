package Daokimthang_Project.Lab4.Lab4_1;

public class benhnhan extends nguoi {
    String tiensu, chuan_doan;
    benhvien benhvien;
    public benhnhan() {
        
    }
    public benhnhan(String ten, int tuoi, char gioitinh,String tieusu, String chuan_doan,benhvien benhvien) {
        super(ten, tuoi, gioitinh);
        this.tiensu = tieusu;
        this.chuan_doan = chuan_doan;
        this.benhvien = benhvien;
    }
    public String get_tien_Su(){
        return tiensu;
    }
    public String get_chuan_doan(){
        return chuan_doan;
    }
    public benhvien get_benh_vien(){
        return benhvien;
    }
    public void set_tien_Su(String tiensu){
        this.tiensu = tiensu;
    }
    public void set_chuan_doan(String chuan_doan){
        this.chuan_doan = chuan_doan;
    }
    public void set_(benhvien Benh_vien){
        this.benhvien = Benh_vien;
    }
    @Override
    public String toString() {
        return super.toString()+ "\tTien su: "+tiensu+"\tChuan doan: "+chuan_doan+benhvien;
    }
}
