public class SmartFan extends Device {
    // Unique Attributes
    private int speed; 
    private boolean isOscillating;
    private int bladeCount;

    // Constructor
    public SmartFan(String id, String name, String loc, int bladeCount) {
        super(id, name, loc);
        this.speed = 0;
        this.isOscillating = false;
        this.bladeCount = bladeCount;
    }

    // Overriding methods
    @Override
    public void turnOn() {
        this.isOn = true;
        this.speed = 3; 
        System.out.println("💨 " + deviceName + " started spinning.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        this.speed = 0;
        System.out.println("🛑 " + deviceName + " stopped.");
    }

    @Override
    public void operate() {
        System.out.println("   -> Cooling the room at speed level " + speed);
    }

    // Unique Method
    public void toggleOscillation() {
        this.isOscillating = !this.isOscillating;
        System.out.println("   -> Oscillation is now " + (isOscillating ? "ON" : "OFF"));
    }
}