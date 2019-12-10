import java.util.Scanner;
public class Bats {

    public static void main (String []args){

        int batsNeeded;
        int batsNeededForTeam;
        int totalBatsRequired;

        Scanner ahad = new Scanner(System.in);

        System.out.println("please enter the number of bats you need for yourself");
         batsNeeded=ahad.nextInt();

        System.out.println("Now enter  the number of bats required for the team");
        batsNeededForTeam=ahad.nextInt();

        totalBatsRequired=batsNeeded+batsNeededForTeam;

        System.out.println("total bats you have to buy is "+totalBatsRequired);

    }

}
