package FactorialExamen;

public class Factorial {

    public static void main(String[] args) {

        int numerobase; //numerobase porque es del cual se parte
        int multiplicaciones; // este nombre porque son las cuentas

        numerobase = 8; // este es el numero base que se va a factorizar

        int contador; // el contador para contar hasta 1
        if (numerobase == 0) {
           multiplicaciones = 1;
        } else {
            multiplicaciones = 1;
            for (contador = numerobase; contador >= 1; contador--) {
                multiplicaciones = multiplicaciones * contador;
            }
        }

        System.out.println(multiplicaciones);

    }

}
