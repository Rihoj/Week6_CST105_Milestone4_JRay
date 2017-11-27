
/**
 * Program: NFLDraft
 * File: Player.java
 * Summary: Controls the player and allows players to be generated.
 * Author: James Ray
 * Date: Nov 18, 2017
 */

import java.util.concurrent.ThreadLocalRandom;

public abstract class NFLPlayer {

    //First name of the player.
    private String firstName;
    //Last name of the player.
    private String lastName;
    //Age of the player.
    private int age;
    //Team class the player belongs to.
    private String team;

    //Generate a new player with random data without a team.
    public NFLPlayer() {
        firstName = "James";
        lastName = "Ray";
        age = ThreadLocalRandom.current().nextInt(18, 46);
        team = "Test Team";
    }

    //Create custom NFLPlayer
    public NFLPlayer(String firstName, String lastName, int age, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;
    }

    //Returns the string version of the player.
    public String toString() {
        String returnString = "Player Name: " + getFullName() + "\n"
                + "Player Age: " + getAge() + "\n";
        if (getTeam() != null) {
            returnString += getTeam();
        }
        return returnString;
    }

    //return the first name of the player
    public String getFirstName() {
        return firstName;
    }

    //return the last name of the player
    public String getLastName() {
        return lastName;
    }

    //return the full name of the player
    public String getFullName() {
        return firstName + " " + lastName;
    }

    //return the age of the player.
    public int getAge() {
        return age;
    }

    //Return the team the player belongs to.
    public String getTeam() {
        return team;
    }

    //set the team the player belongs to.
    public void setTeam(String team) {
        this.team = team;
    }

    //set first name for player
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set last name for player
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set age for player
    public void setAge(int age) {
        this.age = age;
    }

    //Removes player from team.
    public void leaveTeam() {
        team = null;
    }
}
