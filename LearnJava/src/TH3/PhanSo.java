package TH3;
import java.util.Scanner;
public class PhanSo {
    private int tu; // khai bao thuoc tinh

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    private int mau;
    public PhanSo(){ // phuong thuc mac nhien k co doi so tra ve
        tu = 0;
        mau = 1;
    }
    public PhanSo(int tu, int mau) { // phuong thuc xay dung co2 doi so
        tu = tu;
        mau = mau;
    }
    public PhanSo(PhanSo p){ // phuong thuc xay dung sao chep
        this.tu = p.tu; // gan gia tri cua p cho thuc tinh cua minh
        this.mau = p.mau;
    }
    public int UCLN(int a,int b){
        while(a!=b){
            if(a > b){
                a = a-  b;
            }
            else {
                b = b- a;
            }
        }
        return a;
    }
    public void rutgon(){
        int i = UCLN(tu,mau);
        tu /= i;
        mau /= i;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao tu so : ");
        tu = scanner.nextInt();
        do {
            System.out.print("nhap vao mau so : ");
            mau = scanner.nextInt();
        }while (mau == 0);
    }
    public void swap(){
        int index = tu;
        tu = mau;
        mau = index;
        output();
    }
    public void output(){
        System.out.println("Phan so la : "+tu+"/"+mau);
    }
    public PhanSo cong(PhanSo a){
        PhanSo kq = new PhanSo();
        kq.mau = this.mau *a.mau;
        kq.tu = this.tu *a.mau + this.mau*a.tu;
        kq.rutgon();
        return kq;
    }
    public PhanSo tru(PhanSo a){
        PhanSo kq = new PhanSo();
        kq.mau = this.mau *a.mau;
        kq.tu = this.tu *a.mau - this.mau*a.tu;
        kq.rutgon();
        return kq;
    }
    public PhanSo nhan(PhanSo a){
        PhanSo kq = new PhanSo();
        kq.mau = this.mau * a.mau;
        kq.tu = this.tu * a.tu;
        kq.rutgon();
        return kq;
    }
    public PhanSo chia(PhanSo a){
        PhanSo kq = new PhanSo();
        kq.tu = this.getTu() * a.mau;
        kq.mau = this.getMau() * a.getTu();
        kq.rutgon();
        return kq;
    }

}