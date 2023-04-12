import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in); 
		sach sach1 = new sach();
		sach1.NHAPSACH();
		System.out.println("Ma sach|\tTen sach|\tTen tac gia|\tSo trang|\tLoai sach|\tNha xuat ban|\tGia|\tSo tap");
		sach1.INSACH();
		System.out.println("\nNhap tong so sach: ");
		n = sc.nextInt();
		sach s2[] = new sach[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Moi nhap sach thu "+ i+1 +" :");
			s2[i] = new sach();
			s2[i].NHAPSACH();
		}
		System.out.println("\nMa sach|\tTen sach|\tTen tac gia|\tSo trang|\tLoai sach|\tNha xuat ban|\tGia|\tSo tap");
		for (int i = 0; i < n; i++) {
			s2[i].INSACH();
		}
		}
	}	
