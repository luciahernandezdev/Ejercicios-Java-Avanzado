package org.example.generics;

import org.example.entities.Auto;

import java.util.ArrayList;
import java.util.List;

//Clase generica que maneja el inventario de vehiculos tipo T que extiende de la clase auto.
public class InventarioAutos<T extends Auto> {
    private List<T> inventario;

    //Constructor que inicia el atributo inventario como una la lista vacía
    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    //Recibe un objeto de tipo T (auto, que hereda de la clase Auto) Agrega auto al inventario
    public void agregarAuto(T auto) {
        inventario.add(auto);
        System.out.println("Auto agregado al inventario: " + auto.getMarca());
    }

    // Buscar por marca
    public List<T> buscarPorMarca(String buscarMarca) {
        List<T> autosEncontrados = new ArrayList<>();
        // Recorre el inventario y agrega los autos que coincidan con la marca buscada
        for (T auto : inventario) {
            //verifica la marca del auto actual es igual a la marca que esta buscando
            //equals => porque es un objeto tipo string
            if (auto.getMarca().equalsIgnoreCase(buscarMarca)) {
                autosEncontrados.add(auto); // Agrega el auto si su marca coincide
            }
        }
        return autosEncontrados; //devuelve la lista de autos que coincide con la buscada
    }

    // Buscar por año
    public List<T> buscarPorAnio(int buscarAnio) {
        List<T> autosEncontrados = new ArrayList<>();
        // Recorre el inventario y agrega los autos que coincidan con el año buscado
        for (T auto : inventario) {
            //verifica si el año del auto es igual al año que esta buscando
            if (auto.getAnio() == buscarAnio) {
                //si el año coincide se agrega a la lista autosEncontrados
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados; //devuelves la lista de autos que coinciden con el año
    }

    // Calcular el valor total de todos los autos en el inventario
    public double calcularValorTotal() {
        //se declara la variable valorToral en 0.0
        double valorTotal = 0.0;
        for (T auto : inventario) {
            //llamamos al metodo getPrecio de cada auto para poner su precio
            //el precio de cada auto se suma
            valorTotal += auto.getPrecio();
        }
        return valorTotal; //devuelve la suma total de los precios
    }
}
