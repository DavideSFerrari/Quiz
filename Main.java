// Define admin. ---> Developer: I am the admin.
// Define the player/-s. ---> Create four objects from the class Player.
// Define the conditions were the players can start the game or not. ---> Create istance variable for each Player obj.
// Define the quiz structure. ---> Define an array.
// Define the turn conditions. ---> Once the player answers, it's the next players turn.
// Define the rotation conditions. ---> Once the rotation is concluded, it's time for a new rotation.
// Define the points cumulation for each rotation. 
// Define the final points. ---> Once the rotations are concluded, the final points are calculated.
// Define the conditions for winning the whole game.



public class Main
{    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        player1.presentation();
        player2.setName("Marcus");
        player2.presentation();
        player3.setName("Jimmy");
        player3.presentation();
        player4.presentation();
    }
}