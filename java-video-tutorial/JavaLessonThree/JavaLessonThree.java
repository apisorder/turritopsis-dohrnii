
// Programmer:     Cheng, Jeff
// Last Modified:  05-31-2024 07:55PM
// Problem:        Java Tutorial 3

public class JavaLessonThree 
{
    public static void main(String[] args)
    {
        int defaultValue = (int) (Math.random() * 50);
        System.out.println("Default value = : " + defaultValue);

        int randomNumber = (int) (Math.random() * 50);

        if (randomNumber < 25)
        {
            System.out.println("The random number is less than 25 : " + randomNumber);
        }
        else if (randomNumber == 25)
        {
            System.out.println("The random number is equal to 25 : " + randomNumber);
        }
        else
        {
            System.out.println("The random number is greater than 25 : " + randomNumber);
        }

        int biggestValue = (defaultValue > randomNumber) ? defaultValue: randomNumber;
        System.out.println("biggestValue : " + biggestValue);
    }    
}
