package Lab5.bai6;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Map<Integer,sinhvien> map = new HashMap<Integer,sinhvien>();
        //Nhập ds sinh viên
        System.out.println("Nhập số sinh viên: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            sinhvien sv = new sinhvien();
            System.out.println("Nhập sinh viên thứ "+(i+1)+": ");
            sv.Nhap();
            map.put(i, sv);
        }
        //In ds sinh viên
        System.out.println("\nDs sinh viên: ");
        for (sinhvien temp : map.values()) {
            System.out.println(temp);
        }
        //Tìm theo lớp
        sc.nextLine();
        String lop_temp;
        System.out.print("\nNhap lop can tim: ");
        lop_temp = sc.nextLine().toUpperCase();
        int dem = 0;
        for (sinhvien temp : map.values()){
            dem++;
            if(temp.getLop().equals(lop_temp)){
                System.out.println(temp);
                break;
            }
            else if(dem>=n) System.out.println("Khong tim thay!");
        }
        //Tìm theo msv
        String msv_temp;
        System.out.println("\nNhap ma sinh vien can tim: ");
        msv_temp = sc.nextLine().toUpperCase();
        int dem1=0;
        for (sinhvien temp : map.values()){
            dem1++;
            if(temp.getMsv().equals(msv_temp)){
                System.out.println("Ho ten: "+temp.getHoten()+"\tLop: "+temp.getLop());
                break;
            }
            else if(dem1>=n) System.out.println("Khong tim thay!");
        }
    }
}
