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
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException("The sensor is off or doesn't contain children.");
        }
        
        double average = this.sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        this.readings.add((int) average);
        return (int) average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

}
