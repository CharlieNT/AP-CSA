package assignments.term2.assn3;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (UltimatePlayer class)
 * <p>
 * This class represents an UltimateFrisbee player. It extends from
 * the Person class to store his or her first and last name. This
 * class additionally stores a position (handler or cutter) and a
 * jersey number
 */
public class UltimatePlayer extends Person {

    private static int jerseyCounter = 1;

    private int jerseyNumber;
    private String position;

    /**
     * Constructor for player. Initializes first and last name,
     * position, and jersey number.
     *
     * @param firstName Player's first name
     * @param lastName  Player's last name
     * @param position  Player's position, must be either "handler"
     *                  or "cutter", set to "handler" otherwise
     */
    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if (position.equals("cutter")) {
            this.position = position;
        } else {
            this.position = "handler";
        }
        jerseyNumber = jerseyCounter;
        jerseyCounter++;
    }

    /**
     * Getter for position
     *
     * @return position of player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Creates String form of ultimate player including his or her
     * first and last name, jersey number, and position
     *
     * @return String with the format:
     * "[lastName], [firstName]
     * Jersey #: [jerseyNumber]
     * Position: [position]"
     */
    public String toString() {
        return super.toString() + "\n   " + "Jersey #: " + jerseyNumber + "\n   " + "Position: " + position;
    }
}
