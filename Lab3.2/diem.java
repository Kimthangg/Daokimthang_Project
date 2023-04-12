import java.util.Scanner;
//class Diem
public class diem {
    int x,y;
    //method nhập điểm
    public void NHAPDIEM(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Moi nhap toa do x: ");
    x = sc.nextInt();
    System.out.println("Moi nhap toa do y: ");
    y = sc.nextInt();
    }
    //method in điểm
    public void INDIEM() {
        System.out.println("Diem co toa do la: ("+x+","+y+")");
    }}