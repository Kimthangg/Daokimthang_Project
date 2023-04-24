package Daokimthang_Project.Lab4.Lab4_1;

public class test {
    public static void main(String[] args) {
        benhvien bv_1 = new benhvien("Bach Mai", "Ha Noi", "Nguyen Xuan Kim");
        benhnhan bn_1 = new benhnhan("Kim Anh Thu",37,'N',"Khong","Viem hong", bv_1);
        System.out.println(bn_1.toString());
    }
}
