package org.example;

import org.example.entities.Evento;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión", LocalDate.of(2024, 6, 10), "Reunión"),
                new Evento("Conferencia", LocalDate.of(2024, 6, 11), "Conferencia"),
                new Evento("Taller", LocalDate.of(2024, 7, 15), "Taller")

        );

        //Filtra los eventos que están programados para una fecha específica.
        LocalDate fechaEspecifica = LocalDate.of(2024, 6, 10);
        List<Evento> eventosFechaEspecifica = eventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());
        System.out.println("Eventos que están programados para el " + fechaEspecifica + ": " + eventosFechaEspecifica);

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        System.out.println("Eventos por categoría: " + eventosPorCategoria);

        //Encuentra el evento más próximo en el tiempo utilizando Optionals.
        LocalDate fechaActual = LocalDate.now();
        Optional<Evento> eventoProximo = eventos.stream()
                .filter(evento -> evento.getFecha().isAfter(fechaActual))
                .min(Comparator.comparing(Evento::getFecha));
        eventoProximo.ifPresent(evento ->
                System.out.println("Próximo evento: " + evento));

    }
}