package Daokimthang_Project.Lab4.Lab4_6;

public class Main {
    public static void main(String[] args) {
    Cnkhoansp cn1 = new Cnkhoansp();
    cncongnhat cn2 = new cncongnhat();
    System.out.println("Nhap thong tin cong nhan khoan san pham: ");
    cn1.nhap();
    System.out.println("Thong tin cong nhan khoan san pham: ");
    cn1.in();
    System.out.println("==============================================");
    System.out.println("Nhap thong tin cong nhan khoan tinh cong nhat: ");
    cn2.nhap();
    System.out.println("Thong tin cong nhan khoan tinh cong nhat: ");
    cn2.in();
}}
