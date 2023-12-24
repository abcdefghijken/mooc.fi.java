/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author xxx
 */
public class TemperatureSensor implements Sensor {
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }
        
    public boolean isOn() {
        return this.isOn;
    }
    
    public void setOn() {
        this.isOn = true;
    }
    
    public void setOff() {
        this.isOn = false;
    }
    
    public int read() {
        if (this.isOn == true) return new Random().nextInt(61)-30;
        throw new IllegalStateException("Sensor is off.");
    }
    
}
