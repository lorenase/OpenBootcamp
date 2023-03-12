package JavaBasico.EjercicioTema4;

public class SmartWatch extends SmartDevice {
    double kilometros;
    int pasos;

    public SmartWatch(){}

    public SmartWatch(int contactos, int aplicaciones, String usuario, double kilometros, int pasos) {
        super(contactos, aplicaciones, usuario);
        this.kilometros = kilometros;
        this.pasos = pasos;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "kilometros=" + kilometros +
                ", pasos=" + pasos +
                ", contactos=" + contactos +
                ", aplicaciones=" + aplicaciones +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
