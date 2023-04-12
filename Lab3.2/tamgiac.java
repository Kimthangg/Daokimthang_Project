import java.util.Scanner;
//class Tam giác kế thừa class Điểm
public class tamgiac extends diem {
    int a,b,c;
//method Nhập tam giác
    public void NHAPTG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap toa do a: ");
        a = sc.nextInt();
        System.out.println("Moi nhap toa do b: ");
        b = sc.nextInt();
        System.out.println("Moi nhap toa do c: ");
        c = sc.nextInt(); 
    }
//method In tam giac
    public void INTAMGIAC() {
        System.out.println("Toa do 3 dinh cua tam giac lan luot la: "+a+" "+b+" "+c);
    }
//method kiểm tra tam giác
    public boolean KIEMTRA() {
        if(a+b>c && a+c>b && b+c>a) return true;
        else return false;
    }
//method chuvi
    public void CHUVI() {
        System.out.println("Chu vi cua tam giac la: "+(a+b+c));
    }
//method dientich
    public void dientich() {
        double p = (a+b+c)/2.0;
        System.out.println("Dien tich cua tam giac la: "+(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
    }}