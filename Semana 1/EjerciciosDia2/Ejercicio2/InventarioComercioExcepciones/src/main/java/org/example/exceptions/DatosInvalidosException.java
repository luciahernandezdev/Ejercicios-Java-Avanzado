package org.example.exceptions;

public class DatosInvalidosException extends Exception {

    private String mensaje;

    public DatosInvalidosException(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}

