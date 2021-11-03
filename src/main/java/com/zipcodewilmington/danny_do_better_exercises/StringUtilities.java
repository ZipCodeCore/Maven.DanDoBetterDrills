package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
       String helloWorld = "Hello World";

        return helloWorld;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return (firstSegment + secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        //you're combining an int w/ a string = however you'll be returning a string because the method is calling for a string return.
        //Therefore you have to convert an int into a string. In order to combine them together.
        String stringFirstSegment = Integer.toString(firstSegment); //converting an int into a string - Integer.toString (static method) <- class method, used directy on the class Math.pow(); System.out.println().

        return concatenation (stringFirstSegment,secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        //get the first 3 letters of the String input; input = inp;
        //

        return (input.substring(0,3));
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){

        return input.substring(2,5);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        //comparing two inputs to see if they are equivelent
        //using Boolean (true/false) to compare if they are the same

        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        //first convert the string into an int
        //take the new string = integer, and divide it by two

        int getMiddleCharacter = inputValue.length();
        //convert the string inputValue into an integer; rename main method with new method String
        int middleChar = (getMiddleCharacter/2)-1;
        //giving (type) int a (variable)middleChar = (variable)getMiddleCharacter divided by 2 (dividing the total letters by 2; minus 1 because the total string was even.
        char c = inputValue.charAt(middleChar);
        //char c = method to extract the middle char = inputValue (original).charAt(method)(new variable middleChar);
        return c;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        //first convert the string into an int
        //take the new string = integer, and divide it by two


        return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        return null;
    }
}
