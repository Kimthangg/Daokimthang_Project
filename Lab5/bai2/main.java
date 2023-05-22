package Lab5.bai2;
import java.util.*;
public class main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int n,m;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Nhap cac so nguyen: ");
        for(int i=0;i<n;i++){
            System.out.print("X "+(i+1)+": ");
            stack.push(sc.nextInt());
        }
        System.out.println("Nhap so phan tu can lay: ");
        m = sc.nextInt();
        for(int i=0;i<m;i++){
            System.out.print(stack.pop()+"\t");
        }
    }
}
