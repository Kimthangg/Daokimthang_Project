import java.util.Scanner;
public class bai3_lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ten;
		int nam_sinh,temp=0;
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.flush();
		System.out.print("Nhap nam sinh: ");
		nam_sinh = sc.nextInt();
		temp = 2023-nam_sinh;
		if(temp<16) System.out.println("Ban "+ ten +" o do tuoi vi thanh nien");
		else if(temp>=16&&temp<18) System.out.println("Ban "+ten+" o do tuoi truong thanh");
		else if(temp>=18) System.out.println("Ban "+ten+ " da gia");
	}
}
