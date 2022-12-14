package TODO;
/**
 * 1 [ ] Di cho
 * 2 [x] Tap the duc
 * 3 [x] Rua chen
 */

/**
 * 1. show todo list
 * 2. check/uncheck todo
 * 3. add new todo
 * 4. delete a todo
 */
import TH2.Array;
import TH3.Main;

import java.util.LinkedHashSet;
import java.util.random.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TodoList {
 *     TodoItem[] todoItems = []
 *     void showList()
 *     void toggle(int Index)
 *     void addItem(String content)
 *     void deleteItem(int Index)
 * }
 *
 * TodoItem {
 *     Boolean isChecked =  false;
 *     String content = '';
 *
 *     get/set => isCheck
 *     get/set content
 * }
 */
class TodoItems{
    private String content;
    private boolean ischeck;

    public int state;

    public TodoItems(){
        ischeck = false;
        content = "";
        if(state == 1){
            ischeck = true;
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public TodoItems(String content, boolean ischeck) {
        this.content = content;
        this.ischeck = ischeck;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIscheck() {
        return ischeck;
    }

    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }
//    public void add(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap vao cong viec : ");
//        content = scanner.nextLine();
//        System.out.print("Nhap vao trang thai cong viec : 1 la da xong || 0 la chua ");
//        state = scanner.nextInt();
//    }
    public void show(){
        if (state == 0){
            System.out.println(content+"[ ]");
        }else if (state == 1){
            System.out.println(content+"[x]");
        }
    }
}
class TodoList{
    private ArrayList<TodoItems> list;
    public TodoList(ArrayList<TodoItems> list) {
        this.list = list;
    }

    public TodoList() {
        this.list = new ArrayList<TodoItems>();
    }
    public void themcongviec(TodoItems todo){
        this.list.add(todo);
    }
//    public void addList(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap vao so luong cong viec : ");
//        amount = scanner.nextInt();
//
//        for(int i = 0; i < amount ; i++){
//            list[i] = new TodoItems();
//            list[i].add();
//        }
//    }
//    public void showList(){
//        for (int i = 0; i < amount ; i++){
//            System.out.print(i+1+". ");
//            list[i].show();
//        }
//    }
}
public class app {
    public static void main(String[] args) {
        int chon;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 : Them cong viec");
            System.out.println("2 : show list cong viec");
            System.out.println("1 : Them moi mot cong viec");
            System.out.println("0 : thoat todo");
            System.out.print("Moi chon chuc nang : ");
            chon = scanner.nextInt();
            switch (chon){
                case 1:

                    break;
//                case 2:
//                    break;
                default:
                    if (chon == 0){
                        System.out.println("Da thoat !!!");
                        break;
                    }
            }
        }while (chon != 0);
    }
}
class main{
    // 1 mang A 50 phan tu, sinh ra 50 so ngay nhien
    // tao ra 1 mang moi voi tu mang tren ma cac phan tu trong do khong trung lap
    // trong mang a tim ra 3 so lon 3 so nho
    // tao mang moi chi lay vi tri le
    static int a[] = new int[50];
    public static void add(){
        for (int i = 0 ; i < a.length ; i++){
            a[i] =  (int)(Math.random()*100);
        }
    }
     public static void show(){
        for (int j = 0 ; j <a.length; j++){
            System.out.print(a[j] + " ");
        }
    }
    public static void khongtrungnhau(){
        for (int i = 0 ; i < a.length;i++){
            if (a[i] != a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void mangvitrile(){
        for(int k = 0 ; k < a.length; k++){
            if(k % 2 != 0 ){
                System.out.print(a[k] + " ");
            }
        }
    }
    public static void max3phantu(){
        int max1 = 0 , max2 =0 , max3 = 0;
        for(int i1 = 0 ; i1 <a.length; i1++){
            if (a[i1] > max1) {
                max1 = a[i1];
            }
        }
        for(int i = 0 ; i < a.length ;i++){
            if (a[i] == max1){
                continue;
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        for (int i2 = 0 ;i2 < a.length; i2++){
            if (a[i2] == max2 || a[i2] == max1){
                continue;
            }
            else if(a[i2] > max3){
                max3 = a[i2];
            }
        }
        System.out.println(max1+" "+max2+" "+max3);
    }
    public static void min3phantu(){
        int max = 100;
        int min1 = max , min2 =max , min3 =max ;
        for(int i = 0 ; i <a.length ; i++){
            if (min1 > a[i]){
                min1 = a[i];
            }
        }
        for(int i1 = 0 ; i1 < a.length ; i1++){
            if(a[i1] == min1){
                continue;
            }
            else if(min2 > a[i1] ){
                min2 = a[i1];

            }
        }
        for(int i2 =0 ; i2 < a.length ; i2++){
            if (a[i2] == min1|| a[i2] == min2){
                continue;
            }
            if (a[i2] < min3){
                min3 = a[i2];
            }
        }
        System.out.println(min1 + " "+min2 + " "+min3);
    }
    public static void main(String[] args) {
        add();
        System.out.println("Mang ban dau :");
        show();
        System.out.println("mang co 3 phan tu lon nhat");
        max3phantu();
        System.out.println("mang co 3 phan tu be nhat");
        min3phantu();
        System.out.println("mang co phan tu vi tri le ");
        mangvitrile();

    }
}
