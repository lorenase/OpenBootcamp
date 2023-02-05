package JavaBasico.Vivienda;

import java.util.ArrayList;
import java.util.List;

public class ViviendaMain {
    public static void main(String[] args){

        Vivienda vivienda1 = new Vivienda(4,2,95.9, "Cuenca",
                true, false, 21);
        System.out.println(vivienda1);

        vivienda1.decrementoTemperatura(3);
        vivienda1.decrementoTemperatura(2);
        vivienda1.incrementoTemperatura(4);
        System.out.println(vivienda1);

        Piso piso1 = new Piso (3, 1, 50.3, "Toledo",
                false, false, 1, 23);
        System.out.println(piso1);

        Chalet chalet1 = new Chalet (
                8,
                4,
                357,
                "Ciudad Real",
                true,
                true,
                25,
                true
        );

        List<Vivienda> listaViviendas = new ArrayList<>();
        listaViviendas.add(vivienda1);
        listaViviendas.add(piso1);
        listaViviendas.add(chalet1);

        System.out.println(listaViviendas);

        for(Vivienda vivienda: listaViviendas){
            System.out.println(vivienda.numeroHabitaciones);
        }

        //listaViviendas.forEach(vivienda -> System.out.println(vivienda.numeroHabitaciones));
    }

}


