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

    public void colocarFicha() {
        // Siempre que la posicion no este ocupada, guardo la ficha
        if (tablero[TresEnRaya.filaFicha - 1][TresEnRaya.columnaFicha - 1] == " _ ") {
            tablero[TresEnRaya.filaFicha - 1][TresEnRaya.columnaFicha - 1] = TresEnRaya.turno;

        } else {
            System.out.println("ERROR! La posicion ya esta ocupada.");
        }
    }

    public void mostrarTablero() {
        // Imprimo el tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columas; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }
}
