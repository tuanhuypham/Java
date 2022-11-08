package bassic;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        System.out.println("\n-------Test True or Fails Triangle--------------");
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap canh a");
        a = scanner.nextInt();
        System.out.println("Nhap vap canh a");
        b = scanner.nextInt();
        System.out.println("Nhap vap canh a");
        c = scanner.nextInt();
        if (a+b>c && a+c>b && b+c > a){
            System.out.println("day la mot tam giac");
        }else {
            System.out.println("day khong phai la mot tam giac");
        }
    }
}
