import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. yard to furlong");
        System.out.println("8. furlong to yard");
        System.out.println("9. foot-pound to british thermal unit");
        System.out.println("10. british thermal unit to foot-pound");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (feet * 0.3408);
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = (meters * 3.28084);
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 29.5735);
            System.out.println(in + " ounces is " + out + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 0.033814);
            System.out.println(in + " milliliters is " + out + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter yards: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 0.00454545);
            System.out.println(in + " yards is " + out + " furlongs");
        }
        if (selection == 8)
        {
            System.out.println("Enter furlong: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 220);
            System.out.println(in + " furlongs is " + out + " yards");
        }
        if (selection == 9)
        {
            System.out.println("Enter foot-pound: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 0.00128507);
            System.out.println(in + " foot-pounds is " + out + " british thermal units");
        }
        if (selection == 10)
        {
            System.out.println("Enter british thermal units: ");
            double in = keyboard.nextDouble();
            keyboard.nextLine();
            double out = (in * 778.170798);
            System.out.println(in + " foot-pounds is " + out + " british thermal units");
        }
        //add more if statements here.
    }
}