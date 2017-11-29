/**
 * Program: NFLDraft
 * File: OffensePosition.java
 * Summary: Controls the position "defense" and it's statistics.
 * Author: James Ray
 * Date: Nov 18, 2017
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class OffensivePlayer extends NFLPlayer {

    //Number of passing yards a player has.
    private int passingYards;
    //number of rushing yards a player has.
    private int rushingYards;
    //number of receiving yards a player has.
    private int receivingYards;
    //Number of touch downs a player has made.
    private int touchDowns;
    //number of sacks a player has made.
    private int sacks;
    //A map of the statistics for the player.
    private final Map<String, Integer> stats = new LinkedHashMap<>();

    //Randomly generate stats for this position.
    public OffensivePlayer() {
        super();
        passingYards = ThreadLocalRandom.current().nextInt(0, 500);
        rushingYards = ThreadLocalRandom.current().nextInt(0, 500);
        receivingYards = ThreadLocalRandom.current().nextInt(0, 500);
        touchDowns = ThreadLocalRandom.current().nextInt(0, 50);
        sacks = ThreadLocalRandom.current().nextInt(0, 75);
    }

    //Returns string version of OffensivePlayer.
    @Override
    public String toString() {
        String returnString = "Player Name: " + getFullName() + "\n"
                + "Player Age: " + getAge() + "\n"
                + "Player Position: " + getPositionType() + "\n";
        if (getTeam() != null) {
            returnString += getTeam()+"\n";
        }
        returnString += getStats().toString();
        return returnString;
    }

    //Return the statistics for this player.
    public Map<String, Integer> getStats() {
        stats.clear();
        stats.put("Passing Yards", passingYards);
        stats.put("Rushing Yards", rushingYards);
        stats.put("Receiving Yards", receivingYards);
        stats.put("Touch Downs", touchDowns);
        stats.put("Sacks", sacks);
        return stats;
    }

    //return the position type
    public String getPositionType() {
        return "Offense";
    }

    //returns the passing yards.
    public int getPassingYards() {
        return passingYards;
    }

    //sets the passing yards
    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    //returns the rushing yards
    public int getRushingYards() {
        return rushingYards;
    }

    //sets the rushing yards
    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    //returns the receiving yards
    public int getReceivingYards() {
        return receivingYards;
    }

    //sets the receiving yards
    public void setReceivingYards(int receivingYards) {
        this.receivingYards = receivingYards;
    }

    //gets the touchdowns
    public int getTouchDowns() {
        return touchDowns;
    }

    //sets the touchdowns
    public void setTouchDowns(int touchDowns) {
        this.touchDowns = touchDowns;
    }

    //get the sacks
    public int getSacks() {
        return sacks;
    }

    //set the sacks.
    public void setSacks(int sacks) {
        this.sacks = sacks;
    }
}
