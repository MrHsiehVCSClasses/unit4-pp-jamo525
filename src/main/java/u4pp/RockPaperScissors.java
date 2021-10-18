package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {
    static int wins = 0;
    static int losses = 0;
    static int ties = 0;
    

     
     

    
     
    public static void play(Scanner sc) {
        boolean keepPlaying = true;
        String playerInput;
        String computerOutput;
        String playerWantToPlay;
        int playerRandom;
        int computerRandom;
        int y = 0;
        int x;
        System.out.println("Welcome to Rock Paper Scissors");
        while (keepPlaying)
        {
          System.out.println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny");
          playerInput = sc.nextLine();
          computerRandom = (int) (Math.random()*3);
          computerOutput = new String [] {"R", "P", "S"}[computerRandom];
          if (playerInput.toUpperCase().equals("A"))
          {
            playerRandom = (int) (Math.random()*3);
            playerInput = new String [] {"R", "P", "S"}[playerRandom];
          }
          x = RockPaperScissors.results(playerInput, computerOutput);
          if (playerInput.toUpperCase().equals("R"))
            playerInput = "Rock";
          else if (playerInput.toUpperCase().equals("P"))
            playerInput = "Paper";
          else
            playerInput = "Scissors";

          if (computerOutput.toUpperCase().equals("R"))
            computerOutput = "Rock";
          else if (computerOutput.toUpperCase().equals("P"))
            computerOutput = "Paper";
          else
            computerOutput = "Scissors";
          
          if (x == 0)
             System.out.println("You both picked " + computerOutput + ". Its a tie!");
          else if (x == 1)
             System.out.println("You picked " + playerInput + ", and the Computer picked " + computerOutput + ". You win!");
          else
             System.out.println("You picked " + playerInput + ", and the Computer picked " + computerOutput + ". You lose!");
          System.out.println("You have " + wins + " wins and " + " losses and " + ties + " ties");
          while (y<1)
          {
            System.out.println("Would you like to play again? (Y)es or (N)o");
            playerWantToPlay = sc.nextLine();
            if (playerWantToPlay.toUpperCase().equals("N"))
            {
              keepPlaying = false;
              y=1;
            }
            else if (playerWantToPlay.toUpperCase().equals("Y"))
            {
              keepPlaying = true;
              y=1;
            }
            else
              System.out.print("Invalid Input, please try again"); 
          }
         
        }
        System.out.println("Thanks for playing!");
        
    }

    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
        int i;
        if (computerChoice.equals(playerChoice))
        {
          i = 0;
          ties+=1;
        }
        else if ((playerChoice.equals("R") && computerChoice.equals("S")) || (playerChoice.equals("P") && computerChoice.equals("R")) || (playerChoice.equals("S") && computerChoice.equals("P")))
        {
          i = 1;
          wins+=1;
        }
        else
        {
          i = -1;
          losses+=1;
        }
        return i;
    }

    /* any helper methods you might need */
}