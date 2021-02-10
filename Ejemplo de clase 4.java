import java.util.Scanner;
public class Excercise {
    public static void main (String [] Args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array bidimensional de elementos de tipo int
        int[][] mat = Internal.loadIntArray2D(input);
        // array que almacena el número de valores pares en cada fila de mat
        int [] res;
        
        res = diagonal(mat);

        // Se muestra el resultado
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int [] diagonal(int[][] valores) {
        //-->> Poner aquí su código <<--//
        int[] res = new int[valores.length];
        res[0] = 1;
        res[res.length - 1] = -1;
        
        for (int i = 1; i < valores.length - 1; i++){
            for (int j = 1; j < valores[i].length - 1; j++){
                if ( valores[i-1][j] > valores[i+1][j] ){
                    res[i] = -1;
                } else if ( valores[i-1][j] == valores[i+1][j] ){
                    res[i] = 0;
                } else if ( valores [i-1][j] < valores[i+1][j] ){
                    res[i] = 1;
                }
            }
        }
        return res;
    }    
}