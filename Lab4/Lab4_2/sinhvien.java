package Daokimthang_Project.Lab4.Lab4_2;

public class sinhvien extends nguoi {
    String lop,nganh;
    truong truong;
    public sinhvien(){

    }
    public sinhvien(String ten,int tuoi,String gioitinh,String lop,String nganh,truong truong){
        super(ten, tuoi, gioitinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    public void set_lop(String lop){
        this.lop = lop;
    }
    public void set_nganh(String nganh){
        this.nganh = nganh;
    }
    public void set_truong(truong truong){
        this.truong = truong;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\tLop: "+lop+"\tNganh: "+nganh+truong;
    }
}
