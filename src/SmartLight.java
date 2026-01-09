public class SmartLight extends Device {
    // Unique Attributes
    private int brightness;
    private String color;
    private boolean isDimmable;

    // Constructor
    public SmartLight(String id, String name, String loc, boolean isDimmable) {
        super(id, name, loc); // Calls the parent (Device) constructor
        this.brightness = 50; 
        this.color = "Warm White";
        this.isDimmable = isDimmable;
    }

    // Overriding methods
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("💡 " + deviceName + " in " + location + " is now GLOWING.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("🌑 " + deviceName + " faded out.");
    }

    @Override
    public void operate() {
        System.out.println("   -> Lighting up the room with " + color + " at " + brightness + "% brightness.");
    }

    // Unique Method
    public void setBrightness(int level) {
        if (isDimmable) {
            this.brightness = level;
            System.out.println("   -> Brightness set to " + level + "%.");
        } else {
            System.out.println("   -> This light is not dimmable.");
        }
    }
}