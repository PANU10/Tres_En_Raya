package com.company;

public class Partida {

    char turno = 'X';

    void mostrarBienvenida() {
        System.out.println("Tres En Raya");
        System.out.println();
    }

    void cambiarTurno() {
        if (turno == 'X') {
            turno = 'O';
        } else {
            turno = 'X';
        }
    }

    void mostrarTurno(){
        System.out.println("Jugador " + turno);
    }

//    void comprobar_el_ganador(){
//        if(matriz[0][0]==matriz[0][1] && matriz[0][1]==matriz[0][2]){
//            if(matriz[0][0]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][0]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[1][0]==matriz[1][1] && matriz[1][1]==matriz[1][2]){
//            if(matriz[1][0]=='O'){
//                System.out.println('O');
//            } else if(matriz[1][0]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[2][0]==matriz[2][1] && matriz[2][1]==matriz[2][2]){
//            if(matriz[2][0]=='O'){
//                System.out.println('O');
//            } else if(matriz[2][0]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[0][0]==matriz[1][0] && matriz[1][0]==matriz[2][0]){
//            if(matriz[0][0]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][0]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[0][1]==matriz[1][1] && matriz[1][1]==matriz[2][1]){
//            if(matriz[0][1]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][1]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[0][2]==matriz[1][2] && matriz[1][2]==matriz[2][2]){
//            if(matriz[0][2]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][2]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[0][0]==matriz[1][1] && matriz[1][1]==matriz[2][2]){
//            if(matriz[0][0]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][0]=='X'){
//                System.out.println('X');
//            }
//        } else if(matriz[0][2]==matriz[1][1] && matriz[1][1]==matriz[2][0]){
//            if(matriz[0][2]=='O'){
//                System.out.println('O');
//            } else if(matriz[0][2]=='X'){
//                System.out.println('X');
//            }
//        }
//    }
}
