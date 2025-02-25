/**
 * Name: Abdullah Hakimi
 * Date: January 24th, 2024
 * Description: This file defines the Player class, which represents a player in a sports team.
 *              It includes attributes for the player's name and position, and provides methods to
 *              initialize players, compare players, and generate a string representation of a player.
 *              This class is essential for managing player information within a team.
 */
public class Player {
    private String name;  // Name of the player
    private int position; // Position (number) of the player

    /**
     * Default constructor initializes the player with a default name and position 0.
     */
    public Player() {
        this.name = "Default Player";
        this.position = 0;
    }

    /**
     * Parameterized constructor to initialize a player with a name and position.
     *
     * @param name     The name of the player.
     * @param position The position (number) of the player.
     */
    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the position of the player.
     *
     * @return The position of the player.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the position of the player.
     *
     * @param position The new position of the player.
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Checks if two players are equal based on their name and position.
     *
     * @param obj The object to compare with.
     * @return True if the players are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the reference is the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check if the object is null or of a different class
        Player player = (Player) obj; // Cast the object to Player
        return position == player.position && name.equals(player.name); // Compare position and name
    }

    /**
     * Returns a hash code value for the player.
     *
     * @return A hash code value.
     */
    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(position); // Combine hash codes of name and position
    }

    /**
     * Returns a string representation of the player.
     *
     * @return A string in the format "Player{name='Name', position=X}".
     */
    @Override
    public String toString() {
        return "Player{name='" + name + "', position=" + position + "}"; // Format the string representation
    }
}