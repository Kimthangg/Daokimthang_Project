import java.util.Scanner;
//class đường tròn kế thừa điểm
public class duongtron extends diem{
    float r;
    //method NHAPDT
    public void NHAPDT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        r = sc.nextFloat();
    }   
    //method in dt
    public void induongtron() {
        System.out.printf("Duong tron co ban kinh và duong kinh la: %.2f và %.2f ",r,2*r);
    }
    //method chu vi
    public void chuvi() {
        System.out.printf("\nChu vi cua duong tron là: %.2f",(r*2*3.14));
    }
    //method dien tich
    public void dientich() {
        System.out.printf("\nDien tich cua duong tron la: %.2f",(Math.pow(r,2)*3.14));
    } 
}