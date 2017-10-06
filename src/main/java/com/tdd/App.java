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

    public  String checkBuzz(Integer  no) {
        if (no % 5 == 0) {
            return "Buzz";
        } else {
            return no.toString();
        }
    }
}
