
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        Team team = teamRecordFromCSV(fileName, teamName);
        System.out.println("Games: " + team.getTotalGamesPlayed());
        System.out.println("Wins: " + team.getWins());
        System.out.println("Losses: " + team.getLosses());
        
        
        
    }
    
    public static Team teamRecordFromCSV(String fileName, String teamName) {
        Team team = new Team(teamName);
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains(teamName)) {
                    if (teamWon(line, teamName)) {
                        team.addWin();
                    } else {
                        team.addLoss();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return team;
    }
    
    public static boolean teamWon(String line, String teamName) {
        String[] record = line.split(",");
        String homeTeam = record[0];
        String awayTeam = record[1];
        int homeScore = Integer.valueOf(record[2]);
        int awayScore = Integer.valueOf(record[3]);
        
        if (homeScore > awayScore && homeTeam.equals(teamName) || 
                awayScore > homeScore && awayTeam.equals(teamName))   {
            return true;
        }
        
        return false;
        
    }

}
