
// Programmer:     Cheng, Jeff
// Last Modified:  05-31-2024 08:47AM
// Problem:        Java Tutorial 2

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

//  name of the class == name of the file
public class JavaLessonTwo
{
    //  any time you want to create a scanner object, you must use the keyword new and scanner, always
    //  and then the input stream you want the scanner object to look at
    //  System.in == user's keyboard
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Your favorite number : ");

        if (userInput.hasNextInt())
        {
            //  string == nextLine()
            int numberEntered = userInput.nextInt();
            System.out.println("int numberEntered = " + numberEntered);
            
            //  alternatively, int numberEntered2 *= numberEntered;
            int numberEntered2 = numberEntered *2;
            System.out.println(numberEntered + " + " + numberEntered + " = " + Math.abs(numberEntered2));
            System.out.println("number entered vs number entered*2 (which is bigger) : " + Math.max(numberEntered2, numberEntered));
        }
        else
        {
            System.out.println("Enter an integer next time");
            //  Math.ceil returns a float automatically

            double numberEntered = 12.13;

            if (userInput.hasNextDouble())
            {
                numberEntered = userInput.nextDouble();
            }
        
            int numCeil = (int) Math.ceil(numberEntered);
            System.out.println("numbered entered (forced) = " + numCeil);
        }

        System.out.println("Enter a number for the upperbound to generate a random number : ");
        if (userInput.hasNextInt())
        {
            System.out.println("Some random number based on the number you entered as upperbound : " + Math.random()*(userInput.nextInt()+1));
        }
        else
        {
            System.out.println("Some random number between (0 and 10) : " + Math.random()*11);
        }
        /*
         *  multi-line comment
         */
    }
}