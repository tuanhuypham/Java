// bài 10 nhập một ma trận bất kì tính tổng hàng thứ k
package HomeWord;
import java.util.Scanner;
import java.lang.*;
public class sumLineK {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao dong cot : ");
        int n = scanner.nextInt();
        int a[][],k;
        a = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("a[%d][%d] = \n",i,j);
                a[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("Ma tran vuong");
        for(int i = 0 ; i < n; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + "\t");
            }
        }
        System.out.print("\nnhap vao dong thu k : ");
        k = scanner.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n; i++){
           sum += a[k][i];
        }
        System.out.print("Tong dong K = "+sum);
    }
}
