//import scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//A program that starts with a credit card balance of $5000 and then calculates the interest at a rate
//of 17%.  Assume the user does not make any payments.  Display the interest due after one month
//and again after two months.
        //declare variables
        int ccBalance ;
        double ccInterestOneMonth ;
        double ccInterestTwoMonth ;
        //prompt user to enter their credit card balance
        System.out.println("Please enter your credit card balance:");
        //take the user input
        ccBalance = input.nextInt() ;
        //calculate next two months of interest
        ccInterestOneMonth = ccBalance * 0.17 ;
        ccInterestTwoMonth = ccInterestOneMonth * 2 ;
        //output the calculated interests to the user
        System.out.println("Your interest due after one month is $" + ccInterestOneMonth ) ;
        System.out.println("Your interest due after two months is $" + ccInterestTwoMonth ) ;
    }
}