import java.util.ArrayList;
import java.util.Iterator;

/**
 * Name: Abdullah Hakimi
 * Date: February 24th 2025
 * Description: This file defines the Team class, which represents a sports team with a roster of players.
 *              It includes attributes for the team's name, roster, and maximum number of players, and provides
 *              methods to add players, check if a player is in the roster, and iterate over the roster.
 *              This class is essential for managing a team's player roster and ensuring compliance with team size limits.
 */
public class Team {
    private String name; // Name of the team
    private ArrayList<Player> roster; // Roster of players
    private int maxPlayers; // Maximum number of players allowed in the team

    /**
     * Default constructor initializes the team with a default name and maximum number of players.
     */
    public Team() {
        this.name = "Default Team";
        this.roster = new ArrayList<>();
        this.maxPlayers = 17;
    }

    /**
     * Parameterized constructor to initialize a team with a specific name and maximum number of players.
     *
     * @param name       The name of the team.
     * @param maxPlayers The maximum number of players allowed in the team.
     */
    public Team(String name, int maxPlayers) {
        this.name = name;
        this.roster = new ArrayList<>();
        this.maxPlayers = maxPlayers;
    }

    /**
     * Checks if a player is already in the roster using an iterator.
     *
     * @param player The player to check.
     * @return True if the player is in the roster, false otherwise.
     */
    public boolean contains(Player player) {
        Iterator<Player> iterator = roster.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(player)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Inserts a player into the roster.
     *
     * @param player The player to add.
     * @throws Exception If the player is already in the roster or the roster is full.
     */
    public void insert(Player player) throws Exception {
        if (contains(player)) {
            makeError("Player already exists in the roster.");
        }
        if (roster.size() >= maxPlayers) {
            makeError("Roster is full. Cannot add more players.");
        }
        roster.add(player);
    }

    /**
     * Throws an exception with a specific message.
     *
     * @param message The exception message.
     * @throws Exception The exception with the specified message.
     */
    public void makeError(String message) throws Exception {
        throw new Exception(message);
    }

    /**
     * Returns an iterator for the roster of players.
     *
     * @return An iterator for the roster.
     */
    public Iterator<Player> iterator() {
        return roster.iterator();
    }

    /**
     * Returns a string representation of the team.
     *
     * @return A string in the format "Team{name='Name', maxPlayers=X, roster=[...]}".
     */
    @Override
    public String toString() {
        return "Team{name='" + name + "', maxPlayers=" + maxPlayers + ", roster=" + roster + "}";
    }
}