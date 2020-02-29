package assignments.term2.assn3;

import java.util.ArrayList;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (UltimateTeam class)
 * <p>
 * This class represents a whole Ultimate Frisbee team, containing
 * a list of coaches, and a list of players. It has methods which
 * format Strings to list the whole team, or specific players from
 * the team.
 */
public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    /**
     * Constructor for UltimateTeam, initializes list of players, and
     * the list of coaches
     *
     * @param players ArrayList of players in the team
     * @param coaches ArrayList of coaches in the team
     */
    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    /**
     * Returns a formatted String listing all players with the
     * "cutter" position
     *
     * @return formatted String
     */
    public String getCutters() {
        String result = "";
        for (UltimatePlayer p : players) {
            if (p.getPosition().equals("cutter")) {
                result += p.toString() + "\n";
            }
        }
        return result;
    }

    /**
     * Returns a formatted String listing all players with the
     * "handler" position
     *
     * @return formatted String
     */
    public String getHandlers() {
        String result = "";
        for (UltimatePlayer p : players) {
            if (p.getPosition().equals("handler")) {
                result += p.toString() + "\n";
            }
        }
        return result;
    }

    /**
     * Returns a multiline formatted string listing all coaches and
     * players in the team
     *
     * @return team formatted String
     */
    public String toString() {
        String result = "";

        // list coaches
        result += "COACHES\n";
        for (Coach c : coaches) {
            result += c.toString() + "\n";
        }

        // list players
        result += "\nPLAYERS\n";
        for (UltimatePlayer p : players) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
