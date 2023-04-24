package Daokimthang_Project.Lab4.Lab4_2;

public class truong {
    String ten,dia_chi,hieu_truong;
    public truong(){}
    public truong(String ten, String dia_chi,String hieu_truong){
        this.ten = ten;
        this.dia_chi = dia_chi;
        this.hieu_truong = hieu_truong;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\tTen truong: "+ten+"\tDia chi: "+dia_chi+"\tHieu truong: "+hieu_truong;
    }
}
