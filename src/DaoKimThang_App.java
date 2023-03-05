import java.util.Scanner;
public class DaoKimThang_App {
	public static void main(String[] args) {
		System.out.println("Dao Kim Thang hoc Java");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Day la so a: "+ a);
		System.out.println(a>2?"a lon hon 2":"a khong lon hon 2");
	}
}