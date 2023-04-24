package Daokimthang_Project.Lab4.Lab4_2;

public class nguoi {
    String ten;
    int tuoi;
    String gioitinh;
    public nguoi(){

    }
    public nguoi(String ten,int tuoi,String gioitinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }
    public String get_ten(){
        return ten;
    }
    public int get_tuoi() {
        return tuoi;
    }public String get_gioitinh(){
        return gioitinh;
    }
    public void set_ten(String ten){
        this.ten = ten;
    }
    public void set_ten(int tuoi){
        this.tuoi = tuoi;
    }
    public void set_gioitinh(String gioitinh){
        this.gioitinh = gioitinh;
    }
    @Override
    public String toString() {
        return("Ten: "+ ten+"\tTuoi: "+tuoi+"\tGioi tinh: "+gioitinh);
    }
}
