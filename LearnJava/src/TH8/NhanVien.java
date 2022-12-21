package TH8;

import java.util.Scanner;

public abstract class NhanVien {
    protected String id;
    protected String name;
    protected String trinhDo;
    protected double luongcb;

    Scanner s = new Scanner(System.in);

    public NhanVien() {
        this.id = "";
        this.name = "";
        this.trinhDo = "";
        this.luongcb = 0;
    }

    public NhanVien(String id, String name, String trinhDo, double luongcb) {
        this.id = id;
        this.name = name;
        this.trinhDo = trinhDo;
        this.luongcb = luongcb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public void input(){
        System.out.print("Nhap vao ten : ");
        this.name = s.nextLine();
        System.out.print("Nhap vao ma so : ");
        this.id = s.nextLine();
        System.out.print("Trinh do : ");
        this.trinhDo = s.nextLine();
        System.out.print("Luong co ban : ");
        this.luongcb = s.nextFloat();
    }
    public void output(){
        System.out.println("Ten : "+this.name);
        System.out.println("Ma so : "+this.id);
        System.out.println("Trinh do : "+this.trinhDo);
        System.out.println("Luong co ban : "+this.luongcb);
    }
    public abstract double tinhLuong();
}
 class NhanVienQuanLi extends NhanVien{
    protected String chuyenMon;
    protected double phuCap;

    public NhanVienQuanLi(){
        super();
        this.chuyenMon = "";
        this.phuCap = 0;
    }
    Scanner s = new Scanner(System.in);

    public NhanVienQuanLi(String id, String name, String trinhDo, double luongcb, String chuyenMon, double phuCap) {
        super(id, name, trinhDo, luongcb);
        this.chuyenMon = chuyenMon;
        this.phuCap = phuCap;
    }
    public double tinhLuong(){
        double luong;
        luong = this.luongcb + this.phuCap;
        return luong;
    }
    @Override
    public void input(){
        super.input();
        System.out.print("Chuyen mon : ");
        this.chuyenMon = s.nextLine();
        System.out.print("Phu cap : ");
        this.phuCap = s.nextDouble();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Chuyen mon : "+this.chuyenMon);
        System.out.println("Phu cap : "+this.phuCap);
        System.out.println("Tong luong : "+tinhLuong());
    }
}
 class NhanVienNghienCuu extends NhanVien{
    private String chuyenMon;
    protected double phuCapdh;

    Scanner s = new Scanner(System.in);

    public NhanVienNghienCuu() {
        super();
        this.chuyenMon = "";
        this.phuCapdh = 0;
    }

    public NhanVienNghienCuu(String id, String name, String trinhDo, double luongcb, String chuyenMon, double phuCapdh) {
        super(id, name, trinhDo, luongcb);
        this.chuyenMon = chuyenMon;
        this.phuCapdh = phuCapdh;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapdh() {
        return phuCapdh;
    }

    public void setPhuCapdh(double phuCapdh) {
        this.phuCapdh = phuCapdh;
    }
    @Override
    public void input(){
        super.input();
        System.out.print("Chuyen mon : ");
        this.chuyenMon = s.nextLine();
        this.phuCapdh = s.nextDouble();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Chuyen mon : "+chuyenMon);
        System.out.println("Phu cap doc hai : "+phuCapdh);
    }
    public double tinhLuong(){
        return this.luongcb + this.phuCapdh;
    }
}
class NhanVienphucvu extends NhanVien{
    public NhanVienphucvu() {
        super();
    }

    public NhanVienphucvu(String id, String name, String trinhDo, double luongcb) {
        super(id, name, trinhDo, luongcb);
    }
    @Override
    public void input(){
        super.input();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Tong luong : "+tinhLuong());
    }
    public double tinhLuong(){
        return luongcb;
    }
}
class DanhSachNhanVien{
    private NhanVien nv;
    private NhanVien list[];
    private int n;
    public DanhSachNhanVien(){
        this.list = new NhanVien[100];
        this.n = 0;
    }
    Scanner s = new Scanner(System.in);
    public void inputList(){
        int chon = 0;
        System.out.print("Nhap vao so luong nhan vien : ");
        n = s.nextInt();
        for(int i =0 ; i < n ;i++){
            System.out.println("-----=====Dien thong tin nhan vien=====-----");
            System.out.println("1 la nhan vien quan li");
            System.out.println("2 la nhan vien nghien cuu");
            System.out.println("3 la nhan vien phuc vu");
            System.out.print("hay chon chuc nang : ");
            chon = s.nextInt();
            if (chon == 1){
                list[i] = new NhanVienQuanLi();
                list[i].input();
            }
            if(chon == 2){
                list[i] = new NhanVienNghienCuu();
                list[i].input();
            }
            if (chon  == 3 ) {
                list[i] = new NhanVienphucvu();
                list[i].input();
            }
        }
    }
    public void outputListType(){
        int type = 0;
        for(int i = 0 ; i < list.length; i++){
            System.out.println("-----=====Thong tin nhan vien=====-----");
            System.out.println("1 la nhan vien quan li");
            System.out.println("2 la nhan vien nghien cuu");
            System.out.println("3 la nhan vien phuc vu");
            System.out.print("hay chon chuc nang : ");
            type = s.nextInt();
            if (type == 1){
                list[i] = new NhanVienQuanLi();
                System.out.println("-----=====Thong tin nhan vien quan li=====-----");
                list[i].output();
            }
            if (type == 2){
                list[i] = new NhanVienNghienCuu();
                System.out.println("-----=====Thong tin nhan vien nghien cuu=====-----");
                list[i].output();
            }
            if (type == 3){
                list[i] = new NhanVienphucvu();
                System.out.println("-----=====Thong tin nhan vien phuc vu=====-----");
                list[i].output();
            }
        }
    }
    public void outputLuong(){
        int loai;
        for(int i = 0 ; i < n; i++){
            System.out.println("-----=====Xuat luong theo loai=====-----");
            System.out.println("1 la nhan vien quan li");
            System.out.println("2 la nhan vien nghien cuu");
            System.out.println("3 la nhan vien phuc vu");
            System.out.print("hay chon chuc nang : ");
            loai = s.nextInt();
            if (loai == 1){
            }
        }
    }
}
class main{
    public static void main(String[] args) {
        DanhSachNhanVien n = new DanhSachNhanVien();

    }
}

