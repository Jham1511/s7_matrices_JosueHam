package s7_matrices_josueham;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class S7_matrices_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            String menu = "----- Bienvenido al menu del programa -----"
                    + "\n1 -> Opcion 1"
                    + "\n2 -> Opcion 2"
                    + "\n3 -> Salir del programa"
                    + "\nIngrese la opcion que desea: ";
            String input = JOptionPane.showInputDialog(null, menu, "Menu", 1);
            opcion = Integer.parseInt(input);
        } while (opcion != 3);

        String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
        int filas = Integer.parseInt(fil);
        String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
        int columnas = Integer.parseInt(col);

        int[][] numeros = lectura(filas, columnas);
        JOptionPane.showMessageDialog(null, imprimir(numeros));
        
        switch (opcion) {

            case 1: {
             //JOptionPane.showMessageDialog(null, imprimir(numeros));
            }//Fin case 1
            break;

            case 2: {

            }//Fin case 2
            break;

            default:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
        }//Fin del switch
    }//Fin del main 

    public static int[][] lectura(int filas, int columnas) {

        int temporal[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                temporal[i][j] = 1 + aleatorio.nextInt(9);
            }
        }
        return temporal;
    }

    public static String imprimir(int[][] numeros) {
        String cadena = "";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                cadena += "[" + numeros[i][j] + "]";
            }
            cadena += "\n";
        }
        return cadena;
    }
}//Fin de la clase
