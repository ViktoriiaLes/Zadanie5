public class Test {
    public static void main(String[] args) {

        boolean airConditioning = true;
        int minTemperature = 20;
        int temperature = 36;
        int roomArea = 45;

        TestRoom(airConditioning, minTemperature, temperature, roomArea);

        airConditioning=false;
        TestRoom(airConditioning, minTemperature, temperature, roomArea);

        airConditioning=true;
        temperature =25;
        TestRoom(airConditioning, minTemperature, temperature, roomArea);
    }

    private static void TestRoom(boolean airConditioning, int minTemperature, int temperature, int roomArea) {
        Room room1 = new Room(airConditioning, roomArea, temperature, minTemperature);

        System.out.printf("Temperatura obnizyla sie: %s\n", room1.decreaseTemperature());
        System.out.printf("Ostateczna temperatura %s\n", room1.getTemperature());

    }
}
