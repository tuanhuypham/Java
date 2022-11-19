package TH1;
import java.awt.*;
import java.util.Scanner;
public class Student1 {
    private String name;
    private float dtb;
    private String id;
    private int age;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten :");
        this.name = scanner.nextLine();
        //
        System.out.print("Nhap vao tuoi sinh vien : ");
        this.age = scanner.nextInt();
        //
        System.out.print("Nhap vao ma so sinh vien : ");
        this.id = scanner.next();
        //
        System.out.print("Nhap diem trung binh : ");
        this.dtb = scanner.nextFloat();
    }
    public void output(){
        System.out.println("Ten sinh vien : "+this.getName());
        System.out.println("Tuoi : "+this.getAge());
        System.out.println("Ma so sinh vien : "+this.getId());
        System.out.println("Diem trung binh sinh vien : "+this.getDtb());
    }

    public void rank(){
        if(this.dtb < 5){
            System.out.println("Xep loai : Yeu");
        } else if (this.dtb >= 5 && this.dtb <=6) {
            System.out.println("Xep loai : Trung binh");
        } else if (this.dtb > 6.4 && this.dtb <8) {
            System.out.println("Xep loai : Kha");
        }else if (this.dtb > 8 && this.dtb <=10){
            System.out.println("Xep loai : Gioi");
        }else if (this.dtb > 10){
            System.out.println("Vuot qua thang diem cho phep");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public float getDtb(){
        return dtb;
    }
    public void setDtb(float dtb){
        this.dtb=dtb;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >= 1 && age <= 150)
            this.age = age;
    }
}
class ListStudent{
    private Student1 list[];
    private int amount;

    public void inputList(){
        System.out.println("-----=====Nhap danh sach sinh vien=====-----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien vao danh sach : ");
        amount = scanner.nextInt();
        list = new  Student1[amount];
        for(int i = 0 ; i < amount ;i++){
            System.out.printf("Sinh vien thu %d\n",i+1);
            list[i] = new Student1();
            list[i].input();
        }
    }
    public void sort(){
        for(int i = 0 ; i < amount ; i++){
            for(int j = i+1; j <amount; j++){
                if(list[i].getDtb() > list[j].getDtb()){
                    Student1 index =list[i];
                    list[i] = list[j];
                    list[j] = index;
                }
            }
        }
        oututList();
    }
    public void oututList(){
        System.out.println("-----=====Danh sach sinh vien-----=====");
        for(int i = 0 ; i < amount ;i++){
            System.out.printf("Sinh vien thu %d\n",i+1);
            list[i].output();
            list[i].rank();
        }
    }
}