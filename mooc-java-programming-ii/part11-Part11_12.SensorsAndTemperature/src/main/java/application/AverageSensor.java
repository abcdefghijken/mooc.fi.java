/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xxx
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList();
        readings = new ArrayList();
    }
        
    public boolean isOn() {
        boolean isOn = true;
        
        for (Sensor sensor: sensors) {
            if (!(sensor.isOn())) {
                isOn = false;
            }
        }
        
        return isOn;
    }
    
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }
    
    public int read() {
        if (!(isOn()) || sensors.isEmpty()) throw new IllegalStateException("No sensors");
        
        double average = sensors.stream().mapToInt(r -> r.read()).average().getAsDouble();
        readings.add((int) average);
        
        return (int) average;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
