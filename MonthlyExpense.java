import java.util.Scanner;
public class MonthlyExpense {

    public static void main (String args []){
        int rentDue;
        int groceriesRequired;
        int carExpense;
        int totalExpense;

            Scanner ahad=new Scanner(System.in);

        System.out.println("How much is rent");
        rentDue=ahad.nextInt();

        System.out.println("enter how much you spend on car monthly");
        carExpense=ahad.nextInt();

        System.out.println("how much do you spent on groceries");
        groceriesRequired=ahad.nextInt();

        totalExpense=carExpense+groceriesRequired+rentDue;

        System.out.println("your total monthly expense is "+totalExpense);

    }

}
