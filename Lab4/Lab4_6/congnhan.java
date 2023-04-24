package Daokimthang_Project.Lab4.Lab4_6;
import java.util.Scanner;
public abstract class congnhan {
    String ho_ten,dia_chi,ngay_sinh,loai_cn;
    public congnhan(){}
    public congnhan(String ho_ten, String dia_chi,String ngay_sinh,String loai_cn){
        this.ho_ten = ho_ten;
        this.dia_chi = dia_chi;
        this.ngay_sinh = ngay_sinh;
        this.loai_cn = loai_cn;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        ho_ten = sc.nextLine();
        System.out.println("Dia chi: ");
        dia_chi = sc.nextLine();
        System.out.println("Ngay sinh: ");
        ngay_sinh = sc.nextLine();
        System.out.println("Loai cong nhan: ");
        loai_cn = sc.nextLine();
    }
    public abstract double luong();
    public void in() {
        System.out.println("Ho ten: "+ho_ten);
        System.out.println("Dia chi: "+dia_chi);
        System.out.println("Loai giang vien: "+loai_cn);
    }
}
