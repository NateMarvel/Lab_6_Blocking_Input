import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double priceOfGasGallon = 0;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        double costFor100Miles = 0;
        double fullTankRange = 0;
        do {
            System.out.print("Enter the number of gallons that your tank can hold: ");
            if (in.hasNextDouble()){
                gallonsInTank = in.nextDouble();
                in.nextLine();
                done1 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done1);
        do {
            System.out.print("Enter the miles per gallon for your vehicle: ");
            if (in.hasNextDouble()){
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done2 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done2);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                priceOfGasGallon = in.nextDouble();
                in.nextLine();
                done3 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done3);
        costFor100Miles = (100 / milesPerGallon) * priceOfGasGallon;
        System.out.println("The cost for you to travel 100 miles is: " + costFor100Miles);
        fullTankRange = gallonsInTank * milesPerGallon;
        System.out.println("The distance in miles you can travel on a full tank is " + fullTankRange);
    }
}
