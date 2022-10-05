/*+----------------------------------------------------------------------
||
|| Class: [Authenticate]
||
|| Author: [Omar Omari]
||
|| Purpose: [The class contains methods to Authenticate a pin using using random numbers.
||             This class cotains methods that will be called back to the main method() ince its ran.]
||
|| Inherits From: [ AuthenticateDemo ]
||
|| Interfaces: [Supplier]
||
|+-----------------------------------------------------------------------
||
|| Constants: 
||    private int[] actualPassword = {2, 2, 3, 2, 1}; // Stores the actual password
||    private int[] randomNums = new int[10]; // Arraylist for 10 ints 0-9
||    private int[] enteredDigits = new int[actualPassword.length]; // stores the entered didgits from the user
|+-----------------------------------------------------------------------
||
|| Class Methods: [genRandomNum(), printRandomNum(), and inputUserEntry().]
||
|| Instance Methods: [genRandomNum(), printRandomNum(), and inputUserEntry().]
||
++-----------------------------------------------------------------------*/

import java.util.Scanner;

    public class Authenticate {

    private int[] actualPassword = {2, 2, 3, 2, 1};
    private int[] randomNums = new int[10];
    private int[] enteredDigits = new int[actualPassword.length];

    public void genRandomNum() {

            for (int i = 0; i < 10; i++) {
                    randomNums[i] = (int)(Math.random() * 3) + 1;
        }
    }

    public void printRandomNum() {

        System.out.println("Welcome! To log in, enter the random digits from 1-3 that");
        System.out.println("correspond to your PIN number.");
        System.out.println("PIN:  0 1 2 3 4 5 6 7 8 9");
        System.out.print("NUM:  ");

            for (int i = 0; i < 10; i++) {
                    System.out.print(randomNums[i] + " ");
        }
    }

    public void inputUserEntry () {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter code: ");
        String entered = input.next();

            for (int i = 0; i < entered.length(); i++) {
                enteredDigits[i] = entered.charAt(i) - '0';
        }
            if (ValidPassword(actualPassword, enteredDigits, randomNums)) {
                System.out.println("Correct! You many proceed.");
        }
            else {
                System.out.println("Error, invalid password entered.");
        }
    }


    private boolean ValidPassword(int[] actualPassword, int[] enteredDigits, int[] randomNums) {

        int Index = 0;
        boolean Valid = true;
        while (Valid && (Index < actualPassword.length)) {
            int Code = actualPassword[Index];

            if (enteredDigits [Index] != randomNums [Code]) {
                Valid = false;
        }
            Index++;
        }
        return Valid;
    }   
}
