
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int lc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lua chon: \n1-DIEM\n2-TAMGIAC\n3-DUONGTRON");
        lc = sc.nextInt();
        switch(lc){
            case 1:
            diem Diem =new diem();
            Diem.NHAPDIEM();
            Diem.INDIEM();
            break;
            case 2:
            tamgiac tg = new tamgiac();
            tg.NHAPTG();
            tg.INTAMGIAC();
            if(tg.KIEMTRA()) {
                System.out.println("3 canh vua nhap la dinh cua tam giac");
                tg.CHUVI();
                tg.dientich();
            }
            else System.out.println("3 canh vua nhap khong la dinh cua tam giac");
            break;
            case 3:
            duongtron dt = new duongtron();
            dt.NHAPDT();
            dt.induongtron();
            dt.chuvi();
            dt.dientich();
            break;
        }
        
    }
}
