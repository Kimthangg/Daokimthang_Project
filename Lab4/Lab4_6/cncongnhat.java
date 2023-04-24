package Daokimthang_Project.Lab4.Lab4_6;
import java.util.Scanner;
public class cncongnhat extends congnhan {
    int he_so, ngay_cong;
    int luongcb;
    public cncongnhat(){
        this.ho_ten = null;
        this.dia_chi = null;
        this.loai_cn = null;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Luong co ban: ");
        luongcb = sc.nextInt();
        System.out.println("He so: ");
        he_so = sc.nextInt();
        System.out.println("So ngay cong: ");
        ngay_cong = sc.nextInt();
    }
    public double luong() {
        if(ngay_cong <20) return (luongcb*he_so + 0);
        else return (double)(luongcb*he_so + 1.2*luongcb);
    }
    public void in(){
        super.in();
        System.out.println("Luong thang: "+luong());
    }
}
