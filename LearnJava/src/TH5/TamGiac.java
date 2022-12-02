package TH5;
import java.util.Scanner;

public class TamGiac {
    private float a;
    private float b;
    private float c;

    public TamGiac() {
        this.a=1;
        this.b=1;
        this.c=1;
    }
    public void nhap(){
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap vao canh a : ");
            a = scanner.nextFloat();
            System.out.print("nhap vao canh b : ");
            b = scanner.nextFloat();
            System.out.print("nhap vao canh c : ");
            c = scanner.nextFloat();
        }while (a+b<c || b+c < a || a+c < b);

    }
    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public TamGiac(TamGiac t){
        this.a = t.a;
        this.b = t.b;
        this.c = t.c;
    }
    public float chuvi(){
        return a+b+c;
    }
    public double dientich() {
        double p = 0;
        p = this.chuvi() / 2;
        double s = 0;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    @Override
    public String toString() {
        return String.format("chu vi : %4.2f\ndien tich : %4.2f ", chuvi(), dientich());
    }
    public void xuat(){
        System.out.println("Chu vi va dien tich hinh tam giac \n"+toString());
    }
}
