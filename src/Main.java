import java.util.Iterator;

/**
 * Name: Abdullah Hakimi
 * Date: February 24th 2025
 * Description: This file defines the Lab05Test class, which tests the Player and Team classes.
 *              It creates teams, adds players, and checks for exceptions and consistency in the team rosters.
 *              This class ensures that the Player and Team classes function correctly and handle edge cases.
 */
public class Main {
    public static void main(String[] args) {
        // Create Team A with the name "Tigers" and maximum number of players 17
        Team teamA = new Team("Tigers", 17);

        // Create Team B using the default constructor
        Team teamB = new Team();

        // Add two players built with the default constructor to Team A and catch the exception
        try {
            Player defaultPlayer1 = new Player();
            Player defaultPlayer2 = new Player();
            teamA.insert(defaultPlayer1);
            teamA.insert(defaultPlayer2);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Fill both teams with players
        for (int i = 1; i <= 17; i++) {
            try {
                teamA.insert(new Player("PlayerA" + i, i));
                teamB.insert(new Player("PlayerB" + i, i));
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        // Try inserting more players after filling them and handle the exception
        try {
            teamA.insert(new Player("ExtraPlayerA", 18));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            teamB.insert(new Player("ExtraPlayerB", 18));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test to see if contains is consistent in its results
        Player testPlayerA = new Player("PlayerA1", 1);
        Player testPlayerB = new Player("PlayerB1", 1);
        System.out.println("Team A contains PlayerA1: " + teamA.contains(testPlayerA));
        System.out.println("Team B contains PlayerB1: " + teamB.contains(testPlayerB));

        // Finally, iterate over the team rosters and legibly output all the players
        System.out.println("Team A Roster:");
        Iterator<Player> iteratorA = teamA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }

        System.out.println("Team B Roster:");
        Iterator<Player> iteratorB = teamB.iterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next());
        }
    }
}