package HomeWord;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
// Bài 7. Viết các chương trình tạo 1 mảng số int dạng in-line 10 phần tử, xuất mảng
//này tăng dần
public class arr_int_ascending {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu mang : ");
        int n = scanner.nextInt();
        int a[];
        a = new int[n];
        for(int i = 0 ; i < n ;i++){
            System.out.printf("a[%d] = \n",i);
            a[i] = (int) (Math.random() *100);
        }
        System.out.println("chua duoc xep ");
        for(int i =  0 ; i < n ; i++){
            System.out.print(a[i] + "\t");
        }
        // thuat toan sap xeo bb sort
        for(int i = 0 ; i < n -1 ; i++)
        {
            for(int j = n -1 ; j > i ; j--)
            {
                if(a[j] < a[j -1])
                {
                    int tem = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tem;
                }
            }
        }
        System.out.println("\nda duoc xep ");
        for(int i =  0 ; i < n ; i++){
            System.out.print(a[i] + "\t");
        }
    }
}
