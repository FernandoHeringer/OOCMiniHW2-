/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Fernand0 2022380
 */
public class Boat extends Vehicle implements Sailable {
    
    private boolean sailHoisted;

    // Constructor method to initialize the Boat object
    public Boat(float speed, String make, String type, int numPassengers) {
        // Setting the provided parameters
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numSails = 1; // Boats typically have 1 sail
        this.sailHoisted = false; // Initially, the sail is not hoisted
    }
    
    // Overriding the methods from a superclass
        @Override
    public void accelerate() {
        this.speed += speed; 
    }

   
    @Override
    public void brake() {
        this.speed = 0; // Sets the speed to zero when braking
    }

   
    @Override
    public float getSpeed() {
        return speed; // Returns the current speed of the boat
    }

   
    @Override
    public String getMake() {
        return make; 
    }

  
    @Override
    public String getType() {
        return type; 
    }

    // Implementing the methods from the Sailable interface
    @Override
    public void hoistSail() {
        sailHoisted = true; // Sets sailHoisted to true when the sail is hoisted
        System.out.println("Sail hoisted.");
    }

    
    @Override
    public void lowerSail() {
        sailHoisted = false; // Sets sailHoisted to false when the sail is lowered
        System.out.println("Sail lowered.");
    }

    
    @Override
    public boolean isSailHoisted() {
        return sailHoisted; // Returns whether the sail is hoisted (true) or not (false)
    }
}
