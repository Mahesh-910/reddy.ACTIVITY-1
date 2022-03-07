import java.util.Scanner;


public class Activity3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String teamname = sc.nextLine();
        System.out.println("Enter session:\r");
        String session=sc.nextLine();
        System.out.println("Enter runs:\r");
        int run=sc.nextInt();
	String scon=session.toUpperCase();
        if(scon.equals("FIRST"))
        {
            ++run;
            System.out.println("Name:" + teamname);
            System.out.println("Scored:" + session);
            System.out.println("Need " + run + " to win");
        }
       else if(scon.equals("SECOND")){
           System.out.println("Name:" + teamname);
           System.out.println("Scored:" + run);
           System.out.println("Matched Ended.");