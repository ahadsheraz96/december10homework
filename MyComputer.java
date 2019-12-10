import java.util.Scanner;

public class MyComputer {
    public static void main (String args[]){

        MyComputer ahad=new MyComputer();
         ahad.print();
         ahad.addingNumbers();
         ahad.carIDrive();
    }
    public void print(){
        System.out.println("i can print anything");
    }
    public void addingNumbers(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("your sum is "+sum);
    }
     public void carIDrive(){
        String car="Honda";
         System.out.println("you drive "+car);
         System.out.println(car.length());
     }

}
