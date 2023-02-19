package JavaBasico.EjercicioTema3;

public class Concat {
    public static void main(String[] args) {
        String concat = "";
        String[] nombres = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        for (int i = 0; i < nombres.length; i++){
            concat += nombres[i];
            if(i < nombres.length - 1){
                concat += " ";
            }
        }
        System.out.println(concat);
    }
}


