package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author CELINA
 */
public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("División por cero");
        }
        return numerador / denominador;

    }

}
