package TH7;

import java.util.Scanner;

public class ConNguoi {
    protected String ten;
    protected int namsinh;
    public ConNguoi(){
        ten = "";
        namsinh = 0;
    }
    public ConNguoi(String ten, int namsinh) {
        this.ten = ten;
        this.namsinh = namsinh;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten : ");
        ten = scanner.nextLine();
        System.out.print("Nhap vao năm sinh : ");
        namsinh = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Ho va ten : "+ten);
        System.out.println("Nam sinh : "+namsinh);
    }
}
class HocVien extends ConNguoi{
    double diem1;
    double diem2;
    double diem3;

    public HocVien(){
        super();
        diem1 = 0;
        diem2 = 0;
        diem3 = 0;
    }
    public HocVien(String ten,int namsinh, double diem1, double diem2 , double diem3){
        super(ten,namsinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vap diem 1: ");
        diem1 = scanner.nextDouble();
        System.out.print("Nhap vao diem 2: ");
        diem2 = scanner.nextDouble();
        System.out.print("Nhap vao diem 3: ");
        diem3 = scanner.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Diem 1: "+diem1);
        System.out.println("Diem 2: "+diem2);
        System.out.println("Diem 3: "+diem3);
    }
}

class NhanVien extends ConNguoi{
    protected float luong;
    protected int ngaybanviec;
    PhongBan pbk;
    public NhanVien(){
        super();
        this.luong = 0;
        this.ngaybanviec = 0;
        pbk = new PhongBan();
    }
    public  NhanVien(String ten, int namsinh, float luong, int ngaybanviec,PhongBan pbk){
        super(ten,namsinh);
        this.luong = luong;
        this.ngaybanviec = ngaybanviec;
        this.pbk = pbk;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao luong ");
        luong = scanner.nextFloat();
        System.out.println("Nhap vao ngay ban viec : ");
        ngaybanviec = scanner.nextInt();
        this.pbk.nhap();
    }
    public void xuat(){
        System.out.print("Luong : "+luong);
        System.out.println("Ngay ban viec : "+ngaybanviec);
        this.pbk.xuat();
    }
}
class PhongBan{
    protected int maPbk;
    protected String tenPBK;
    public PhongBan(){
        this.maPbk = 0;
        this.tenPBK= "";
    }
    public PhongBan(int maPbk , String tenPBK) {
        this.tenPBK = tenPBK;
        this.maPbk = maPbk;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao ma pb : ");
        maPbk = scanner.nextInt();
        System.out.print("Nhap vao ten pb : ");
        tenPBK = scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ten Phong ban : "+tenPBK);
        System.out.println("Ma pb : "+maPbk);
    }
}
class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sl ,loai =0,chon;
        ConNguoi ds[];
        ds = new ConNguoi[100];
        System.out.print("Nhap vao so luong nhan vien va hoc vien : ");
        sl = scanner.nextInt();
        for(int i = 0 ; i < ds.length ; i++){
            System.out.println("Nhap vao 1 de nhap nhan vien , nhap vao 2 de nhap hoc vien : ");
            System.out.print("Xin moi nhap : ");
            chon =  scanner.nextInt();
            if (chon != 1 || chon !=2){
                break;
            }
            if (chon == 1){
                ds[i] = new NhanVien();
            }
            else if(chon == 2){
                ds[i] = new HocVien();
            }
            ds[i].nhap();
        }
        //
        for (int i = 0 ; i < ds.length ; i++){
            ds[i].xuat();
        }
        //
        for (int j = 0 ; j < ds.length ; j++){
            System.out.print("Nhap vao 1 de xuat nhan vien, nhap vao 2 de xuat nhan vien : ");
            loai = scanner.nextInt();
            if (loai != 1 || loai !=2){
                break;
            }
            if (loai == 1){
                System.out.println("----Thong tin nhan vien----");
                ds[j] = new NhanVien();
                ds[j].xuat();
            }
            else if (loai == 2){
                System.out.println("----Thong tin hoc vien----");
                ds[j] = new  HocVien();
                ds[j].xuat();
            }
        }
    }
}