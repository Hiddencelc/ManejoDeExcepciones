package test;

import aritmetica.Aritmetica;


/**
 *
 * @author CELINA
 */
public class TestExcepciones {


    public static void main(String[] args) {

        int resultado = 0;
        try {
          resultado= Aritmetica.division(10,0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);// se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        System.out.println("La variable tiene como valor :" + resultado);

    }

}
