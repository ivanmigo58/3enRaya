package com.company;

public class Tablero {
    String tablero[][];
    int columas;
    int filas;

    public Tablero(int filas, int columnas) {
        this.columas = columnas;
        this.filas = filas;
    }

    void rellenarTablero(Tablero tablero) {
        for (int i = 0; i < tablero.filas; i++) {
            for (int j = 0; j < tablero.columas; j++) {
                tablero.tablero[i][j] = " _ ";
            }
        }
    }

    public void colocarFicha(int fichaFila, int fichaColumna, String turno) {
        // Siempre que la posicion no este ocupada, guardo la ficha
        if (tablero[fichaFila - 1][fichaColumna - 1] == " _ ") {
            tablero[fichaFila - 1][fichaColumna - 1] = turno;
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
