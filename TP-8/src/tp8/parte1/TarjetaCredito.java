package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public class TarjetaCredito implements PagoConDescuento {
    
    private final Notificable cliente;

    public TarjetaCredito(Notificable cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void procesarPago(double pago, Pagable pedido) {
        
        double saldo = pedido.calcularTotal();
        if (pedido.getEstadoPago() == EstadosPago.NOPAGADO && saldo <= pago) {
            pedido.setEstadoPagado(cliente);
        } else {
            pedido.setEstadoNoPagado(cliente);
        }
    }
    
    @Override
    public void aplicarDescuento(double descuento, double pago, Pagable pedido) {
        
        double saldo = pedido.calcularTotal() * (1 - descuento / 100.0);
        if (pedido.getEstadoPago() == EstadosPago.NOPAGADO && saldo <= pago) {
            pedido.setEstadoPagado(cliente);
        } else {
            pedido.setEstadoNoPagado(cliente);
        }
    }

}