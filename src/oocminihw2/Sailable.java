/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Sailable extends Drivable {
    /* Sets the sail to hoisted*/
    public void hoistSail();
    public void lowerSail();
    public boolean isSailHoisted();
    
}
