package copiarAlfabeticamente;


import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
EJERCICIO 9.- Diseña un programa que reciba el nombre de un fichero de texto y cree en el
directorio actual un fichero con el mismo nombre añadiendo al final ordenado (por ejemplo, si se
ejecuta sobre fichero.txt, creará ficheroOrdenado.txt, con las mismas palabras que
fichero.txt, pero ordenadas alfabéticamente. Utiliza ordenación híbrida para ello.

 */
public class CopiarAlfabeticamente9 {


    public CopiarAlfabeticamente9() {
    }

    public void copiarAlfabeticamente(String ruta){

        File archivoNuevo =new File("./src/Ficheros/pruebaCopia.txt"); //" + ruta + "Ordenado.txt
        File archivoOriginal = new File(ruta);
        List<String> palabras = new LinkedList(); // LinkedList para que en cada insercion no se copie la lista completa y el get no la recorra por completo
        String palabra;

        try (
            //archivoOriginal =new File(ruta); // si no se encuentra el  file, se captura la excepcion
           // archivoNuevo = new File("./src/Ficheros/" + ruta + "Ordenado.txt"); todo da error
            Scanner sc = new Scanner(new FileReader(archivoOriginal))
                    )
        {
            while (sc.hasNext()) {
                palabras.add(sc.next());
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
/*
        palabras.sort(Comparator.naturalOrder());
       // archivoNuevo.createNewFile();
            try
                (
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo)
                ){
                //palabras.stream().forEachOrdered(s-> escritor.write(s));
                for (String p:
                     palabras) {
                    escritor.write(p); // todo no esribe las palabras en el fichero, posiblemente porque no termine de cerrarse
                    // pregunta sobre writer.write(char[], int)sobrecargado
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
*/
                //todo No me dejaba ponerlo entre parentesis ni ponerlo en el finally porque no me reconocia al escritor.
                // Por lo que no he poddido cerrar bien los bufers

            }
    }


