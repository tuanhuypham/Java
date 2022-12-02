package TH6;

import java.util.Scanner;

public class HANGHOA {
    protected String id;
    protected String nameProduct;
    protected long price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public HANGHOA(){
        this.id = "";
        this.nameProduct = "";
        this.price = 0;
    }
    public HANGHOA(String id, String nameProduct, long price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma hang hoa : ");
        this.id = scanner.nextLine();
        System.out.print("Ten hang hoa : ");
        this.nameProduct = scanner.nextLine();
        System.out.print("Gia hang hoa : ");
        this.price = scanner.nextLong();
    }
    public void uotput(){
        System.out.println("Ma hang : "+id);
        System.out.println("Ten hang : "+nameProduct);
        System.out.println("Gia hang : "+price+" VND");
    }
}
class HANGDM extends HANGHOA{
    private int hanbaohanh;
    private int dienap;
    private int congsuat;
    public HANGDM(){
        super();
        hanbaohanh = 0;
        dienap = 0;
        congsuat = 0;
    }
    public HANGDM(String id, String nameProduct, long price, int hanbaohanh, int dienap, int congsuat) {
        super(id, nameProduct, price);
        this.hanbaohanh = hanbaohanh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }
    public void nhap(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao han bao hanh : ");
        this.hanbaohanh = scanner.nextInt();
        System.out.print("Dien ap : ");
        this.dienap = scanner.nextInt();
        System.out.print("cong suat : ");
        this.congsuat = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("----Thong tin hang hoa dien may ----");
        super.uotput();
        System.out.println("Thoi han bao hanh la "+hanbaohanh+" nam");
    }
}
class HANGTP extends HANGHOA{
    protected int ngaysx;
    protected int ngayhethan;

    public HANGTP(){
        super();
        ngaysx = 0;
        ngayhethan = 0;
    }

    public HANGTP(String id, String nameProduct, long price, int ngaysx, int ngayhethan) {
        super(id, nameProduct, price);
        this.ngaysx = ngaysx;
        this.ngayhethan = ngayhethan;
    }

    public int getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(int ngaysx) {
        this.ngaysx = ngaysx;
    }

    public int getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(int ngayhethan) {
        this.ngayhethan = ngayhethan;
    }
    public void nhap(){
        super.input();
        Scanner scanner  = new Scanner(System.in);
        System.out.print("ngay san xuat");
        this.ngaysx = scanner.nextInt();
        System.out.print("ngay het han : ");
        this.ngayhethan = scanner.nextInt();
    }
    public void xuat(){
        super.uotput();
        System.out.println("Ngay san xuat : "+ngaysx);
        System.out.println("ngay het han : "+ngayhethan);
    }
}
class DSHANGHOA{
    private int n;
    private HANGHOA ds[];

    public DSHANGHOA(){
        n = 0;
        ds = new HANGHOA[n];
    }
    public DSHANGHOA(int n){
        this.n = n;
        ds = new HANGHOA[n];
    }
}
class demo{
    public static void main(String[] args) {

    }
}