package org.example.entities;

import org.example.generics.Mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas <T> {
    private List<Mascota <T>> registroMascotas;

    public RegistroMascotas (){
        this.registroMascotas = new ArrayList<>();
    }

    //Agregar mascotas al registro
    public void agregarMascota(Mascota<T> mascota){
        registroMascotas.add(mascota);
        System.out.println("Agregar Mascota: " + mascota);
    }

    //Buscar mascota por nombre
    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registroMascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    //Buscar mascota por especia
    public List<Mascota<T>> buscarPorEspecie(String especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registroMascotas) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    //Buscar la cantidad total de mascotas registradas
    public int contarTotalMascotas(){
        return  registroMascotas.size();
    }

    //Generar datos aleatorios para mascotas
    public Mascota<T> generarMascotaAleatoria(T id){
        Random random = new Random();
        String[] nombres = {"Pepe", "Rex", "Bola", "Bolita", "Blanquita"};
        String[] especies = {"Gato", "Ave", "Perro", "Reptil"};

        String nombreAleatorio = nombres[random.nextInt(nombres.length)]; //Genera ID
        int edadAleatoria = random.nextInt(10) + 1;
        String especieAleatoria = especies[random.nextInt(especies.length)];

        //Agregar mascota aleatoria al registro
        return new Mascota<>(id, nombreAleatorio, edadAleatoria, especieAleatoria);

    }
}
