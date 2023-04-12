import java.util.Scanner;
public class bai2_lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap so nguyen: ");
		int a = sc.nextInt();
		System.out.println(a%2==0?"So vua nhap la so chan":"So vua nhap la so le");
	}
}
