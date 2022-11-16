// Bài 5. Viết các chương trình xuất bảng cửu chương từ 2 đến 9.
package HomeWord;
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args){
        int n;
        System.out.print("nhap vao bang cuu chuong : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int  i = 1 ; i < 10; i++){
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }
}