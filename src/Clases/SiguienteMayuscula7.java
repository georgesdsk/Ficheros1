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
public class SiguienteMayuscula7 {

    private String contrasenia;


    public SiguienteMayuscula7(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public  boolean entrar(String contrasenia, String ruta){

        boolean accionRealizada = false;

        if (this.contrasenia == contrasenia) {
            siguienteMayuscula(ruta);
            accionRealizada = true;
        }
        return accionRealizada;
    }


    private void siguienteMayuscula(String ruta)  {

        File original = new File(ruta);
        File copia = new File("./src/pruebaCopia.txt");
        int enteroLetraLeida;
        Character letraLeida;
        Character[] caracteresEspecialesArray =  new Character[]{'.','¡','!','?',';',':'};
        List<Character> caracteresEspeciales = new ArrayList(Arrays.asList( caracteresEspecialesArray));
        boolean siguienteMayuscula = true;

        try (
                FileReader lector = new FileReader(original);
                FileWriter escritor = new FileWriter(copia);
              )
        {
            enteroLetraLeida = lector.read();

            while(enteroLetraLeida != -1){
                letraLeida = (Character)(char) enteroLetraLeida;

                if (letraLeida != ' '){
                    if (caracteresEspeciales.contains(letraLeida)){
                        siguienteMayuscula = true;
                    }else if(siguienteMayuscula && Character.isLowerCase(letraLeida)){
                        letraLeida = Character.toUpperCase(letraLeida);
                        siguienteMayuscula = false;
                    }else{
                        siguienteMayuscula = false;
                    }
                }
                escritor.write(letraLeida);
                enteroLetraLeida = lector.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }













}
