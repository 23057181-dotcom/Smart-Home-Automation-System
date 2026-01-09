public abstract class Device implements Controllable {
    // Attributes
    protected String deviceId;
    protected String deviceName;
    protected String location;
    protected boolean isOn;

    // Constructor
    public Device(String deviceId, String deviceName, String location) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.location = location;
        this.isOn = false; // Default state
    }

    // Common Methods
    public void displayStatus() {
        System.out.println("Device: " + deviceName + " | Loc: " + location + " | Status: " + (isOn ? "ON" : "OFF"));
    }

    public String getDeviceName() {
        return deviceName;
    }

    // Abstract method to force children to implement their own "work" logic
    public abstract void operate(); 
}
