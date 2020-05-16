/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Timer {
    ClockHand hundredths = new ClockHand(100);
    ClockHand seconds = new ClockHand(60);
    
    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        String output = "";
        if (this.seconds.value() < 10) {
            output += "0" + this.seconds.value() + ":";
        } else {
            output += this.seconds.value() + ":";
        }
        if (this.hundredths.value() < 10) {
            output += "0" + this.hundredths.value();
        } else {
            output += this.hundredths.value();
        }
        
        return output;
    }
}


