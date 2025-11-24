package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public interface Pagable {
    
    public abstract double calcularTotal();
    
    public abstract void setEstadoPagado(Notificable cliente);
    
    public abstract void setEstadoNoPagado(Notificable cliente);
    
    public abstract EstadosPago getEstadoPago();
    
}