package org.example.entities;

import org.example.exceptiones.ReservaInvalidaException;

public class Vuelo {
    private int asientosDisponibles;

    public Vuelo(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservarAsientos(int asientosDeseados) throws ReservaInvalidaException {
        if (asientosDeseados <= 0) {
            throw new ReservaInvalidaException("Debe reservar al menos un asiento.");
        }

        if (asientosDeseados > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        }

        // Procede con la reserva
        asientosDisponibles -= asientosDeseados;
        System.out.println("Reserva exitosa para " + asientosDeseados + " asientos. Asientos disponibles: " + asientosDisponibles);
    }
}
