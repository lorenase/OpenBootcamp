package JavaBasico.EjercicioTema4;

public class SmartDevice {
    int contactos;
    int aplicaciones;
    String usuario;

    public SmartDevice(){}

    public SmartDevice(int contactos, int aplicaciones, String usuario){
        this.contactos = contactos;
        this.aplicaciones = aplicaciones;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "contactos=" + contactos +
                ", aplicaciones=" + aplicaciones +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
