package IntroduccionProgramacion.Ejercicios.Ejercicios3.Ej3_2;

public class Ejercicio3_2 {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();

        System.out.println("Puertas: "+ miCoche.devolverPuertas());
    }
}

