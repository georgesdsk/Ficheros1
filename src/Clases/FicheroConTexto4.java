package Clases;

import java.io.*;
import java.util.Scanner;

public class FicheroConTexto4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String linea;

        String path = escribirRuta();
        File file = new File(path);

        try (BufferedWriter salida = new BufferedWriter(new FileWriter(path))) {
            file.createNewFile();
            System.out.println("Escribe el texto que desea introducir en su archivo. Cuando desee parar escriba un '*'");
            linea = sc.nextLine();
            while (!linea.equals("*")) {
                salida.write(linea+"\n");
                linea = sc.nextLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            //al iniciarse en la condicion del try no hace falta cerrarlo
        }
    }


    public static String escribirRuta(){

        Scanner scanner = new Scanner(System.in);
        String path;

        File file;

        do {
            System.out.println( "Escribe la path unica del archivo a crear");
            path = scanner.nextLine();
            file = new File(path);
        }while(file.exists());


        return path;
    }


}
