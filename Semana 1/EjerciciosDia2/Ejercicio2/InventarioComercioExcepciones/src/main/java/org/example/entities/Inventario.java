package org.example.entities;

import org.example.exceptions.DatosInvalidosException;

public class Inventario {

    private static final String productoVacio = "El nombre del producto no puede estar vacío.";
    private static final String productoInvalido = "El precio del producto debe ser un número mayor que 0.";
    private static final String catidadInvalida = "La cantidad disponible del producto no puede ser menor que 0.";

    public void addProduct(String name, double price, int quantity) throws DatosInvalidosException {
        //Validamos el nombre del producto
        if (name.isEmpty()) {
            throw new DatosInvalidosException(productoVacio);
        }

        //Validamos el precio del producto
        if (price <= 0) {
            throw new DatosInvalidosException(productoInvalido);
        }

        //Validamos la cantidad disponible del producto
        if (quantity < 0) {
            throw new DatosInvalidosException(catidadInvalida);
        }

        // Agregamos el producto
        System.out.println("Producto agregado correctamente");

    }

}
