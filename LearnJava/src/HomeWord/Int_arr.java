// Bài 3: Nhập 1 mảng các số nguyên từ bàn phím. Tìm phần tử lớn nhất trong mảng.
package HomeWord;
import java.util.Scanner;
public class Int_arr {
    public static void main(String[] args){
       int n;
       int a[];
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhap vao so luong phan tu mang : ");
       n = scanner.nextInt();
       a = new int[n];
       for (int i = 0 ; i <a.length;i++){
           System.out.printf("a[%d] = ",i);
           a[i] = scanner.nextInt();
       }
       for(int j = 0 ; j < a.length ; j++){
           System.out.print(a[j] + " ");
       }

       int max = a[0];
       for (int i = 0 ; i < a.length; i++)
       {
           if(a[i] > max)
           {
               max = a[i];
           }
       }
       System.out.println("max = "+max);
    }
}
