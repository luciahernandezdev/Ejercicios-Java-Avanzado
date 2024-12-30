package org.example;

import org.example.entities.Agente;
import org.example.entities.Llamada;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crea la lista de llamadas
        List<Llamada> llamadasList = new ArrayList<>();

        //Crea agentes y pasarlos la lista de llamadas
        Agente agente1 = new Agente(1, llamadasList);
        Agente agente2 = new Agente(2, llamadasList);

        //Inicia los agentes
        agente1.start();
        agente2.start();

        //Simula llamadas y agregarlas a la lista de llamadas
        for (int i = 1; i <= 10; i++) {
            Llamada llamada = new Llamada("Cliente" + i, "Consulta" + i);
            llamadasList.add(llamada);
        }

        //Espera a que todos los agentes terminen
        try {
            agente1.join();
            agente2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
