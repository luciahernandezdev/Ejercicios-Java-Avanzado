package org.example;

import org.example.entities.Auto;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de autos
        List<Auto> autos = Arrays.asList(
                new Auto("BMW", 1, "Serie 3", 15000),
                new Auto("Audi", 2, "A2", 23000),
                new Auto("Opel", 3, "Astra", 200000)
        );

        //-----Método recursivo-----

        // Calcular el kilometraje total recursivamente
        int kilometrajeTotal = calcularKilometrajeTotal(autos, 0);
        System.out.println("Kilometraje total (recursivo): " + kilometrajeTotal + " km");


        // Buscar un auto por marca
        Auto autoEncontradoRecursivo = buscarAutoPorMarca(autos, "Opel", 0);
        if (autoEncontradoRecursivo != null) {
            System.out.println("Auto encontrado (recursivo): " + autoEncontradoRecursivo);
        } else {
            System.out.println("No se encontró un auto de la marca Opel (recursivo).");
        }

        //-----Método iterativo-----

        // Calcular el kilometraje total
        int kilometrajeTotalIterativo = calcularKilometrajeTotal(autos);
        System.out.println("Kilometraje total (iterativo): " + kilometrajeTotalIterativo + " km");

        // Buscar un auto por marca
        Auto autoEncontradoIterativo = buscarAutoPorMarca(autos, "Audi");
        if (autoEncontradoIterativo != null) {
            System.out.println("Auto encontrado (iterativo): " + autoEncontradoIterativo);
        } else {
            System.out.println("No se encontró un auto de la marca Audi (iterativo).");
        }

    }

    // Métodos recursivos e iterativos

    // Método recursivo para calcular el kilometraje total
    public static int calcularKilometrajeTotal(List<Auto> autos, int index) {
        // Caso base: Si hemos recorrido todos los autos
        if (index == autos.size()) {
            return 0;  // Retorna 0 cuando se llega al final de la lista
        }

        // Llamada recursiva: Sumar el kilometraje del auto actual y continuar con el siguiente
        return autos.get(index).getKilometraje() + calcularKilometrajeTotal(autos, index + 1);
    }


    // Método iterativo para buscar un auto por marca
    public static Auto buscarAutoPorMarca(List<Auto> autos, String marca) {
        for (Auto auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                return auto;
            }
        }
        return null;  // Si no se encuentra ningún auto
    }

    // Método recursivo para buscar un auto por marca
    public static Auto buscarAutoPorMarca(List<Auto> autos, String marca, int index) {
        if (index == autos.size()) {
            return null;  // Caso base: se llegó al final de la lista sin encontrar el auto
        }
        if (autos.get(index).getMarca().equalsIgnoreCase(marca)) {
            return autos.get(index);  // Se encontró el auto
        }
        return buscarAutoPorMarca(autos, marca, index + 1);  // Llamada recursiva al siguiente índice
    }
}
