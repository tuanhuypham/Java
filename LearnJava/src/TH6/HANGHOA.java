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
    public void output(){
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
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao han bao hanh : ");
        this.hanbaohanh = scanner.nextInt();
        System.out.print("Dien ap : ");
        this.dienap = scanner.nextInt();
        System.out.print("cong suat : ");
        this.congsuat = scanner.nextInt();
    }
    public void output(){
        System.out.println("----==========----");
        super.output();
        System.out.println("Thoi han bao hanh la "+hanbaohanh);
        System.out.println("Dien ap : "+dienap+" V");
        System.out.println("Cong suat : "+congsuat+" W");
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
    public void input(){
        super.input();
        Scanner scanner  = new Scanner(System.in);
        System.out.print("ngay san xuat : ");
        this.ngaysx = scanner.nextInt();
        System.out.print("ngay het han : ");
        this.ngayhethan = scanner.nextInt();
    }
    public void output(){
        System.out.println("----==========----");
        super.output();
        System.out.println("Ngay san xuat : "+ngaysx);
        System.out.println("ngay het han : "+ngayhethan);
    }
}
class DSHANGHOA{
    private int n = 0;
    private HANGHOA ds[] = new HANGHOA[100];
    public void NhapHangHoa(){
        int chon = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong hang hoa : ");
        n = scanner.nextInt();
        for (int i = 0 ; i < n ; i ++){
            System.out.println("Chon nhap hang hoa hay dien may TP : 0, DM :1 : ");
            chon = scanner.nextInt();
            if(chon == 1){
                ds[i] = new HANGDM();
                ds[i].input();
            }
            else if (chon == 0){
                ds[i] = new HANGTP();
                ds[i].input();
            }
        }
    }
   public void XuatHangHoa(){
        for (int i = 0 ; i < n ; i++){
            ds[i].output();
        }
   }
   public void XuatTheoLoai(int loai){
        if(loai == 2 ){
            for(int i = 0 ;i < n  ; i++){
                if (ds[i] instanceof HANGDM){
                    System.out.println("----Thong tin hang hoa dien may ----");
                    ds[i].output();
                }
            }
        }
        else if (loai == 1){
            for(int i = 0 ;i < n  ; i++){
                if(ds[i] instanceof HANGTP){
                    System.out.println("----Thong tin hang thuc pham----");
                    ds[i].output();
                }
            }
        }
   }
   public void themMotHangHoa(HANGHOA h){
        ds[n] = h;
        n++;
   }
}
class demo{
    public static void main(String[] args) {
        byte chon;
        Scanner doc = new Scanner(System.in);
        DSHANGHOA dshh = new DSHANGHOA();
        HANGHOA h;
        do {
            System.out.println("1 them mot hang hoa vao danh sach : ");
            System.out.println("2 xua mat hang theo loai : ");
            System.out.println("0 thoat : ");
            System.out.println("moi chon chuc nang : ");
            chon = doc.nextByte();
            switch (chon){
                case 1:
                    h = new HANGHOA();
                    System.out.println("1 hang diem may, 2 hang thuc pham, hay chon mat hang : ");
                    byte loai = doc.nextByte();
                    if (loai ==1){
                        h = new HANGDM();
                    }
                    else if(loai == 2){
                        h = new HANGTP();
                    }
                    h.input();
                    dshh.themMotHangHoa(h);
                    break;
                case 2:
                    System.out.println("Xuat danh sach theo loai mat hang : Hang thuc pham 1, Hang dien may 2 : ");
                    int type = doc.nextInt();
                    dshh.XuatTheoLoai(type);
                    break;
                default:
                    if (chon ==0)
                        System.out.println("Cam on da su dung chuong trinh !!!!!!");break;
            }
        }while (chon != 0);
    }
}