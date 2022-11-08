package bassic;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap vao a: ");a = scanner.nextInt();
        System.out.println("Nhap vao b: ");b = scanner.nextInt();
        System.out.println("Truoc khi hoan doi");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int tem = a;
        a = b;
        b = tem;
        System.out.println("sau khi hoan doi");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}