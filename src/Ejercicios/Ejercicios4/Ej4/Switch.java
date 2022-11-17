package Ejercicios.Ejercicios4.Ej4;

public class Switch {
        public static void main(String[] args) {
            var estacion = "invierno";
            switch (estacion){
                case "verano":
                    System.out.println ("Es verano");
                    break;
                case "primavera":
                    System.out.println ("Es primavera");
                    break;
                case "otoño":
                    System.out.println ("Es otoño");
                    break;
                case "invierno":
                    System.out.println ("Es invierno");
                    break;
                default:
                    System.out.println ("No es una estación");
            }
        }
}
