package TH3;
public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        p1.input();
        p2.input();
        p1.output();
        p2.output();
        System.out.print("Cong hai phan so : ");
        p1.cong(p2).output();
        System.out.print("Tru hai phan so : ");
        p1.tru(p2).output();
        System.out.print("Nhan hai phan so : ");
        p1.nhan(p2).output();
        System.out.print("Chia hai phan so : ");
        p1.chia(p2).output();
    }
}
