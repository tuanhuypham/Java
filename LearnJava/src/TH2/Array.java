package TH2;

import java.util.Scanner;

public class Array {
    private int arr[];
    private int amount;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu vao mang : ");
        this.amount = scanner.nextInt();
        this.arr = new  int[amount];
        for(int i = 0 ; i < this.amount ; i++){
            System.out.printf("a[%d] = ",i);
            arr[i] = scanner.nextInt();
        }
    }
    void output(){
        for(int i = 0 ; i < this.amount ; i++){
            System.out.print(this.arr[i] + "\t");
        }
    }
    // trung bình cộng
    public void average(){
        int sum = 0;
        for(int i = 0 ; i < this.amount ; i ++){
            if(this.arr[i] % 2 != 0){
                sum+=arr[i];
            }
        }
        System.out.println();
        System.out.println("Trung binh  cong cua mang la : "+sum/this.amount);
    }
    public void biggestNumber(){
        int biggest = this.arr[0];
        for(int i = 0 ; i < this.amount ; i ++){
            if (this.arr[i] > biggest){
                biggest = this.arr[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : "+biggest);
    }
    public void bubbleSort(){
        for (int i = 0 ; i < this.amount - 1; i++){
            for(int j = amount -1 ; j > i; j--){
                if (this.arr[j] < this.arr[j-1]){
                    int index = this.arr[j];
                    this.arr[j] = this.arr[j-1];
                    this.arr[j-1] = index;
                }
            }
        }
        System.out.println("Mang sau khi xep tang dan");
        output();
    }
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}