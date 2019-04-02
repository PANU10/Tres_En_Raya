package com.company;

public class Tablero {
    
    char[][] casillas = new char[3][3];

    void crear(){
        // inicializa el tablero a guiones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = '-';
            }
        } 
    }


    void mostrar() {
        // muestra tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(casillas[i][j]);
            }
            System.out.println();
        }
    }
    

    boolean validarCasilla(int fila, int columna) {
        
        if (fila < 0 || fila > 2) {
            return false;
        } 
        // comprobar columna
        else if (casillas[fila][columna] != '-') {
            return false;
        }
        
        return true;
    }
    
    
    void ponerFicha(int fila, int columna, char ficha){
        
        
    }
    
    void comprobarGanador(){
        if(casillas[0][0]==casillas[0][1] && casillas[0][1]==casillas[0][2] && casillas[0][2] != '-'){
            System.out.println("Ha ganado el jugador " + casillas[0][0] );
        } else if(casillas[1][0]==casillas[1][1] && casillas[1][1]==casillas[1][2] && casillas[1][2] != '-'){
            System.out.println("Ha ganado el jugador " + casillas[0][2] );
        } else if(casillas[2][0]==casillas[2][1] && casillas[2][1]==casillas[2][2] && casillas[2][2] != '-'){
            System.out.println("Ha ganado el jugador " + casillas[0][2] );
        } else if(casillas[0][0]==casillas[1][0] && casillas[1][0]==casillas[2][0] && casillas[2][0] != '-'){

        } else if(casillas[0][1]==casillas[1][1] && casillas[1][1]==casillas[2][1] && casillas[2][1] != '-'){

        } else if(casillas[0][2]==casillas[1][2] && casillas[1][2]==casillas[2][2] && casillas[2][2] != '-'){

        } else if(casillas[0][0]==casillas[1][1] && casillas[1][1]==casillas[2][2] && casillas[2][2] != '-'){

        } else if(casillas[0][2]==casillas[1][1] && casillas[1][1]==casillas[2][0] && casillas[2][0] != '-'){

        }
    }
}
