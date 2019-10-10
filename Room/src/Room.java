public class Room {
    private boolean airConditioning;
    private double roomArea;
    private double temperature;

    private double minTemperature;

    public Room(boolean airConditioning, double roomArea, double temperature, double minTemperature) {
        this.airConditioning = airConditioning;
        this.roomArea = roomArea;
        this.temperature = temperature;
        this.minTemperature = minTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean decreaseTemperature() {
        if (airConditioning == true && temperature > minTemperature) {
            temperature--;
            return true;
        }
        return false;
    }

}
