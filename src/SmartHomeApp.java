import java.util.ArrayList;

public class SmartHomeApp {
    public static void main(String[] args) {
        System.out.println("=== 🏡 INIT SMART HOME SYSTEM ===");

        // Polymorphism: List of 'Device' holds 'SmartLight' and 'SmartFan'
        ArrayList<Device> myDevices = new ArrayList<>();

        // Create Objects
        myDevices.add(new SmartLight("L01", "Ceiling Light", "Living Room", true));
        myDevices.add(new SmartFan("F01", "Dyson Fan", "Bedroom", 0));
        myDevices.add(new SmartLight("L02", "Table Lamp", "Study Room", false));

        // Loop through all devices
        for (Device d : myDevices) {
            System.out.println("\n--------------------------");
            d.displayStatus(); 
            d.turnOn();        
            d.operate();       
            
            // Check specific type to use unique methods
            if (d instanceof SmartLight) {
                ((SmartLight) d).setBrightness(80);
            } else if (d instanceof SmartFan) {
                ((SmartFan) d).toggleOscillation();
            }
        }

        System.out.println("\n--------------------------");
        System.out.println("=== 🌙 NIGHT MODE ACTIVATED ===");
        for (Device d : myDevices) {
            d.turnOff();
        }
    }
}