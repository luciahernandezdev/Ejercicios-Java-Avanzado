package org.example;

import org.example.entities.InformacionVector;

public class Main {
    public static void main(String[] args) {
        InformacionVector vector = new InformacionVector();

        //Añadir datos al vector
        vector.addData(10);
        vector.addData(20);
        vector.addData(30);

        //Obtenemos datos en índices válidos e inválidos
        try {
            System.out.println(vector.getData(0));  //Salida: 10
            System.out.println(vector.getData(1));  //Salida: 20
            System.out.println(vector.getData(2));  //Salida: 30
            System.out.println(vector.getData(3));  //Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  //muestra el mensaje de error
        }
    }
}
