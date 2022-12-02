package Ejercicios.Ejercicios9;

public class Ejercicio9 {
    public static void main(String[] args){

        Cliente cliente = new Cliente();

        cliente.edad = 30;
        System.out.println ("Cliente - Edad: " + cliente.edad);

        cliente.nombre = "Lorena";
        System.out.println ("Cliente - Nombre: " + cliente.nombre);

        cliente.telefono = "600 000 000";
        System.out.println ("Cliente - Telefono: " + cliente.telefono);

        cliente.credito = 1000;
        System.out.println ("Cliente - Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 40;
        System.out.println ("Trabajador - Edad: " + trabajador.edad);

        trabajador.nombre = "Raúl";
        System.out.println ("Trabajador - Nombre: " + trabajador.nombre);

        trabajador.telefono = "600 100 100";
        System.out.println ("Trabajador - Telefono: " + trabajador.telefono);

        trabajador.salario = 1000;
        System.out.println ("Trabajador - Salario: " + trabajador.salario);



    }
}
