package Clases;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class estadisticaTexto5 {


    /*
    Especificacion: el número de palabras de ese fichero, el número de párrafos, el número de caracteres,
    la media de caracteres por palabra y la media de palabras por párrafo.
     */
    public static void main(String[] args) {

        //Arrays.stream(contadorPalabrasCaracteres("./src/5Prueba")).forEach(System.out::println);
        System.out.println(contadorLineas("./src/5prueba"));
    }

    public static int[] contadorPalabrasCaracteres(String ruta){

        Scanner sc = null; // llamamos a escribirRuta para que nos de una que ya exista
        try {
          sc = new Scanner(new FileInputStream(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] palabrasCaracteres = new int[2]; // la posicion 0 son las palabras y la 1 las letras
        int i = 0 , j = 0;

        while(sc.hasNext()){ // con el metodo hasNext() del Scanner se puede contar palabras con mucha mas facilidad que utilizando el split() y convirtiendolo en array
            palabrasCaracteres[0] = i++;// palabras
            palabrasCaracteres[1] += sc.next().length();//caracteres

        }

        return palabrasCaracteres;

        
    }


    /*
    contadorLineas: Lo voy hacer mediante,el metodo split de \n
     */

    public static int contadorLineas(String ruta){ // se podra colocar un switch que sume en cada variable distinta dependiendo del caracter, que salte
        //los caracteres especiales como el ,.

        char caracterConvertido;
        int parrafos = 0;

        try {
            FileReader lector = new FileReader(ruta);
            int cursorLector = 0;
            while(cursorLector != -1){
                cursorLector = lector.read();
                if ((char)cursorLector == '\n' ){
                    ++parrafos;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parrafos;
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
