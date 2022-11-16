package HomeWord;
import java.util.Scanner;
//Bài 9. Viết các chương trình: Xuất 100 số Fibonacci đầu tiên. Dãy Fibonacci : 1,1,2,3,5,8,… 2 số đầu là 1, các số sau bằng tổng 2 số trước nó.
public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Day so Fibonacci");
        System.out.print("Input F(n) : ");
        Scanner scanner = new Scanner(System.in);
        long  n = scanner.nextInt();
        for(long i = 0 ; i < n ; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(long n){
        if(n < 2){
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n-2);
    }
}
