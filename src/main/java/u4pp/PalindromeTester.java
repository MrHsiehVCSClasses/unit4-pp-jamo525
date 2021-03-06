package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
     

    public static void execute(Scanner sc) {
        String playerWantToPlay;
        String playerPalendrome;
        boolean keepPalendroming = true;
        boolean y = true;
        System.out.println("Welcome to Palindrome Tester");
        while (keepPalendroming)
        {
          System.out.print("Enter a phrase:");
          playerPalendrome = sc.nextLine();
          boolean result = PalindromeTester.isPalindrome(playerPalendrome);
          if (result)
            System.out.println(playerPalendrome + " is a palindrome");
          else
            System.out.println(playerPalendrome + " is not a palindrome");
          
          y = true;
          while (y)
            {
              System.out.print("Keep Testing? (Y)es or (N)o");
              playerWantToPlay = sc.nextLine();
              if (playerWantToPlay.toUpperCase().equals("N"))
              {
                keepPalendroming = false;
                y = false;
              }
              else if (playerWantToPlay.toUpperCase().equals("Y"))
              {
                y = false;
              }
              else
                System.out.println("Invalid Input, please try again");
            }
        }
        
        

        
        
        /* YOUR CODE HERE */
    }

    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) {
        /* YOUR CODE HERE */
        String revisedPlayerPalendrome = phrase.replaceAll("\\p{Punct}", "");
        revisedPlayerPalendrome = revisedPlayerPalendrome.replaceAll("\\d", "");
        revisedPlayerPalendrome = revisedPlayerPalendrome.replaceAll(" ", "");
        revisedPlayerPalendrome =
        revisedPlayerPalendrome.toLowerCase();
        int i = 0;
        int j = revisedPlayerPalendrome.length() - 1;
        boolean palendrome = true;
        while (i < j)
        {
          if (revisedPlayerPalendrome.charAt(i) != revisedPlayerPalendrome.charAt(j))
          {
            palendrome = false;
            j = 0;
          }
          i++;
          j--;
        }
        return palendrome;
    }

    /* Any helper methods you might need */
}