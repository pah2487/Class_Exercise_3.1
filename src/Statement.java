import java.util.Scanner;
/**
 * Statement uses a simple if statement to evaluate which option a user selects (integer)
 *@author Patrick H.
 *@since 2017-10-1
 *@version 1.0
 */
public class Statement {
    public static void main(String[] args){
        System.out.println("Please choose either '1' (println) or '2' (printf).");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //"choice" will be used for verifying the if-else statement

        if (choice == 1) {
            System.out.println("You chose option 1! \nHere's a simple print line statement!");
        }
        else if(choice == 2){
            System.out.printf("You chose: %s\n", "option 2");
            System.out.printf("%c is a character.\n", 'q');
            System.out.printf("%d is an integer.\n", 14522);
            System.out.printf("%e is an exponential floating point number.\n", 12345.67089);
            System.out.printf("%4f is a floating point number.", 2.43);
        }
        else{
            System.out.println("Boo! That's not an option!");
        }
        /* This logic creates 3 possible outcomes for when an integer is input
        *
        */
    }
}
