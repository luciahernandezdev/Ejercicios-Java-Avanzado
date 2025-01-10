package org.example;

import org.example.entities.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de vehículos según la tabla
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford", "Fiesta",  1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));

        // Ordenar la lista por precio de menor a mayor e imprimirla
        List<Vehiculo> vehiculosOrdenadosPorPrecio = new ArrayList<>(vehiculos);
        vehiculosOrdenadosPorPrecio.sort(Comparator.comparingDouble(Vehiculo::getPrecio));
        System.out.println("Vehículos ordenados por precio:");
        vehiculosOrdenadosPorPrecio.forEach(System.out::println);

        // Ordenar la lista por marca y luego por precio
        List<Vehiculo> vehiculosOrdenadosPorMarcaYPrecio = new ArrayList<>(vehiculos);
        vehiculosOrdenadosPorMarcaYPrecio.sort(
                Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getPrecio)
        );
        System.out.println("\nVehículos ordenados por marca y luego por precio:");
        vehiculosOrdenadosPorMarcaYPrecio.forEach(System.out::println);

        // Filtrar vehículos con precio no mayor a 1000
        List<Vehiculo> vehiculosPrecioNoMayor1000 = vehiculos.stream()
                .filter(v -> v.getPrecio() <= 1000)
                .collect(Collectors.toList());
        System.out.println("\nVehículos con precio no mayor a 1000:");
        vehiculosPrecioNoMayor1000.forEach(System.out::println);

        // Filtrar vehículos con precio mayor o igual a 1000
        List<Vehiculo> vehiculosPrecioMayorIgual1000 = vehiculos.stream()
                .filter(v -> v.getPrecio() >= 1000)
                .collect(Collectors.toList());
        System.out.println("\nVehículos con precio mayor o igual a 1000:");
        vehiculosPrecioMayorIgual1000.forEach(System.out::println);

        // Calcular el promedio total de precios de los vehículos
        double promedioPrecio = vehiculos.stream()
                .mapToDouble(Vehiculo::getPrecio)
                .average()
                .orElse(0);
        System.out.println("\nTotal precios:" + promedioPrecio + "€");
    }
}
