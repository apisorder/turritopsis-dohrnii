
// Programmer:     Cheng, Jeff
// Last Modified:  05-16-2024 10:47AM
// Problem:        Java Tutorial 1

public class HelloWorld1
{
    static String randomString = "String to print";
    static final double PINUM = 3.141529;

    public static void main(String[] args)
    {
        System.out.println("String literal = Hello World");
        System.out.println("static String randomString = " + randomString);
        System.out.println("static final double PINUM = " + PINUM);

        int integerOne = 21, integerTwo 
        = 
        integerOne 
        + 1; 
        System.out.println("int integerTwo = " + integerTwo);
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1234567890D;

        System.out.println("byte bigByte = " + bigByte);
        System.out.println("short bigShort = " + bigShort);
        System.out.println("int bigInt = " + bigInt);
        System.out.println("long bigLong (terminating L required) = " + bigLong);
        System.out.println("float bigFloat = " + bigFloat);
        System.out.println("double bigDouble (terminating D optinal)= " + bigDouble);

        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        boolean trueOrFalse = true;
        char randomChar = 65;
        char anotherChar = 'A';

        System.out.println("boolean trueOrFalse = " + trueOrFalse);
        System.out.println("char = " + randomChar);
        System.out.println("anotherChar = " + anotherChar);

        String randomString2 = "I'm a random string";
        String anotherString = "Stuff";
        String andAnotherString = randomString2 + ' ' + anotherString;
        System.out.println("String andAnotherString = " + andAnotherString);
        
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong); 
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

        System.out.println("String byteString = Byte.toString(bigByte) = " + byteString);
        System.out.println("String shortString = Short.toString(bigShort) = " + shortString);
        System.out.println("String longString = Long.toString(bigLong) = " + longString);
        System.out.println("String floatString = Float.toString(bigFloat) = " + floatString);
        System.out.println("String doubleString = Double.toString(bigDouble) = " + doubleString);
        System.out.println("String booleanString = Boolean.toString(trueOrFalse) = " + booleanString);

        double aDoubleValue = 3000000000000.14546466464;
        int doubleToInt = (int) aDoubleValue;

        System.out.println("int doubleToInt = (int) aDoubleValue = " + doubleToInt);
        
        int stringToInt = Integer.parseInt(intString);
        System.out.println("int stringToInt = Integer.parseInt(String intString = Integer.toString(bigInt)) = " + stringToInt);

    }
}
