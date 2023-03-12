package JavaBasico.EjercicioTema4;

public class SmartPhone extends SmartDevice {
    int numeroJuegos;

    public SmartPhone (){}

    public SmartPhone(int contactos, int aplicaciones, String usuario, int numeroJuegos) {
        super(contactos, aplicaciones, usuario);
        this.numeroJuegos = numeroJuegos;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numeroJuegos=" + numeroJuegos +
                ", contactos=" + contactos +
                ", aplicaciones=" + aplicaciones +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
