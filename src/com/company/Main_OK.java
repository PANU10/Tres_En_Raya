package com.company;

import java.util.Scanner;

public class Main_OK {

    public static void main(String[] args) {


        System.out.println("Tres En Raya");
        System.out.println();
        Scanner tec = new Scanner(System.in);
        char ficha = 'X';

        char[][] matriz = new char[3][3];

        // inicializa el tablero a guiones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 matriz[i][j] = '-';
            }
        }

        // muestra tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        for (int p = 0; p < 9; p++) {

            boolean esValida = false;
            int fila = 0;
            int columna = 0;

            while(esValida == false) {
                System.out.println("Jugador " + ficha);
                System.out.println("Fila : ");
                fila = tec.nextInt() - 1;

                System.out.println("Columna : ");
                columna = tec.nextInt() - 1;

                esValida = true;

                // comprobar valida
                // 1. dentro de los limites
                if (fila < 0 || fila > 2) {
                    esValida = false;
                } // elsessss columna

                // 2. estar vacia
                else if (matriz[fila][columna] != '-') {
                    esValida = false;
                }

                if(esValida == false){
                    System.out.println("\033[91mMovimiento no valido\033[0m");
                }

            }
            // cambia una casilla del tablero
            matriz[fila][columna] = ficha;

            // muestra tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }

            if(matriz[0][0]==matriz[0][1] && matriz[0][1]==matriz[0][2]){
                if(matriz[0][0]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][0]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[1][0]==matriz[1][1] && matriz[1][1]==matriz[1][2]){
                if(matriz[1][0]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[1][0]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[2][0]==matriz[2][1] && matriz[2][1]==matriz[2][2]){
                if(matriz[2][0]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[2][0]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[0][0]==matriz[1][0] && matriz[1][0]==matriz[2][0]){
                if(matriz[0][0]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][0]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[0][1]==matriz[1][1] && matriz[1][1]==matriz[2][1]){
                if(matriz[0][1]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][1]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[0][2]==matriz[1][2] && matriz[1][2]==matriz[2][2]){
                if(matriz[0][2]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][2]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[0][0]==matriz[1][1] && matriz[1][1]==matriz[2][2]){
                if(matriz[0][0]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][0]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            } else if(matriz[0][2]==matriz[1][1] && matriz[1][1]==matriz[2][0]){
                if(matriz[0][2]=='O'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                } else if(matriz[0][2]=='X'){
                    System.out.println("Ha ganado el jugador " + ficha);
                    return;
                }
            }

            if(ficha == 'X'){
                ficha = 'O';
            } else {
                ficha = 'X';
            }
        }

    }
}
