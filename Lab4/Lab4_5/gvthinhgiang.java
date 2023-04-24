package Daokimthang_Project.Lab4.Lab4_5;
import java.util.Scanner;
public class gvthinhgiang extends giangvien {
    int don_gia, so_tiet_day;
    public gvthinhgiang(){
        this.ho_ten = null;
        this.dia_chi = null;
        this.loai_gv = null;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("So tiet day: ");
        so_tiet_day = sc.nextInt();
        System.out.println("Don gia: ");
        don_gia = sc.nextInt();
    }
    public Double luong() {
        return (so_tiet_day*don_gia - 0.15*(so_tiet_day*don_gia));}
    public void in(){
        super.in();
        System.out.println("Luong thang: "+ luong());
    }
}
