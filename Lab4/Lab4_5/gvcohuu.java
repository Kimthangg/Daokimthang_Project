package Daokimthang_Project.Lab4.Lab4_5;
import java.util.Scanner;
public class gvcohuu extends giangvien {
    int he_so, tham_nien;
    Double luongcb;
    public gvcohuu(){
        this.ho_ten = null;
        this.dia_chi = null;
        this.loai_gv = null;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Luong co ban: ");
        luongcb = sc.nextDouble();
        System.out.println("He so: ");
        he_so = sc.nextInt();
        System.out.println("Tham nien: ");
        tham_nien = sc.nextInt();
    }
    public Double luong() {
        if(tham_nien < 5) return (luongcb*he_so);
        else if(tham_nien == 5) return (luongcb*he_so + 0.05*luongcb);
        else return (luongcb*he_so + (tham_nien/100)*luongcb);
    }
    public void in(){
        super.in();
        System.out.println("Luong thang: "+luong());
    }
}
