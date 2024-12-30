package org.example.entities;


public class Llamada {
    private String cliente;
    private String consulta;

    public Llamada(String cliente, String consulta) {
        this.cliente = cliente;
        this.consulta = consulta;
    }

    public String getCliente() {
        return cliente;
    }

    public String getConsulta() {
        return consulta;
    }
}
