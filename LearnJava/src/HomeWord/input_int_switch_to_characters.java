package HomeWord;
import java.lang.*;
import java.util.Scanner;
// Bài 8. Viết các chương trình nhập 1 mảng int các số mang giá trị là mã của các ký tự
public class input_int_switch_to_characters {
    public static void main(String[] args){
        int n;
        int a[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu mang : ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0 ; i <a.length;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = scanner.nextInt() ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
        for(int i = 0 ; i < n ; i++){
            if(a[i] < 0){
                System.out.println("Bé hơn Không");
            }
            if(a[i] == 0){
                System.out.println("khong");
            }
            if(a[i] == 1){
                System.out.println("Một");
            }
            if(a[i] == 2){
                System.out.println("Hai");
            }
            if(a[i] == 3){
                System.out.println("Ba");
            }
            if(a[i] == 4){
                System.out.println("Bốn");
            }
            if(a[i] == 5){
                System.out.println("Năm");
            }
            if(a[i] == 6){
                System.out.println("Sáu");
            }
            if(a[i] == 7){
                System.out.println("Bảy");
            }
            if(a[i] == 8){
                System.out.println("Tám");
            }
            if(a[i] == 9){
                System.out.println("Chín");
            }
            if(a[i] == 10){
                System.out.println("Chín");
            }
            if(a[i] > 10){
                System.out.println("Lớn hơn 10");
            }
        }
    }
}
