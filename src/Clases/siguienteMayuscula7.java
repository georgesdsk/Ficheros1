package Clases;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
- Diseña un programa con contraseña, que será suministrada desde la línea de
comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
deben empezar por mayúsculas.
 */
public class siguienteMayuscula7 {

    private String contrasenia;


    public siguienteMayuscula7(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public  boolean comprobarContrasenia(String contrasenia, String ruta){

        boolean accionRealizada = false;

        if (this.contrasenia == contrasenia) {
            siguienteMayuscula(ruta);
            accionRealizada = true;
        }
        return accionRealizada;
    }


    private void siguienteMayuscula(String ruta)  {

        File original = new File("./src/5Pruba");
        File copia = new File("./src/pruebaCopia");
        int letraLeida;
        List<Character> caracteresEspeciales = ArrayList(Arrays.asList('.','¡','?',';',':'));



        try (

                FileReader lector = new FileReader(original);
                FileWriter escritor = new FileWriter(copia);
              )
        {

            letraLeida = lector.read();
            while(letraLeida != -1){



            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }











}
