package TH4;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        int sl;
        Scanner scanner = new Scanner(System.in);
        sl = scanner.nextInt();
        danhsach h = new danhsach(sl);
        h.nhap();
        h.xuat();
    }
}