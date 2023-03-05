import java.util.Scanner;
public class bai1_lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap 2 so: ");
		System.out.print("a = ");
		float a = sc.nextFloat(),b;
		System.out.print("b = ");
		b = sc.nextFloat();
		System.out.println("a + b = "+ (a+b));
		System.out.println("a - b = "+ (a-b));
		System.out.println("a * b = "+ (a*b));
		System.out.println("a / b = "+ (a/b));
		System.out.println("a % b = "+ (a%b));
		System.out.println(a==b?"a bang b":a>b?"a lon hon b":"a nho hon b");
	}
}
