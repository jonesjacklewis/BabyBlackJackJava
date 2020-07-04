import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {

        int[] playerCards = {
                ThreadLocalRandom.current().nextInt(1, 11),
                ThreadLocalRandom.current().nextInt(1, 11),
        };

        int[] computerCards = {
                ThreadLocalRandom.current().nextInt(1, 11),
                ThreadLocalRandom.current().nextInt(1, 11),
        };

        int playerTotal = total(playerCards);
        int computerTotal = total(computerCards);

        System.out.println("Your cards are " + playerCards[0] + " and " +
                playerCards[1] +".");

        System.out.println("Your total is " + playerTotal + ".");

        System.out.println("The dealer's cards are " + computerCards[0] + " and " +
                computerCards[1] +".");

        System.out.println("The dealer's total is " + computerTotal + ".");

        if(playerTotal == computerTotal){
            System.out.println("The values are the same so it's a draw.");
        }else if(playerTotal>computerTotal){
            System.out.println("Your total is larger, so you win.");
        }else{
            System.out.println("The dealer has the highest score so you win.");
        }

        Scanner in  = new Scanner(System.in);
        in.nextLine();
        in.close();
    }

    private static int total(int[] cards){
        int totalValue = 0;
        for(int card: cards){
            totalValue += card ;
        }

        return totalValue;
    }
}
