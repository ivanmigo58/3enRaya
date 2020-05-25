package com.company;

import java.util.Scanner;

public class TresEnRaya {
    Scanner scanner = new Scanner(System.in);

    static Tablero tablero = new Tablero(3 , 3);
    static InterfazDeUsuario interfazDeUsario = new InterfazDeUsuario();
    /*static int filaFicha;
    static int columnaFicha;*/

    public String turno;
    private boolean exit;
    private boolean ganador;

    Ficha ficha = new Ficha();

    public void iniciarJuego() {
        turno = " X ";
        exit = false;
        ganador = false;

        tablero.tablero = new String[tablero.filas][tablero.columas];
        tablero.rellenarTablero(tablero);

        while (!exit) {
            //crearTablero();
            rellenarTablero();

            comprobarGanador();

            cambioTurno();

            if (ganador) {
                volverAJugar();
            }
        }
    }



    private void rellenarTablero() {
        interfazDeUsario.mostrarTurno(turno);
        int fila = ficha.pedirFila();
        int columna = ficha.pedirColumna();
        System.out.println("");
        tablero.colocarFicha(fila, columna, turno);
        tablero.mostrarTablero();
    }



    private void comprobarGanador() {
        // Primemra linea horizontal
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[0][1]) && tablero.tablero[0][1].equals(tablero.tablero[0][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;
            }
        }

        // Segunda linea horizontal
        if (!tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ")) {
            if (tablero.tablero[1][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[1][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;
            }
        }

        // Tercera linea
        if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[2][0].equals(tablero.tablero[2][1]) && tablero.tablero[2][1].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Primera columna
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][0].equals(" _ ") && !tablero.tablero[2][0].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[1][0]) && tablero.tablero[1][0].equals(tablero.tablero[2][0])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Segunda columna
        if (!tablero.tablero[0][1].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][1].equals(" _ ")) {
            if (tablero.tablero[0][1].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][1])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Tercera columna
        if (!tablero.tablero[0][2].equals(" _ ") && !tablero.tablero[1][2].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[0][2].equals(tablero.tablero[1][2]) && tablero.tablero[1][2].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Primera diagonal
        if (!tablero.tablero[0][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[2][2].equals(" _ ")) {
            if (tablero.tablero[0][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[2][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }

        // Segunda diagonal
        if (!tablero.tablero[2][0].equals(" _ ") && !tablero.tablero[1][1].equals(" _ ") && !tablero.tablero[0][2].equals(" _ ")) {
            if (tablero.tablero[2][0].equals(tablero.tablero[1][1]) && tablero.tablero[1][1].equals(tablero.tablero[0][2])) {
                System.out.println("Ha ganado " + turno + " !!!");
                ganador = true;

            }
        }
    }



    private void cambioTurno() {
        // Cambio el turno
        if (turno.equals(" X ")) turno = " O ";
        else turno = " X ";
    }



    private void volverAJugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quieres volver a jugar? (s/n) ");
        String volveraJugar = scanner.next();
        System.out.println(" ");

        if (volveraJugar.equals("s")) {
            iniciarJuego();
        } else {
            exit = true;
        }
    }
}
