package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Partida partida = new Partida();
        Tablero tablero = new Tablero();

        tablero.crear();

        tablero.mostrar();

        partida.mostrarBienvenida();


        for (int p = 0; p < 9; p++) {

            boolean esValida = false;
            int fila = 0;
            int columna = 0;

            while(esValida == false) {

                partida.mostrarTurno();

                System.out.println("Fila : ");
                fila = tec.nextInt() - 1;

                System.out.println("Columna : ");
                columna = tec.nextInt() - 1;


                esValida = tablero.validarCasilla(fila, columna);


                if(esValida == false){
                    System.out.println("\033[91mMovimiento no valido\033[0m");
                }

            }
            // cambia una casilla del tablero
            tablero.ponerFicha(fila, columna, partida.turno);

            tablero.mostrar();

            tablero.comprobarGanador();

            partida.cambiarTurno();
        }

    }
}


/*
    Envian datos:          enviar (dato)              recibir  (int variable)

    Retornan datos:       retornan   (return tal)     recogen  (int variable = cual)



 */