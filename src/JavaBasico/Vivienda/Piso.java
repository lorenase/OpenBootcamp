package JavaBasico.Vivienda;

public class Piso extends Vivienda{

    int numeroPlanta;

    public Piso(
            int numeroHabitaciones,
            int numeroServicios,
            double dimension,
            String provincia,
            Boolean tienePatio,
            Boolean alarmaActivada,
            int numeroPlanta,
            int temperatura
    ){
        super(numeroHabitaciones, numeroServicios, dimension, provincia, tienePatio, alarmaActivada, temperatura);
        this.numeroPlanta = numeroPlanta;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "numeroPlanta=" + numeroPlanta +
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
