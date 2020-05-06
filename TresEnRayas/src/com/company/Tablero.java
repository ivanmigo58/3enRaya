package com.company;

public class Tablero {
    String tablero[][];
    int columas = 3;
    int filas = 3;

    void rellenarTablero(Tablero tablero) {
        for (int i = 0; i < tablero.filas; i++) {
            for (int j = 0; j < tablero.columas; j++) {
                tablero.tablero[i][j] = " _ ";
            }
        }
    }
}
