package Aninals;

public class Animal {
  public void name(){
      System.out.println("this is Animal");
  }
  public void name(String loai,String lop){
      System.out.println("lop : "+lop);
      System.out.println("Loai : "+loai);
  }
}
class Cat extends Animal {
    public void name(){
        System.out.println("ten : meo anh chan dai");
    }
}

class demo{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name("meo","thu 4 chan");
        c.name();
    }

}