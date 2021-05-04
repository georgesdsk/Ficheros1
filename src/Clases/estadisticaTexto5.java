package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class estadisticaTexto5 {


    /*
    Especificacion: el número de palabras de ese fichero, el número de párrafos, el número de caracteres,
    la media de caracteres por palabra y la media de palabras por párrafo.
     */
    public static void main(String[] args) {


        try {
           // BufferedReader lector = new BufferedReader(new FileReader(escribirRuta()));
            File file = new File(escribirRuta());





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int[] contadorPalabrasCaracteres(String ruta){

        Scanner sc = new Scanner(ruta); // llamamos a escribirRuta para que nos de una que ya exista

        int[] palabrasCaracteres = new int[1]; // la posicion 0 son las palabras y la 1 las letras
        int i = 0 , j = 0;

        while(sc.hasNext()){ // con el metodo hasNext() del Scanner se puede contar palabras con mucha mas facilidad que utilizando el split() y convirtiendolo en array
            palabrasCaracteres[0] = i++;// palabras
            palabrasCaracteres[1] = sc.next().length();//caracteres
        }

        return palabrasCaracteres;
    }


    public static String escribirRuta(){

        Scanner scanner = new Scanner(System.in);
        String path;
        File file;

        do {
            System.out.println( "Escribe la path existente del archivo");
            path = scanner.nextLine();
            file = new File(path);
        }while(!file.exists());

        return path;
    }


}
