package Try;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int amoutn =0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so nguyen : ");
            amoutn =scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("loi roi nha qui di !!!!");
        }
    }
}
