// Bài 6. Viết các chương trình xuất trị bình phương , lập phương từ 1 đến 10.
package HomeWord;
import java.util.Scanner;
public class squared_value {
    public static void main(String[] ags){
        int n = 2;
        System.out.println("Tri binh phuong la tu 1 den 10");
        for (int i = 1 ; i <= 10 ; i++){
            System.out.printf("%d * 2 = %d\n",i,i*i);
        }
        System.out.println("Tri lap phuong la tu 1 den 10");
        for (int i = 1 ; i <= 10 ; i++){
            System.out.printf("%d * 2 = %d\n",i,i*i*i);
        }
    }
}