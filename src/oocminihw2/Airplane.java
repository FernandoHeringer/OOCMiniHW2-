/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Fernand0 2022380
 */
public class Airplane extends Vehicle implements Flyable{
         // Constructor method to initialize the Airplane object
        public Airplane ( String make, String type, int numPassengers, int nunOfWings, int altitude) {
         // Setting the provided parameters
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWings = 0;
        this.altitude = altitude;
        }
        
         // Implementing the methods from the Flyaable interface
    @Override
    public void changeAltitude() {
        this.altitude += 50;
        System.out.println("The plane is gaining altitude. Altitude: "+ altitude);
        
    }

    @Override
    public float getAltitude() {
        return altitude;
    }

    @Override
    public void accelerate() {
        System.out.println("Airplane is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Airplane is braking");
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
     @Override
    public int getNumberOfPassengers(){
         System.out.println("The airplane has " + numPassengers + " passengers aboard.");
            return 0;
            
    }
    
    }
    

             
    
   
  

