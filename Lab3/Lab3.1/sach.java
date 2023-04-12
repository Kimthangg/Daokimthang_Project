import java.util.Scanner;
class sach {
	private String ma, ten, tg;
	private int trang,tap,gia;
	private String loai,nxb;
	public void NHAPSACH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma sach: ");
		ma = sc.nextLine();
		System.out.println("Ten sach: ");
		ten = sc.nextLine();
		System.out.println("Ten tac gia: ");
		tg = sc.nextLine();
		System.out.println("So trang: ");
		trang = sc.nextInt();
		sc.nextLine();
		System.out.println("Loai sach: ");
		loai = sc.nextLine();
		System.out.println("Nha xuat ban: ");
		nxb = sc.nextLine();
		System.out.println("So tap: ");
		tap = sc.nextInt();
		System.out.println("Gia: ");
		gia = sc.nextInt();
	}
	public void INSACH() {
		System.out.printf("%s", ma);
		System.out.print("\t"+ ten);
		System.out.print("\t"+tg);
		System.out.print("\t"+trang);
		System.out.print("\t"+loai);
		System.out.print("\t"+nxb);
		System.out.print("\t"+tap);
		System.out.print("\t"+gia);
	}}
