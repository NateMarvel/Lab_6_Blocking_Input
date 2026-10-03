import java.util.Scanner;
import java.util.Random;
public class HighOrLow
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1;
        int guess = 0;
        String output = "";
        boolean done = false;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("You have to enter a number between 1 and 10");
                }
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount");
            }
        } while (!done);
        if (guess == val) {
            System.out.println("You got it on the money!");
        } else if (guess < val){
            System.out.println("Your guess was low: " + guess);
        }
        else {
            System.out.println("Your gusee was high: " + guess);
        }
    }
}
