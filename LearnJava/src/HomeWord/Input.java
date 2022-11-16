// bài 2 : Nhập các thông tin của 1 sinh viên gồm mã sinh viên, họ tên, tuổi, năm sinh,
package HomeWord;
import java.awt.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        System.out.println("Input java");
        Scanner Input = new Scanner(System.in);
        String name,mssv;
        int age;
        int yearOfbrith;
        int mediumScore;
        System.out.print("Nhập vào họ và têm : ");
        name = Input.nextLine();
        System.out.print("Nhập vào mã số sinh viên : ");
        mssv = Input.nextLine();
        System.out.print("Nhập vào tuổi : ");
        age = Input.nextInt();
        System.out.print("Nhập vào năm sinh : ");
        yearOfbrith = Input.nextInt();
        System.out.print("Nhập vào điểm trung bình : ");
        mediumScore = Input.nextInt();
        System.out.println("----------=====Thông tin sin viên=====----------");
        System.out.println("Họ và tên : "+name);
        System.out.println("Mã số sinh viên : "+mssv);
        System.out.println("Tuổi : "+age);
        System.out.println("Năm sinh : "+yearOfbrith);
        System.out.println("Điểm trung bình : "+mediumScore);
        System.out.println("Cảm ơn bạn đã cung cấp thông tin : "+mediumScore);
    }
}