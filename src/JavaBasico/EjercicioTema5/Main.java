package JavaBasico.EjercicioTema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD coche1 = new CocheCRUDImpl();

        coche1.save();
        coche1.delete();
        coche1.findAll();
    }
}
