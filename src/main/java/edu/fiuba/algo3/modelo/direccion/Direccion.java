package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.Posicion;
import javafx.geometry.Pos;

public class Direccion {

    private static Direccion arriba;
    private static Direccion abajo;
    private static Direccion derecha;
    private static Direccion izquierda;
    private static int maxPositionX;
    private static int maxPositionY;

    static {
        arriba = new Direccion(0, -1, "Arriba");
        abajo = new Direccion(0, 1, "Abajo");
        derecha = new Direccion(1, 0, "Derecha");
        izquierda = new Direccion(-1, 0, "Izquierda");

        arriba.setInversa(abajo);
        abajo.setInversa(arriba);
        derecha.setInversa(izquierda);
        izquierda.setInversa(derecha);

        maxPositionX = 110;
        maxPositionY = 110;

    }

    private Direccion inversa;
    private int valueX;
    private int valueY;
    private String direccion;

    private Direccion(int valX, int valY, String direccion) {
        this.valueX = valX;
        this.valueY = valY;
        this.direccion = direccion;
    }

    private void setInversa(Direccion inversa) {
        this.inversa = inversa;
    }

    public Direccion inversa() {
        return this.inversa;
    }

    public Posicion proximaPosicion(Posicion posicion) {
        // * 10 seria el espacio que ocuparia en pantalla la linea
/*
        int nextX = posicion.getPosicionX() + this.valueX * 10;
        if (nextX >= maxPositionX) nextX = maxPositionX;
        int nextY = posicion.getPosicionY() + this.valueY * 10;
        if (nextX >= maxPositionY) nextY = maxPositionY;
        */
        int nextX = posicion.getPosicionX() + this.valueX * 42;
        int nextY = posicion.getPosicionY() + this.valueY * 42;

        return new Posicion(nextX, nextY);
    }

    public static Direccion arriba() {
        return arriba;
    }

    public static Direccion abajo() {
        return abajo;
    }

    public static Direccion derecha() {
        return derecha;
    }

    public static Direccion izquierda() {
        return izquierda;
    }

    public String direccionToString() {
        return this.direccion;
    }
}
