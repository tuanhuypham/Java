package TH1;
import java.util.Scanner;
class ListStudent{
    private Student list[];
    private int amount;

    public void inputList(){
        System.out.println("-----=====Nhap danh sach sinh vien=====-----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien vao danh sach : ");
        amount = scanner.nextInt();
        list = new  Student[amount];
        for(int i = 0 ; i < amount ;i++){
            System.out.printf("Sinh vien thu %d\n",i+1);
            list[i] = new Student();
            list[i].input();
        }
    }
    public void sort(){
        for(int i = 0 ; i < amount ; i++){
            for(int j = i+1; j <amount; j++){
                if(list[i].getDtb() > list[j].getDtb()){
                    Student index =list[i];
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
