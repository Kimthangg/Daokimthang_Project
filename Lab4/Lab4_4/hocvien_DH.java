package Daokimthang_Project.Lab4.Lab4_4;
import java.util.Scanner;
public class hocvien_DH extends hocvien {
    int so_buoi, don_gia;
    public hocvien_DH(){
        this.ho_ten = null;
        this.dia_chi = null;
        this.loai_uu_tien = 0;
        this.loai_ct = null;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So buoi: ");
        so_buoi = sc.nextInt();
        System.out.println("Don gia: ");
        don_gia = sc.nextInt();
    }
    public int hocphi() {
        if(loai_uu_tien == 1)
            return (so_buoi*don_gia - 1000000);
        else return (so_buoi*don_gia -500000);
    }
    public void in(){
        super.in();
        System.out.println("Hoc phi: "+hocphi());
    }
}
