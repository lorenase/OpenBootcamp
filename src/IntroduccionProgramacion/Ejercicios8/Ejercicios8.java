package IntroduccionProgramacion.Ejercicios8;

public class Ejercicios8 {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(30);
        int edad = persona.getEdad();
        System.out.println ("Edad: " + edad);

        persona.setNombre("Juana");
        String nombre = persona.getNombre();
        System.out.println ("Nombre: " + nombre);

        persona.setTelefono("+34 600000000");
        String telefono = persona.getTelefono();
        System.out.println ("Teléfono: "+ telefono);
    }
}
