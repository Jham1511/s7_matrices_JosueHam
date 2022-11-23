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
                    + "\n1 -> Opcion 1 (Suma elementos de la matriz)"
                    + "\n2 -> Opcion 2(Elemento mayor de una matriz)"
                    + "\n3 -> Opcion 3"
                    + "\n4 -> Salir del programa"
                    + "\nIngrese la opcion que desea: ";
            String input = JOptionPane.showInputDialog(null, menu, "Menu", 3);
            opcion = Integer.parseInt(input);

            switch (opcion) {

                case 1: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));

                    JOptionPane.showMessageDialog(null, "La suma es " + suma(numeros));
                }//Fin case 1
                break;

                case 2: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, "El elemento mayor del arreglo es:\n" + imprimir (organizar(numeros,filas, columnas)));
                    
                  
                    
                }//Fin case 2
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            }//Fin del switch

        } while (opcion != 4);
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

    public static int suma(int[][] numeros) {
        int respuesta = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                respuesta += numeros[i][j];
            }
        }
        return respuesta;
    }//Fin metodo suma 

    public static int[][] organizar(int[][] numeros, int filas, int columnas) {

        int[][] mayores = new int[filas][columnas];

        for (int i = 1; i < mayores.length; i++) {
            for (int j = 0; j < mayores[i].length - 1; j++) {
                if (numeros[j][i] < numeros[j + 1][i + 1]) {
                    int posGuardada = numeros[j][i];
                    numeros[j][i] = numeros[j + 1][i + 1];
                    numeros[j + 1][i + 1] = posGuardada;
                }//Fin if
            }//Fin for j
        }//Fin for i
        mayores = numeros;
        return mayores;
    }//Fin del metodo organizar mayores
    
    
    public static String imprimirJOptionPane(int[][] arr) {
        String resultado = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                resultado += "[" + arr[i][j] + "]";
            }
        }
        return resultado;
    }
    
}//Fin de la clase
