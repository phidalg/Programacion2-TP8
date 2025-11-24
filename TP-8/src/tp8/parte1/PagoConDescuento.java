package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public interface PagoConDescuento extends Pago {
    
    public abstract void aplicarDescuento(double descuento, double pago, Pagable pagable);
    
}