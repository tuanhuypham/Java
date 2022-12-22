package TH9;
import TH4.HinhChuNhat;

import java.util.Scanner;

public interface Hinh {
    final public double pi = 3.14;
    public void input();
    public void output();
    public double dientich();
}
//
class HinhVuong implements Hinh{
    private double canh;
    Scanner scanner = new Scanner(System.in);

    public HinhVuong(){
        this.canh = 0;
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void input() {
        System.out.println();
        System.out.println("----- intput hinh vuong -----");
        System.out.print("Nhap vao canh cua hinh vuong : ");
        this.canh = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println();
        System.out.println("----- output hinh vuong -----");
        System.out.println("Chieu dai canh hinh chu nhat : "+canh);
        System.out.println("Dien tich hinh chu nhat : "+dientich());
    }
    @Override
    public double dientich() {
        return canh*canh;
    }
}
//
class Hinhchunhat implements Hinh{
    private double dai;
    private double rong;

    Scanner scanner = new Scanner(System.in);

    public Hinhchunhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Hinhchunhat(){
        this.dai =0;
        this.rong =0;
    }

    @Override
    public void input() {
        System.out.println();
        System.out.println("----- intput hinh chu nhat -----");
        System.out.print("Nhap Canh dai : ");
        this.dai = scanner.nextDouble();
        System.out.print("Nhap canh rong : ");
        this.rong = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println();
        System.out.println("----- output hinh chu nhat -----");
        System.out.println("Chieu dai hai canh : Chieu dai : "+dai+"||"+"Rong : "+rong);
        System.out.println("Dien tich hinh chu nhat : "+dientich());
    }
    @Override
    public double dientich() {
        return dai * rong;
    }
}
//
class HinhTron implements Hinh{

    private double banKinh;

    Scanner scanner = new Scanner(System.in);

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public HinhTron(){
        this.banKinh =0;
    }

    @Override
    public void input() {
        System.out.println();
        System.out.println("----- intput hinh tron -----");
        System.out.print("Nhap vao ban kinh hinh trong : ");
        banKinh = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println();
        System.out.println("----- output hinh chu nhat -----");
        System.out.println("ban kinh hinh tron : ");
        System.out.println("Dien tich hinh tron : "+dientich());
    }

    @Override
    public double dientich() {
        return pi*banKinh*banKinh;
    }
}
class main{
    public static void main(String[] args) {
        Hinh h;
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println();
            System.out.println("----- Hinh hoc -----");
            System.out.println("1. Hinh vuong");
            System.out.println("2. Hinh chu nhat ");
            System.out.println("3. Hinh tron ");
            System.out.println("0. de thoat");
            System.out.print("hay chon chuc nang : ");
            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    h = new HinhVuong();
                    h.input();
                    h.output();
                    break;
                case 2:
                    h = new Hinhchunhat();
                    h.input();
                    h.output();
                    break;
                case 3:
                    h = new HinhTron();
                    h.input();
                    h.output();
                    break;
                default:
                    if (chon == 0){
                        System.out.println();
                        System.out.println("Cam on ban da su dung chuong trinh !!!!!");
                    }

            }
        }while (chon != 0);
    }
}