package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public interface Pago {
    
    public abstract void procesarPago(double pago, Pagable pedido);
    
}