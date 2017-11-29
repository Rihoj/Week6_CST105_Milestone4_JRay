/**
 * Program: NFLDraft
 * File: NFLPlayerDriver.java
 * Summary: Test class for NFL Player
 * Author: James Ray
 * Date: Nov 28, 2017
 */

public class NFLPlayerDriver {

    private static int errorCount = 0;
    private static int successCount = 0;
    private static final int NUMBER_OF_TEAMS = 1;
    private static final int NUMBER_OF_PLAYERS = 2;

    public static void main(String[] args) {
        logOut("Begining tests for NFLPlayer.");
        logOut("");
        logOut("Begining Create Player constructor test.");
        if (createPlayerTest()) {
            logOut("Create Player Test succeded");
            successCount++;
        } else {
            logError("Create Player Test Failed. Full test was cancled.");
            errorCount++;
        }
        logOut("");
        logOut("Tests are complete with the following stats.");
        logOut("Successes: " + Integer.toString(successCount));
        logError("Errors: " + Integer.toString(errorCount));

    }
    //Test NFLPlayer constructors
    private static boolean createPlayerTest() {
        boolean testStatus = false;
        try {
            NFLPlayer player = new OffensivePlayer();
            logOut("Player created.");
            logOut(player.toString());
            NFLPlayer playerWithData = new DefensivePlayer(25, 30, 35, 40, 45, "James", "Ray", 25, "team");
            logOut("Player with data created.");
            logOut(playerWithData.toString());
            testStatus = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testStatus;
    }

    //Print line to System out and wait 500 ms to make sure text is in the right order.
    protected final static void logOut(String message) {
        System.out.println(message);
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Print line to System err and wait 500 ms to make sure text is in the right order.
    protected final static void logError(String message) {
        System.err.println(message);
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
