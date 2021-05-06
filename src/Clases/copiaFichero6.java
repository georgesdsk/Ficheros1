package Clases;

import java.io.*;

public class copiaFichero6 {


    /*
    EJERCICIO 6.- Crea el método copiaFicheroTexto, que toma un fichero de texto y realiza una
copia a otro. Las rutas de ambos archivos son recibidas como parámetros.
     */


    public static void main(String[] args) {

        File original = new File("./src/5prueba");
        File copia = new File("./src/pruebaCopia");

        copiaFicheroTexto("./src/5prueba", "./src/pruebaCopia");

        printFile(copia);

    }


    public static void copiaFicheroTexto(String ficheroOriginal, String ficheroReceptor) {

        try(
        BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheroReceptor));
        BufferedReader lector = new BufferedReader(new FileReader(ficheroOriginal));
        )
        {
            String lineaLeida;

            lineaLeida =lector.readLine();

            while(lineaLeida != null ){
               // System.out.println(lineaLeida);
                escritor.write(lineaLeida);
                escritor.newLine();
                lineaLeida=lector.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFile(File file){

        try(FileReader lector = new FileReader(file)){
           // BufferedReader lector = new BufferedReader(new FileReader(file));

            //String lineaLeida;
            int caracterLeido;

            while((caracterLeido = lector.read()) != -1){
                System.out.print((char)caracterLeido);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
