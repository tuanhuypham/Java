package Operator;

public class Operator {
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b , int c){
        return a+b+c;
    }
    public int sum(int a, int b ,int c ,int d){
        return a+b+c+d;
    }
}
class show{
    public static void main(String[] args) {
        Operator n = new Operator();
        System.out.println("Cong hai so : "+n.sum(1,2));
        System.out.println("cong ba so : "+n.sum(1,2,3));
        System.out.println("cong bon so : "+n.sum(1,2,3,4));
    }
}
