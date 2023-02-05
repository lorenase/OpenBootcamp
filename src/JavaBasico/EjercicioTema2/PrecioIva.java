package JavaBasico.EjercicioTema2;

public class PrecioIva {
    public static void main(String[] args) {
        double precioConIva = calcularPrecioIva(4.5);
        System.out.println(precioConIva);
    }

    public static double calcularPrecioIva (double precioArticulo) {
        return precioArticulo * 1.21;
    }
}
