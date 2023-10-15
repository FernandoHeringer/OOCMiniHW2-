/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Fernand0 2022380
 */
public class Car extends Vehicle implements Drivable {
      // Constructor method to initialize the Car object
      public Car(float speed, String make, String type, int numPassengers) {
          // Setting the provided parameters
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWheels = 4; // 
    }
     // Implementing the methods from the Drivable interface
    @Override
    public void accelerate() {
         System.out.println("the car is braking");
    }

    @Override
    public void brake() {
        System.out.println("car is accelerating");
        
    }
   
    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    
}
