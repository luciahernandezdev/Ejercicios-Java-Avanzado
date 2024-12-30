package org.example;

import org.example.entities.Vuelo;
import org.example.exceptiones.ReservaInvalidaException;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo(10);

        try {
            // Intenta hacer una reserva válida
            vuelo.reservarAsientos(5);

            // Intenta hacer una reserva con más asientos de los disponibles
            vuelo.reservarAsientos(7);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage());
        }
    }
}
