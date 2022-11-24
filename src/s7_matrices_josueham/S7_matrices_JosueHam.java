package s7_matrices_josueham;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class S7_matrices_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        int opcion;

        do {
            String menu = "----- Bienvenido al menu del programa -----"
                    + "\n1 -> Suma elementos de la matriz"
                    + "\n2 -> Elemento mayor de una matriz"
                    + "\n3 -> Suma de matrices"
                    + "\n4 -> Suma de la primera diagonal"
                    + "\n5 -> Suma de la segunda diagonal"
                    + "\n6 -> Suma Triangular Superior"
                    + "\n7 -> Suma Triangular Inferior"
                    + "\n8 -> Suma de filas"
                    + "\n9 -> Suma de columnas"
                    + "\n10 -> Reemplazar esquinas de una columna por ceros"
                    + "\n11 -> Salir del programa"
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
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "El elemento mayor del arreglo es:\n" + organizar(numeros, filas, columnas));

                }//Fin case 2
                break;

                case 3: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] matriz1 = lectura(filas, columnas);
                    int[][] matriz2 = lectura(filas, columnas);

                    JOptionPane.showMessageDialog(null, "Matriz 1:\n" + imprimir(matriz1));
                    JOptionPane.showMessageDialog(null, "Matriz 2:\n" + imprimir(matriz2));
                    JOptionPane.showMessageDialog(null, "Matriz 2:\n" + imprimir(SumaParalela(matriz1, matriz2, filas, columnas)));
                }//Fin case 3
                break;
                
                case 4: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma de la primera diagonal es: " + sumaPrimerDiagonal(numeros));
                    
                }//Fin case 4
                break;
                
                case 5: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma de la segunda diagonal es: " + sumaSegundaDiagonal(numeros));
                }//Fin case 5
                break;
                
                case 6: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma triangular superior es: " + TriangularSuperior(numeros));
                }//Fin case 6
                break;
                
                case 7: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma triangular inferior es: " + TriangularInferior(numeros));
                }//Fin case 7
                
                case 8: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma de las filas es:\n" + imprimirJOptionPane(SumaFilas(numeros,filas)));
                }//Fin case 8
                break;
                
                case 9: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "La suma de las filas es:\n" + imprimirJOptionPane(SumaColumnas(numeros,columnas)));
                }//Fin case 9
                break;
                
                case 10: {
                    String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
                    int filas = Integer.parseInt(fil);
                    String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
                    int columnas = Integer.parseInt(col);

                    int[][] numeros = lectura(filas, columnas);
                    JOptionPane.showMessageDialog(null, "Matriz antes del reemplazo:\n" + imprimir(numeros));
                    JOptionPane.showMessageDialog(null, "Matriz despues del reemplazo:\n" + imprimir(ReemplazarEsquinas(numeros)));
                    
                }//Fin case 10
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            }//Fin del switch

        } while (opcion != 11);
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

    public static String imprimirJOptionPane(int[] arr) {
        String resultado = "";
        for (int i = 0; i < arr.length; i++) {
            resultado += "[" + arr[i] + "]";
        }
        return resultado;
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

    public static String organizar(int[][] numeros, int filas, int columnas) {

        int numeroMayor = numeros[0][0];

        String mayorPosicion = "0,0";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                if (numeros[i][j] > numeroMayor) {
                    numeroMayor = numeros[i][j];
                    mayorPosicion = "[" + i + "," + j + "]";
                }
            }
        }

        return mayorPosicion;
    }//Fin del metodo organizar mayores

    public static int[][] SumaParalela(int[][] matriz1, int[][] matriz2, int filas, int columnas) {

        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                int numeroMatriz1 = matriz1[i][j];
                int numeroMatriz2 = matriz2[i][j];
                int suma = numeroMatriz1 + numeroMatriz2;
                matrizSuma[i][j] = suma;
            }
        }
        return matrizSuma;
    }//Fin del metodo de sumar matrices

    public static int sumaPrimerDiagonal(int[][] numeros) {
        int respuesta = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == j) {
                    respuesta += numeros[i][j];
                }
            }
        }
        return respuesta;
    }//Fin metodo suma primer diagonal
    
    public static int sumaSegundaDiagonal(int[][] numeros) {
        int respuesta = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i + j == numeros.length - 1) {
                    respuesta += numeros[i][j];
                }
            }
        }
        return respuesta;
    }//Fin metodo suma segunda diagonal
    
    public static int TriangularSuperior(int[][] numeros) {
        int respuesta = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i < j) {
                    respuesta += numeros[i][j];
                }
            }
        }
        return respuesta;
    }//Fin metodo suma triangular superior
    
    public static int TriangularInferior(int[][] numeros) {
        int respuesta = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i > j) {
                    respuesta += numeros[i][j];
                }
            }
        }
        return respuesta;
    }//Fin metodo suma triangular inferior
    
     public static int[] SumaFilas(int[][] numeros, int filas) {
       
        int[] temporal = new int[filas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                    temporal[i]+= numeros[i][j];
            }
        }
        return temporal;
        
       
    }//Fin metodo suma de filas
     
     public static int[] SumaColumnas(int[][] numeros, int columnas) {
       
        int[] temporal = new int[columnas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                    temporal[j]+= numeros[i][j];
            }
        }
        return temporal;
        
       
    }//Fin metodo suma de columnas
    
     public static int[][] ReemplazarEsquinas(int[][] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                   if ((i == 0 || i == numeros.length-1) && (j== 0 || j == numeros.length-1)) {
                       numeros[i][j] = 0;
                }
            }
        }
        return numeros;
        
       
    }//Fin metodo reemplazar esquinas
}//Fin de la clase
