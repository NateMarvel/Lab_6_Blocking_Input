import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done1 = false;
        boolean done2 = false;
        double hypotenuse = 0;
        double area = 0;
        double perimeter = 0;
        do {
            System.out.print("Enter the width of your rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done1 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done1);
        do {
            System.out.print("Enter the height of your rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done2 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done2);
        hypotenuse = width * width + height * height;
        hypotenuse = Math.sqrt(hypotenuse);
        System.out.println("The length of the diagonal is: " + hypotenuse);
        perimeter = width + height + width + height;
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        area = height * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
