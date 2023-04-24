package Daokimthang_Project.Lab4.Lab4_1;

public class nguoi {
    protected String ten;
    protected int tuoi;
    protected char gioitinh;
    public nguoi(){

    }
    public nguoi(String ten,int tuoi,char gioitinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }
    public String get_ten(){
        return ten;
    }
    public int get_tuoi() {
        return tuoi;
    }public char get_gioitinh(){
        return gioitinh;
    }
    public void set_ten(String ten){
        this.ten = ten;
    }
    public void set_ten(int tuoi){
        this.tuoi = tuoi;
    }
    public void set_gioitinh(char gioitinh){
        this.gioitinh = gioitinh;
    }
    @Override
    public String toString() {
        return("Ten: "+ ten+"\tTuoi: "+tuoi+"\tGioi tinh: "+gioitinh);
    }
}
