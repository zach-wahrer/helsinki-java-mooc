/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author zachtheclimber
 */
import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {
    private boolean operative;
    
    public TemperatureSensor() {
        this.operative = false;
    }
    
    @Override
    public boolean isOn() {
        return this.operative;
    }

    @Override
    public void setOn() {
        this.operative = true;
    }

    @Override
    public void setOff() {
        this.operative = false;
    }

    @Override
    public int read() {
        if (this.operative == false) {
            throw new IllegalStateException("The sensor is off.");
        }
        return ThreadLocalRandom.current().nextInt(-30, 31);
    }

}
