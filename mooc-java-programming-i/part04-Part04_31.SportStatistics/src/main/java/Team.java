/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Team {
    private String name;
    private int wins;
    private int losses;
    
    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }
    
    public void addWin() {
        this.wins++;
    }
    
    public void addLoss() {
        this.losses++;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public int getTotalGamesPlayed() {
        return this.wins + this.losses;
    }
}
