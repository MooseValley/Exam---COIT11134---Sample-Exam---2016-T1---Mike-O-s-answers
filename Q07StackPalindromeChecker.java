// Author: Mike O'Malley
// Source File: ExamQ07StackPalindromeChecker.java
// Description: All-In-One file for my tutorial answer.
// Stack using composition.
// Note: would make more sense to use a QUEUE - but the question said to use a STACK.

/*
  A simplified version of my tutorial answer:
  * W10Q02StackPalindromeChecker.java

  Changed over to use to Java Stack class.

  The code below could be simplified further because the Exam question does NOT ask us to:
  * get user input.
  * check for / strip out non-alphabetic chars.

/*
Sample Run / Output:

*** Palindrome Checker (using the Stack) ***

Enter a word or phrase (blank input to Quit): abcd
Stack: [a, b, c, d]

Is "abcd" a palindrome ?  false


*** Palindrome Checker (using the Stack) ***

Enter a word or phrase (blank input to Quit): a
Stack: [a]

Is "a" a palindrome ?  true


*** Palindrome Checker (using the Stack) ***

Enter a word or phrase (blank input to Quit): abba
Stack: [a, b, b, a]

Is "abba" a palindrome ?  true


*** Palindrome Checker (using the Stack) ***

Enter a word or phrase (blank input to Quit): zpz
Stack: [z, p, z]

Is "zpz" a palindrome ?  true


*** Palindrome Checker (using the Stack) ***

Enter a word or phrase (blank input to Quit):

Finished ....  have a nice day !  :)


*/

import java.util.Stack;
import java.util.Scanner;
import java.lang.Character;

public class Q07StackPalindromeChecker
{
   public static void main (String args[])
   {
      Stack <Character> myStack = new Stack <Character>();
      Scanner kbInput           = new Scanner (System.in);
      String inputString        = " ";
      boolean finished          = false;
      boolean palindromeFlag;

      while (finished == false)
      {
         System.out.println ("\n*** Palindrome Checker (using the Stack) ***");
         System.out.print ("\nEnter a word or phrase (blank input to Quit): ");
         inputString = kbInput.nextLine ().trim ();

         if (inputString.length () == 0)
         {
            finished = true; // Blank input => Exit loop.
         }
         else
         {
            //for (int k = 0; k < inputString.length(); k++)
            //   nextChar = inputString.charAt (k);
            for (char nextChar : inputString.toCharArray())
            {
               // Remove non-alphabetic letters.
               if (Character.isLetter (nextChar) == true)
               {
                  myStack.push (nextChar);  // Add letter to the TOP of the stack.
               }
            }

            System.out.println ("Stack: " + myStack);

            palindromeFlag    = true; // Assume it is a palindrome and try and prove this false.

            for (char inputChar : inputString.toCharArray())
            {
               if (inputChar != myStack.pop ())
                  palindromeFlag = false; // Letters do not match.
            }

            System.out.println ("\nIs \"" + inputString + "\" a palindrome ?  " + palindromeFlag + "\n");
         }
      } // while (finished == false)

      System.out.println ("\nFinished ....  have a nice day !  :)\n");

   } // public static void main

} // public class Q07StackPalindromeChecker
