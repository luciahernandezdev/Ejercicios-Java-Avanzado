package org.example;

import org.example.entities.Auto;
import org.example.generics.InventarioAutos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crea un objeto invetarioAutos para almacenar y manejar una lista de autos
        InventarioAutos<Auto> inventario = new InventarioAutos<>();

        //Crear instancias
        Auto auto1 = new Auto("BMW", "Serie 3", 2024, 50.000);
        Auto auto2 = new Auto("Audi", "A5", 2023, 35.000);
        Auto auto3 = new Auto("Opel", "Astra", 2006, 3.200);

        inventario.agregarAuto(auto1); //Agrega los autos al inventario
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);

        //Buscar los autos por marca con el metodo buscarPorMarca
        List<Auto> autosMarca = inventario.buscarPorMarca("BMW");
        System.out.println("Autos de marca BMW: ");
        for (Auto auto : autosMarca){
            System.out.println(auto);
        }

        //Buscar los autos por año con el metodo buscarAnio
        List<Auto> autosAnio = inventario.buscarPorAnio(2024);
        System.out.println("Autos del año 2024: ");
        for (Auto auto : autosAnio){
            System.out.println(auto);
        }

        //Calcula el valor total del inventario sumando el precio de todos los autos
        double valorTotalInventario = inventario.calcularValorTotal();
        System.out.println("Valor total: " + valorTotalInventario + "€");

    }

}