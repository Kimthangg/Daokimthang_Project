package Daokimthang_Project.Lab4.Lab4_2;

public class test {
    public static void main(String[] args) {
        truong truong = new truong("Mo Dia Chat", "18 Pho Vien", "Tran Thanh Hai");
        sinhvien sv1 = new sinhvien("Dao Kim Thang", 20, "Nam", "F2", "CNTT", truong);
        System.out.println(sv1.toString());
    }   
}
