package JavaBasico.Vivienda;

public class Vivienda {
    int numeroHabitaciones;
    int numeroServicios;
    double dimension;
    String provincia;
    Boolean tienePatio;
    Boolean alarmaActivada;
    int temperatura;

    public Vivienda(){

    }
    public Vivienda(int numeroHabitaciones, int numeroServicios, double dimension, String provincia, Boolean tienePatio, Boolean alarmaActivada, int temperatura) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroServicios = numeroServicios;
        this.dimension = dimension;
        this.provincia = provincia;
        this.tienePatio = tienePatio;
        this.alarmaActivada = alarmaActivada;
        this.temperatura = temperatura;
    }

    public void estadoDeLaAlarma(boolean activada){
            alarmaActivada = activada;
    }

    public void incrementoTemperatura(int incrementoTemperatura){
        if(incrementoTemperatura + this.temperatura > 25){
            System.out.println("No se puede incrementar tanto la temperatura");
        }
        else {
            this.temperatura += incrementoTemperatura;
            System.out.println("La temperatura se ha establecido en " + this.temperatura);
        }
    }
    public void decrementoTemperatura(int decrementoTemperatura){
        if(this.temperatura - decrementoTemperatura < 19){
            System.out.println("No se puede decrementar tanto la temperatura");
        }
        else{
            this.temperatura -= decrementoTemperatura;
            System.out.println("La temperatura se ha establecido en " + this.temperatura);
        }
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numeroHabitaciones=" + numeroHabitaciones +
                ", numeroServicios=" + numeroServicios +
                ", dimension=" + dimension +
                ", provincia='" + provincia + '\'' +
                ", tienePatio=" + tienePatio +
                ", alarmaActivada=" + alarmaActivada +
                ", temperatura=" + temperatura +
                '}';
    }
}
