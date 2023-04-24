package Daokimthang_Project.Lab4.Lab4_4;
import java.util.Scanner;
public abstract class hocvien {
    String ho_ten,dia_chi,loai_ct;
    int loai_uu_tien;
    public hocvien(){}
    public hocvien(String ho_ten, String dia_chi,int loai_uu_tien,String loai_ct){
        this.ho_ten = ho_ten;
        this.dia_chi = dia_chi;
        this.loai_uu_tien = loai_uu_tien;
        this.loai_ct = loai_ct;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        ho_ten = sc.nextLine();
        System.out.println("Dia chi: ");
        dia_chi = sc.nextLine();
        System.out.println("Loai uu tien (1 or 2): ");
        loai_uu_tien = sc.nextInt();
        sc.nextLine();
        System.out.println("Loai chuong trinh dang ki: ");
        loai_ct = sc.nextLine();
    }
    public String get_loai(){
        return loai_ct;
    }
    public abstract int hocphi();
    public void in() {
        System.out.println("Ho ten: "+ho_ten);
        System.out.println("Dia chi: "+dia_chi);
        System.out.println("Loai uu tien: "+loai_uu_tien);
        System.out.println("Loai chuong trinh dang ki: "+loai_ct);
    }
}
