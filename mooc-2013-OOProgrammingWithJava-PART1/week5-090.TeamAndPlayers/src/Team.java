
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player newPlayer) {
        if (this.players.size() < this.maxSize) {
            this.players.add(newPlayer);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int result = 0;
        for (Player player : players) {
            result += player.goals();
        }
        return result;
    }
}
