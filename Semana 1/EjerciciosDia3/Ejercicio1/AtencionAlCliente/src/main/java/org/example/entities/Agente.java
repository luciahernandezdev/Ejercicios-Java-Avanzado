package org.example.entities;

import java.util.List;

public class Agente extends Thread {
    private int id;
    private List<Llamada> llamadasList;

    public Agente(int id, List<Llamada> llamadasList) {
        this.id = id;
        this.llamadasList = llamadasList;
    }

    @Override
    public void run() {
        Llamada llamada = null;
        while (true) {
            //Se verifica si hay llamadas disponibles en la lista
            if (!llamadasList.isEmpty()) {
                //Tomar la primera llamada de la lista
                llamada = llamadasList.remove(0);
                atenderLlamada(llamada);
            } else {
                //Si no hay llamadas, esperar un poco antes de volver a intentar
                try {
                    Thread.sleep(1000); //Espera de un segundo antes de intentar nuevamente
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void atenderLlamada(Llamada llamada) {
        System.out.println("Agente " + id + " atendiendo llamada de " + llamada.getCliente() +
                " - Consulta: " + llamada.getConsulta());
        //Resuelve consulta
        System.out.println("Agente " + id + " resolvió la consulta de " + llamada.getCliente());
    }
}
