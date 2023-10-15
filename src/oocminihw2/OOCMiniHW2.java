/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Create a Car object named "myCar" with specific characteristics
Car myCar = new Car(90, "Porsche", "Coupe", 4);

// Accelerate and then brake the car
myCar.accelerate();
myCar.brake();

// Print out the car's speed, manufacturer, and type
System.out.println("Speed: " + myCar.getSpeed());
System.out.println("Manufacturer: " + myCar.getMake());
System.out.println("Type: " + myCar.getType());
System.out.println("\n");

// Create an Airplane object named "myAirplane" with specific characteristics
Airplane myAirplane = new Airplane("Boeing", "Commercial", 150, 2, 80);

// Print out the airplane's altitude, manufacturer, and type
System.out.println("Altitude of the airplane: " + myAirplane.getAltitude());
System.out.println("Manufacturer: " + myAirplane.getMake());
System.out.println("Type: " + myAirplane.getType());

// Change the altitude, accelerate, and get the number of passengers
myAirplane.changeAltitude();
myAirplane.accelerate();
myAirplane.getNumberOfPassengers();
System.out.println("\n");

// Create a Boat object named "myBoat" with specific characteristics
Boat myBoat = new Boat(10, "Fish Inc.", "Sailboat", 8);

// Hoist the sail of the boat
myBoat.hoistSail();

// Print out the boat's speed, manufacturer, and whether the sail is hoisted
System.out.println("Speed: " + myBoat.getSpeed());
System.out.println("Manufacturer: " + myBoat.getMake());
System.out.println("Sail Hoisted: " + myBoat.isSailHoisted());

// Lower the sail of the boat
myBoat.lowerSail();
}}
    
    

