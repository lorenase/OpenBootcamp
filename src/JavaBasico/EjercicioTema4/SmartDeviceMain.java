package JavaBasico.EjercicioTema4;

public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice(234, 43, "lorena");
        System.out.println(smartDevice);

        SmartPhone smartPhone = new SmartPhone(47, 5, "cristian", 5);
        System.out.println(smartPhone);

        SmartWatch smartWatch = new SmartWatch(456, 86, "juana", 45.9, 8590);
        System.out.println(smartWatch);

    }
}
