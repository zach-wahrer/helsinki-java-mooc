/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointsList;
    
    public Points() {
        this.pointsList = new ArrayList<>();
    }
    
    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.pointsList.add(points);
        }
    }
    
    public double getAverage() {
        double sumOfGrades = 0;
        for (int points : this.pointsList) {
            sumOfGrades += points;
        }
        return sumOfGrades / this.pointsList.size();
    }
    
    public double getAverageOfPassing() {
        double sumOfPassingGrades = 0;
        int numberOfPassingGrades = 0;
        for (int points : this.pointsList) {
            if (points >= 50) {
                sumOfPassingGrades += points;
                numberOfPassingGrades += 1;
            }
        }
        
        if (numberOfPassingGrades > 0) {
            return sumOfPassingGrades / numberOfPassingGrades;
        }
        
        return 0;
    }
    
    public double getPassPercentage() {
        int passing = 0;
        
        for (int points : this.pointsList) {
            if (points >= 50) {
                passing++;
            }
        }
        return 100.0 * passing / this.pointsList.size(); 
    }
    
    public String[] getGradeDistribution() {
        String[] stars = {"", "", "", "", "", ""};
        
        for (int points : this.pointsList) {
            if (points < 50) {
                stars[0] += "*";
            } else if (points < 60) {
                stars[1] += "*";
            } else if (points < 70) {
                stars[2] += "*";
            } else if (points < 80) {
                stars[3] += "*";
            } else if (points < 90) {
                stars[4] += "*";
            } else {
                stars[5] += "*";
            }
        }
        
        return stars;
    }
    
    public void printAverage() {
        System.out.println("Point average (all): " + this.getAverage());
    }
    
    public void printAverageOfPassing() {
        double averageOfPassing = this.getAverageOfPassing();
        
        if (averageOfPassing > 0) {
            System.out.println("Point average (passing): " + averageOfPassing);
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + this.getPassPercentage());
    }
    
    public void printGradeDistribution() {
        String[] stars = this.getGradeDistribution();
        System.out.println("Grade distribution:");
        for (int i = stars.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + stars[i]);
        }
    }
}
