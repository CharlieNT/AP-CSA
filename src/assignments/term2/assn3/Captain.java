package assignments.term2.assn3;

/**
 * Term 2, Assignment 3: Ultimate Frisbee (Captain class)
 * <p>
 * This class represents an UltimateFrisbee team captain. It extends from
 * the UltimatePlayer class to store his or her first name, last name, and position.
 * This class additionally stores a type (true or false) and a jersey number
 */
public class Captain extends UltimatePlayer {

    private boolean type; // true for offense, false for defense

    /**
     * Constructor for Captain. Initializes first name, last name,
     * position, jersey number, and type of coach
     *
     * @param firstName first name of player
     * @param lastName  last name of player
     * @param position  position, must be either "handler" or "cutter",
     *                  set to "handler otherwise
     * @param type      boolean value, true for offense, false for defense
     */
    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type;
    }

    /**
     * Returns String form of Captain
     *
     * @return String with the format:
     * "[lastName], [firstName]
     * Jersey #: [jerseyNumber]
     * Position: [position]
     * Captain: [offense / defense]"
     */
    public String toString() {
        if (type) {
            return super.toString() + "\n   Captain: offense";
        }
        return super.toString() + "\n   Captain: defense";
    }
}
