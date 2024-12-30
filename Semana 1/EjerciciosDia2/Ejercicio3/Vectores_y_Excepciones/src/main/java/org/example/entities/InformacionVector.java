package org.example.entities;

public class InformacionVector {
    private static final int tamanioVector = 20; // Tamaño inicial del vector
    private int[] vector; //Array para almacenar los datos
    private int currentIndex; //Indice para rastrear la posición donde se añadirá el siguiente dato

    public InformacionVector() {
        this.vector = new int[tamanioVector]; //Inicializa el vector
        this.currentIndex = 0; //Comienza con el primero
    }

    // Método para añadir datos al vector
    public void addData(int data) {
        //Verifica si el vector está lleno. Si no lo está, añade el dato
        if (currentIndex < vector.length) {
            this.vector[currentIndex] = data; //Asigna el valor en el índice actual
            currentIndex++; // Incrementamos el índice para el siguiente dato
        } else {
            //Si el vector está lleno, muestra un mensaje
            System.out.println("El vector está lleno, no se puede agregar más datos.");
        }
    }

    // Método para obtener datos en un índice específico
    public int getData(int index) throws ArrayIndexOutOfBoundsException {
        //Comprueba si el índice está fuera de los límites válidos
        if (index < 0 || index >= currentIndex) {
            throw new ArrayIndexOutOfBoundsException("El índice especificado está fuera del rango del vector.");
        }

        //Si el índice es válido, devuelve el valor almacenado en ese índice
        return this.vector[index];
    }
}
