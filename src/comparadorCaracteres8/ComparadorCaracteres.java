package comparadorCaracteres8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparadorCaracteres {


    public ComparadorCaracteres() {
    }

    public List<Caracter> frecuenciaDeCadaCaracter(String ruta){

        File archivo = new File(ruta);
        List <Caracter> caracteres = new ArrayList();
        int caracterLeido;
        Caracter caracterBuscado;
        boolean encontrado = false;

        try (
                FileReader lector = new FileReader(archivo);
        ) {
            caracterLeido = lector.read();

            while (caracterLeido != -1) { // preguntar si hay alguna forma de recorrerlo y quedarme con la variable que cummpla la condicion
                //if (caracteres.stream().anyMatch(c -> c.getCaracter().equals((char)caracterLeido))){

                for (int i = 0; i <= caracteres.size() - 1 && !encontrado; i++) {
                    caracterBuscado = caracteres.get(i);

                    if (caracterBuscado.getCaracter() == (char) caracterLeido) {
                        caracterBuscado.aumentarNumVeces();
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    caracteres.add(new Caracter((char) caracterLeido));
                }

                caracterLeido = lector.read();
                encontrado = false;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        caracteres.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        return caracteres;
    }



}
