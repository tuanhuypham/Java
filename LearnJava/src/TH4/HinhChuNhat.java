package TH4;
import java.util.Scanner;
public class HinhChuNhat
{
    private float dai;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    private float rong;
    public HinhChuNhat(){
        this.dai = 1;
        this.rong = 1;
    }

    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public HinhChuNhat(float canh){
        dai = canh;
        rong = canh;
    }
    public float chuvi(){
        return (dai+rong)*2;
    }
    public float dientich(){
        float s = 0;
        s = (dai*rong);
        return s;
    }

    @Override
    public String toString() {
        return String.format("chu vi hinh chu nhat la %4.2f, dien tich la %4.2f ", chuvi(), dientich());
    }
}
class danhsach{
    private HinhChuNhat list[];
    private int n;

    public danhsach(int n){
        this.n=n;
        list = new HinhChuNhat[n];
    }
    public danhsach(){
        n = 1;
        list = new HinhChuNhat[1];
    }
    public void nhap(){
        float d,r;
        for(int i = 0 ; i < n ; i++){
            System.out.println("hinh chu nhat thu : "+i);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chieu dai : ");
            d = scanner.nextFloat();
            System.out.print("Nhap chieu rong : ");
            r = scanner.nextFloat();
            System.out.println("Nhap vao hinh chu nhat thu : "+i+1);
            list[i] = new HinhChuNhat();
        }
    }
    public void xuat(){
        for(int i = 0 ; i < n ; i++){
            System.out.println(list[i]);
        }
    }
}
