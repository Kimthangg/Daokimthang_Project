package Daokimthang_Project.Lab4.Lab4_1;

public class benhvien {
  String ten, dia_chi, Giam_doc;
    public benhvien(String ten,String dia_chi,String Giam_doc) {
        this.ten = ten;
        this.dia_chi = dia_chi;
        this.Giam_doc = Giam_doc;
    }
    public String get_ten() {
        return ten;
    }
    public String get_dia_chi() {
        return dia_chi;
    }
    public String get_Giam_doc() {
        return Giam_doc;
    }
    public void set_ten(String ten){
        this.ten = ten;
    }
    public void set_dia_chi(String dia_chi){
        this.dia_chi = dia_chi;
    }
    public void set_giam_doc(String Giam_doc) {
        this.Giam_doc = Giam_doc;
    }
    @Override
    public String toString() {
        return ("\tTen benh vien: "+ten+"\tDia chi: "+dia_chi+"\tGiam doc: "+Giam_doc);
    }
}
