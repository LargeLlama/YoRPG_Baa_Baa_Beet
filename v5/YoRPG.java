//Baa Baa Beet (Selina Zou, Rubin Peci, Lynne Wang)
//APCS1 Period 1
//HW #33: Ye Olde Role Playing Game, Realized
//2017-11-16

import java.io.*;
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 10;

  //each round, a Protagonist and a Monster will be instantiated...
  protected Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }
	
	System.out.println("Here is some info on the monsters!");
	Nyoom A = new Nyoom();
	Brownie B = new Brownie();
	Gargantuan C = new Gargantuan();

	System.out.println("NYOOM\n" + A.about());
	System.out.println("\nBROWNIE\n"  + B.about());
	System.out.println("\nGARGANTUAN\n" + C.about());

	Protagonist a = new Badass_Female_Protagonist();
    Protagonist b = new Water_Spirit();
    Protagonist c = new Average_Joe();

	
	s = "~~~~Choose your class~~~~\n";

    s += "\nClasses: \n";
    s += "\t1: Badass Female Protagonist\n";
    s += "\t" + a.about() + "\n";
    s += "\t2: Water Spirit\n";
    s += "\t" + b.about() + "\n";
    s += "\t3: Average Joe\n";
    s += "\t" +c.about() + "\n";
    s += "Selection: ";
	System.out.print( s );


    chooseClass(name, in);

	
    //instantiate the player's character
}//end newGame()

public void chooseClass(String name, BufferedReader in) {

	try {
		
		int choice = Integer.parseInt( in.readLine() );

		if (choice == 1) {
		        pat = new Badass_Female_Protagonist(name); 
		}
		else if (choice == 2) {
		        pat = new Water_Spirit(name);
		}
		else if (choice == 3) {
		        pat = new Average_Joe(name);
		}
		else {
			System.out.println("Invalid Input, try again!");
			chooseClass(name, in);
		}

	}
	catch (IOException e) { }

}


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;
    int charLives = pat.getLives();
	int charMaxHP = pat.getMaxHP(); //original HP
    int specAttack = 0; //Special Attack can only be used if specAttack < 3

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

		int choice = (int)(Math.random() * 3);

		if (choice == 0)
			smaug = new Nyoom();
		else if (choice == 1) 
			smaug = new Brownie();
		else
			smaug = new Gargantuan();

		System.out.println("\nThis monster is...." + smaug.getName());
		    while( smaug.isAlive() && pat.isAlive() ) {
		
	// Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

	//Special attack cannot be used for two consecutive turns (while both protagonist and monster are alive)
        if ( i == 2 && specAttack < 1) {
	  specAttack += 1;
	  System.out.println("Special attack!");
          pat.specialize();
	}
	else if (i == 2 && specAttack > 0) {
	  System.out.println("You hath spent your specialness. Normalcy it is.");
	  specAttack = 0;
	  pat.normalize();
	}
	else {
	  specAttack = 0;
	  System.out.println("Normal.");
          pat.normalize();
	}

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");

		System.out.println("\nDoctor's report\n" + pat.getName() +": " + pat.getHP() + "HP");
		System.out.println("Monster: " + smaug.getHP() + "HP");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && pat.getHP() <= 0) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
		pat.lowerLives();
		System.out.println("\nYou have " + pat.getLives() + " lives/life");
		pat.setHP(charMaxHP);

        return pat.getLives() > 0;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		pat.addKill();
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( pat.getHP() <= 0) {
        System.out.println( "Ye olde self hath expired. You got dead." );
		
		pat.lowerLives();
		pat.setHP(charMaxHP); //reset health

		System.out.println("\nYou have " + pat.getLives() + " lives/life");

        return pat.getLives() > 0;
	    }
		System.out.println( "\nYou got " + pat.getKills() + " kill(s)");
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
		break;
    encounters++;
    System.out.println();
    }

    System.out.println( "Thy game doth be over." );
  }//end main

}//end class YoRPG


