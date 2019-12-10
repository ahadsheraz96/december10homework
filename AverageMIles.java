import java.util.Scanner;
public class AverageMIles {


    public static void main (String args[]){
        String firstName;
        String lastName;
        String fullName;

        firstName="ahad";
        lastName="sheraz";
        fullName=firstName+" "+lastName;

        System.out.println("your full name is "+fullName);
        Scanner ahad=new Scanner(System.in);
        int dailyMiles;

        System.out.println("enter your daily miles");
        dailyMiles=ahad.nextInt();

        int averageMonthlyMiles=(dailyMiles*30);
        System.out.println("your average monthly miles are "+averageMonthlyMiles);


    }
}
