package com.tdd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String checkNumber(int number)
    {
        String result="";
        if((number % 3 == 0) && (number % 5 == 0))
        {
            result= "FizzBuzz";
        }
        else
        {
            result = Integer.toString(number);
        }
        return result;


    }

}
