package Daokimthang_Project.Lab4.Lab4_5;
import java.util.Scanner;
public abstract class giangvien {
    String ho_ten,dia_chi,loai_gv;
    public giangvien(){}
    public giangvien(String ho_ten, String dia_chi,String loai_gv){
        this.ho_ten = ho_ten;
        this.dia_chi = dia_chi;
        this.loai_gv = loai_gv;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        ho_ten = sc.nextLine();
        System.out.println("Dia chi: ");
        dia_chi = sc.nextLine();
        System.out.println("Loai giang vien: ");
        loai_gv = sc.nextLine();
    }
    public abstract Double luong();
    public void in() {
        System.out.println("Ho ten: "+ho_ten);
        System.out.println("Dia chi: "+dia_chi);
        System.out.println("Loai giang vien: "+loai_gv);
    }
}
