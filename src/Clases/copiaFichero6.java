package Clases;

import java.io.*;

public class copiaFichero6 {


    /*
    EJERCICIO 6.- Crea el método copiaFicheroTexto, que toma un fichero de texto y realiza una
copia a otro. Las rutas de ambos archivos son recibidas como parámetros.
     */


    public void copiaFicheroTexto(String ficheroOriginal, String ficheroReceptor){

        File original = new File(ficheroOriginal);
        File receptor = new File(ficheroReceptor);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(receptor));
            BufferedReader lector = new BufferedReader(new FileReader(original));
            String lineaLeida;

            while((lineaLeida =lector.readLine())!= null ){
                escritor.write(lineaLeida);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile(File file){

        try {
            BufferedReader lector = new BufferedReader(new FileReader(file));
            String lineaLeida;
            while((lineaLeida = lector.readLine())!= null){



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
