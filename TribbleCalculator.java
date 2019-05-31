import java.util.Scanner;
import java.math.BigInteger;
/**
 * Calculate the size of a colony of tribbles.
 *
 * @author Curtice Gough
 * @version 05.31.19
 */
public class TribbleCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long startingTribbles = 0;
        int hours = 0;
        long baseInt;
        
        System.out.println("Welcome to the Tribble Calculator!\n");
        System.out.println("In the Star Trek universe, a tribble is a fuzzy little creature");
        System.out.println("that is loved by just about everyone (except Klingons).  They");
        System.out.println("have an average litter of 10 young every hour, perhaps making them");
        System.out.println("one of the most dangerous creatures in the universe.\n\n");
        
        System.out.print("How many tribbles will we start with? ");
        startingTribbles = in.nextInt();
        while(startingTribbles < 1) {
            System.out.println("Please enter a value greater than 0. ");
            startingTribbles = in.nextInt();
        }
        baseInt = 10 * startingTribbles;
        BigInteger litter = BigInteger.valueOf(baseInt);
        
        System.out.print("\nHow many hours will our tribbles be given to breed? ");
        hours = in.nextInt();
        while(hours < 1) {
            System.out.println("Please enter a value greater than 0. ");
            hours = in.nextInt();
        }
        
        System.out.println("\nAwesome!  Here we go.\n\n\nBreeding...");
        
        BigInteger product = litter.pow(hours);
        BigInteger bigStart =  BigInteger.valueOf(startingTribbles);
        BigInteger totalTribbles = product.add(bigStart);
        
        
        System.out.println("\n\n\nFinished!  Here are the results:");
        System.out.println("\nIf you left " + startingTribbles + " tribbles alone for " + hours + " hours,");
        System.out.println("you would come back to a massive pile of " + totalTribbles + " tribbles!.");
    }
}
