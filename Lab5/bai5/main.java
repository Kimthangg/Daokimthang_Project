package Lab5.bai5;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Set<Float> hs = new HashSet<Float>();
        Scanner sc = new Scanner(System.in);
        int n;
        float a;
        //Nhap n va mang x
        System.out.println("Nhap n");
        n = sc.nextInt();
        float temp;
        for(int i=0;i<n;i++){
            System.out.println("Nhap x["+(i+1)+"]: ");
            temp = sc.nextFloat();
            if(hs.contains(temp) == false ) hs.add(temp);
            else hs.remove(temp);
        }
        //Nhap a
        System.out.println("Nhap so thuc a: ");
        a = sc.nextFloat();
        // //ktra a
        if(hs.contains(a) == true) System.out.println("So thuc a co trong mang");
        else System.out.println("So thuc a khong co trong mang");
        //in set giam dan
        Set<Float> hs1 = new TreeSet<Float>(Comparator.reverseOrder());
        hs1.addAll(hs);
        System.out.println("");
        System.out.println(hs1);
    }
}
