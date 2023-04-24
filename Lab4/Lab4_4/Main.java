package Daokimthang_Project.Lab4.Lab4_4;

public class Main {
    public static void main(String[] args) {
        hocvien_DH dh = new hocvien_DH();
        hocvien_LT lt = new hocvien_LT();
        System.out.println("Nhap thong tin hoc vien do hoa: ");
        dh.nhap();
        System.out.println("Thong tin hoc vien do hoa: ");
        dh.in();
        System.out.println("===============================================");
        System.out.println("Nhap thong tin hoc vien lap trinh: ");
        lt.nhap();
        System.out.println("Thong tin hoc vien lap trinh: ");
        lt.in();
    }
}
