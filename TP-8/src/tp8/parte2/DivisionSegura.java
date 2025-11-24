package tp8.parte2;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class DivisionSegura {

    public static double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
    
}