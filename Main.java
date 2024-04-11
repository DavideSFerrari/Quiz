// Define admin. ---> Developer: I am the admin.
// Define the player/-s. ---> Create four objects from the class Player.
// Define the conditions were the players can start the game or not. ---> Create istance variable for each Player obj.
// Define the quiz structure. ---> Define an array.
// Define the turn conditions. ---> Once the player answers, it's the next players turn.
// Define the rotation conditions. ---> Once the rotation is concluded, it's time for a new rotation.
// Define the points cumulation for each rotation. 
// Define the final points. ---> Once the rotations are concluded, the final points are calculated.
// Define the conditions for winning the whole game.

import Player.Player;
import Quiz.Quiz;

public class Main
{    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        Player[] players = new Player[4];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;

        players[0].setName("David");
        players[0].setDecision("no");
        players[0].presentation();
        players[1].setName("Marcus");
        players[1].setDecision("yes");
        players[1].presentation();
        players[2].setName("Jimmy");
        players[2].setDecision("no");
        players[2].presentation();
        players[3].setName("Amanda");
        players[3].setDecision("no");
        players[3].presentation();

        for(int i = 0; i<players.length; i++)
        {
            if(players[i].getDecision() == "yes")
            {
                System.out.println("The quiz can start!");
            }
            else
            System.out.println("The quiz cannot start.");
        }



    }
}