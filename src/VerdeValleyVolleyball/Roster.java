package VerdeValleyVolleyball;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Roster {
    private ArrayList<Player> playerList;

    public Roster() {
        this.playerList = new ArrayList<>();
    }

    // this method only adds the players from the .txt file into a new ArrayList
    // why do I have to instantiate a new ArrayList? I never even use it
    /*
    It's necessary to create a new instance of ArrayList to store the players because if you don't,
    the playerList will be null, and you'll get a NullPointerException when you try to add players
    using the addPlayer method.
     */
    public Roster(String rosterFileName) throws IOException {
        this.playerList = new ArrayList<>();
        Scanner scanner = new Scanner(new File(rosterFileName));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            String playerName = words[0] + " " + words[1];
            double attackScore = Double.parseDouble(words[2]);
            double blockScore = Double.parseDouble(words[3]);

            addPlayer(playerName, attackScore, blockScore);
        }
        scanner.close();
    }
    public void addPlayer(String playerName, double attackScore, double blockScore) {
        Player newPlayer = new Player(playerName, attackScore, blockScore);
        playerList.add(newPlayer);
    }

    public int getPlayerCount() {
        return this.playerList.size();
    }

    public Player getPlayerByName(String playerName) {
        for (Player player : this.playerList) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                return player;
            }
        }
        return null; // Player not found
    }
    public void printTopBlockers() {
        playerList.sort((p1, p2) -> Double.compare(p2.getBlockScore(), p1.getBlockScore()));
        for (int i = 0; i < Math.min(2, playerList.size()); i++) {
            Player player = playerList.get(i);
            System.out.printf("%s (attack = %.2f, block = %.2f)\n", player.getName(), player.getAttackScore(), player.getBlockScore());
        }
    }
    public void printTopAttackers() {
        playerList.sort((p1, p2) -> Double.compare(p2.getAttackScore(), p1.getAttackScore()));
        for (int i = 0; i < Math.min(2, playerList.size()); i++) {
            Player player = playerList.get(i);
            System.out.printf("%s (attack = %.2f, block = %.2f)\n", player.getName(), player.getAttackScore(), player.getBlockScore());
        }
    }
    public void printAllPlayers() {
        playerList.forEach(Player::printInfo);
    }
}
