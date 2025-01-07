package org.example;

import org.example.entities.Empleado;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Carmen", 2000, "Desarrollador"),
                new Empleado("Pepe", 3500, "Analista"),
                new Empleado("Pedro", 4000, "Gerente"),
                new Empleado("Jose", 2000, "Desarrollador"),
                new Empleado("David", 3500, "Analista")
        );

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        double valorEspecifico = 2000;
        List<Empleado> salarioMayor = empleados.stream()
                .filter(empleado -> empleado.getSalario() > valorEspecifico)
                .collect(Collectors.toList());
        System.out.println("Empleados cuyo salario sea mayor a " + valorEspecifico + ": " + salarioMayor);

        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("Salario por categoría: " + salarioPromedioPorCategoria);

        //Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoSalarioMaximo = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
        empleadoSalarioMaximo.ifPresent(empleado ->
                System.out.println("Empleado con el salario más alto: " + empleado));

    }
}