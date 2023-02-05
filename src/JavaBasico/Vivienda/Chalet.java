package JavaBasico.Vivienda;

public class Chalet extends Vivienda{
    boolean tienePiscina;

    public Chalet(
            int numeroHabitaciones,
            int numeroServicios,
            double dimension,
            String provincia,
            Boolean tienePatio,
            Boolean alarmaActivada,
            int temperatura,
            boolean tienePiscina
    ){
        super(numeroHabitaciones, numeroServicios, dimension, provincia, tienePatio, alarmaActivada, temperatura);
        this.tienePiscina = tienePiscina;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "tienePiscina=" + tienePiscina +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", numeroServicios=" + numeroServicios +
                ", dimension=" + dimension +
                ", provincia='" + provincia + '\'' +
                ", tienePatio=" + tienePatio +
                ", alarmaActivada=" + alarmaActivada +
                ", temperatura=" + temperatura +
                '}';
    }
}
