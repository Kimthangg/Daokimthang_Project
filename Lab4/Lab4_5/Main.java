package Daokimthang_Project.Lab4.Lab4_5;

public class Main {
    public static void main(String[] args) {
    gvcohuu gv1 = new gvcohuu();
    gvthinhgiang gv2 = new gvthinhgiang();
    System.out.println("Nhap thong tin giao vien co huu: ");
    gv1.nhap();
    System.out.println("Thong tin giao vien co huu: ");
    gv1.in();
    System.out.println("==============================================");
    System.out.println("Nhap thong tin giao vien thinh giang: ");
    gv2.nhap();
    System.out.println("Thong tin giao vien thinh giang: ");
    gv2.in();
}}
