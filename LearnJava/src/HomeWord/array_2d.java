// bài 4 : : Tạo một ma trận gồm m dòng và n cột, trong đó mỗi phần tử củama trận là một giá trị nguyên được sinh ngẫu nhiên trong phạm vi [0, 50].Xuất ma trận ra màn hình. Tính tổng giá trị các phần tử của ma tr//
package HomeWord;
import java.util.Scanner;
import java.lang.*;
public class array_2d {
    public static void main(String[] args){
        int n;
        int m;
        int a[][];
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao dong : ");
        n = scanner.nextInt();
        System.out.print("nhap vao cot : ");
        m = scanner.nextInt();
        a = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.printf("a[%d][%d] = \n",i,j);
                a[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("Mang 2 chieu : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
               System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Tong cac so trong mang = ");
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                sum+= a[i][j];
            }
        }
        System.out.print(sum);
    }
}
