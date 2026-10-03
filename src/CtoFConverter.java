import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean done = false;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Your temperature in Fahrenheit is: " + fahrenheit);
    }

}
