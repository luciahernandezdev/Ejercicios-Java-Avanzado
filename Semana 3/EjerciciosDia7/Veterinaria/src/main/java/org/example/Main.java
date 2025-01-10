package org.example;

import org.example.entities.RegistroMascotas;
import org.example.generics.Mascota;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un registro de mascotas
        RegistroMascotas<Integer> registro = new RegistroMascotas<>();

        // Crear algunas mascotas
        Mascota<Integer> mascota1 = new Mascota<>(1, "Pepe", 3, "Gato");
        Mascota<Integer> mascota2 = new Mascota<>(2, "Rex", 3, "Perro");
        Mascota<Integer> mascota3 = new Mascota<>(3, "Bola", 5, "Ave");
        Mascota<Integer> mascota4 = new Mascota<>(4, "Bolita", 6, "Reptil");
        Mascota<Integer> mascota5 = new Mascota<>(5, "Blanquita", 10, "Reptil");

        // Agregar mascotas al registro
        registro.agregarMascota(mascota1);
        registro.agregarMascota(mascota2);
        registro.agregarMascota(mascota3);
        registro.agregarMascota(mascota4);
        registro.agregarMascota(mascota5);

        // Buscar mascotas por nombre
        List<Mascota<Integer>> mascotasEncontradasPorNombre = registro.buscarPorNombre("Pepe");
        System.out.println("Buscar mascota por nombre 'Pepe':");
        for (Mascota<Integer> mascota : mascotasEncontradasPorNombre) {
            System.out.println(mascota);
        }

        // Buscar mascotas por especie
        List<Mascota<Integer>> mascotasEncontradasPorEspecie = registro.buscarPorEspecie("Perro");
        System.out.println("Buscar mascota por especie: 'Perro':");
        for (Mascota<Integer> mascota : mascotasEncontradasPorEspecie) {
            System.out.println(mascota);
        }

        // Contar el total de mascotas registradas
        int totalMascotas = registro.contarTotalMascotas();
        System.out.println("Total de mascotas registradas: " + totalMascotas);

        //Generar mascota aleatoria
        Mascota<Integer> mascotaAleatoria = registro.generarMascotaAleatoria(6);
        System.out.println("Mascota generada aleatoriamente: " + mascotaAleatoria);
    }
}