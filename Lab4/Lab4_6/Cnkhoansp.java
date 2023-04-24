package Daokimthang_Project.Lab4.Lab4_6;
import java.util.Scanner;
public class Cnkhoansp extends congnhan {
    int so_sp, don_gia;
    public Cnkhoansp(){
        this.ho_ten = null;
        this.dia_chi = null;
        this.loai_cn = null;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So san pham: ");
        so_sp = sc.nextInt();
        System.out.println("Don gia: ");
        don_gia = sc.nextInt();
    }
    public double luong() {
        int sp = 1000;
        if(so_sp - sp >= 100 && so_sp - sp < 150) return (so_sp*don_gia + 1000000);
        else if(so_sp - sp >= 150) return (so_sp*don_gia + 1500000);
        else return (so_sp*don_gia);
    }
    public void in(){
        super.in();
        System.out.println("Luong thang: "+luong());
    }
}
