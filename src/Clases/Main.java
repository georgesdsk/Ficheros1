package Clases;

import java.io.File;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        File file = new File("./");
        //1 imprimirContenido(file);
        //2 propiedadesYcontenidos("./src");
        String sCarpAct = System.getProperty("user.dir");
        System.out.println("Carpeta del usuario = " + sCarpAct);

    }
//1º
    public static void imprimirContenido(File file){

        String [] listado = file.list();
        Arrays.stream(listado).sorted();
       // Arrays.sort(listado);
       for (int i = 0; i < listado.length; i++) {

            System.out.println(listado[i]);
        }
    }
//2-3
    public static void propiedadesYcontenidos(String directorio){

        File file = new File(directorio);
        if(file.exists()){
            System.out.println(file.getName()+", " +file.getAbsolutePath()+", " +file.canRead() +", " +file.canWrite() +", " +file.length() );
            imprimirContenido(file);
        }else{
            System.out.println("error");
        }
    }

//4






}
