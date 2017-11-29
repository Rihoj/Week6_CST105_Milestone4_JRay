/**
 * Program: NFLDraft
 * File: DefencePosition.java
 * Summary: Controls the position "defense" and it's statistics.
 * Author: James Ray
 * Date: Nov 18, 2017
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class DefensivePlayer extends NFLPlayer {

    //Number of tackles the player has made.
    private int tackles;
    //Number of rushing yards for player.
    private int rushingYards;
    //Number of Interceptions the player has made.
    private int interceptions;
    //Number of kick returns the player has made.
    private int kickReturns;
    //Number of sacks the player has made.
    private int sacks;
    //A map of all stats for the player.
    private final Map<String, Integer> stats = new LinkedHashMap<>();

    //Randomly generate stats for this position.
    public DefensivePlayer() {
        super();
        tackles = ThreadLocalRandom.current().nextInt(0, 300);
        rushingYards = ThreadLocalRandom.current().nextInt(0, 500);
        interceptions = ThreadLocalRandom.current().nextInt(0, 200);
        kickReturns = ThreadLocalRandom.current().nextInt(0, 50);
        sacks = ThreadLocalRandom.current().nextInt(0, 75);
    }

    public DefensivePlayer(int tackles, int rushingYards, int interceptions, int kickReturns, int sacks, String firstName, String lastName, int age, String team) {
        super(firstName, lastName, age, team);
        this.tackles = tackles;
        this.rushingYards = rushingYards;
        this.interceptions = interceptions;
        this.kickReturns = kickReturns;
        this.sacks = sacks;
    }

    //Returns string version of DefensivePlayer.
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
        stats.put("Tackles", tackles);
        stats.put("Rushing Yards", rushingYards);
        stats.put("Interceptions", interceptions);
        stats.put("Kick Returns", kickReturns);
        stats.put("Sacks", sacks);
        return stats;
    }

    //return the position type
    public String getPositionType() {
        return "Defense";
    }

    //gets the tackles
    public int getTackles() {
        return tackles;
    }

    //gets the rushing yards
    public int getRushingYards() {
        return rushingYards;
    }

    //gets the interceptions
    public int getInterceptions() {
        return interceptions;
    }

    //get the kick returns
    public int getKickReturns() {
        return kickReturns;
    }

    //gets the sacks
    public int getSacks() {
        return sacks;
    }

    //sets the tackles
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    //sets the rushing yards
    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    //set the interceptions
    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    //set the kick returns
    public void setKickReturns(int kickReturns) {
        this.kickReturns = kickReturns;
    }

    //sets the sacks.
    public void setSacks(int sacks) {
        this.sacks = sacks;
    }
}
