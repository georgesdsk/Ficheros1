package comparadorCaracteres8;

public class Caracter implements Comparable <Caracter> {

    private int numVeces;
    private char caracter;

    public Caracter(char caracter) {
        this.caracter = caracter;
        this.numVeces = 1 ;
    }

    public void aumentarNumVeces() {
        ++this.numVeces;
    }

    public int getNumVeces() {
        return numVeces;
    }
// metodo muy raro ya que no es un getter tal como es si no tambien comprueba si la letra que se le pasa con parametros es la del atributo
    public char getCaracter() {
        return caracter;
    }

    @Override
    public int compareTo(Caracter o) {

        int resultado;

        if (this.numVeces > o.getNumVeces()) {
            resultado = 1;
        } else{
            if(this.numVeces < o.getNumVeces()) {
                resultado =-1;
            }else{
                resultado = 0;
                }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "caracter=" + caracter  + " numVeces=" + numVeces
                ;
    }
}
