package org.example;

import org.example.entities.Inventario;
import org.example.exceptions.DatosInvalidosException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario manager = new Inventario();

        //Agrega un producto con datos válidos
        try {
            manager.addProduct("Camiseta", 15.00, 100);
        } catch (DatosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        //Agrega un producto con un nombre vacío
        try {
            manager.addProduct("", 10.0, 100);
        } catch (DatosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        //Agrega un producto con un precio negativo
        try {
            manager.addProduct("Pantalon", -25.00, 100);
        } catch (DatosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        //Agrega un producto con una cantidad disponible negativa
        try {
            manager.addProduct("Sudadera", 20.99, -100);
        } catch (DatosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        /*En cada caso (salvo el primero), se espera que se lance una excepción DatosInvalidosException
        con el mensaje correspondiente.*/
    }

}