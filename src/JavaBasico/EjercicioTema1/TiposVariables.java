package JavaBasico.EjercicioTema1;

public class TiposVariables {
    public static void main(String[] args) {
        byte number1 = 2;
        short number2 = 4;
        int number3 = 45;
        long number4 = 45643;
        float decimal1 = 9.7f;
        double decimal2 = 8.55d;
        char letter1 = 'l';
        boolean verdad = true;
        String nombre = "Lorena";
        Integer number5 = null;

        String textoParaImprimir = number1 + " " + number2 + " " + number3 + " " + number4 + " " + decimal1 + " "
                + decimal2 + " " + letter1 + " " + verdad + " " + nombre + " " + number5;

        System.out.println(textoParaImprimir);

    }
}
