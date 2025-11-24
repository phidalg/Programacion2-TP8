package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public class PayPal implements Pago {

    private final Notificable cliente;
    private double saldoPayPal;

    public PayPal(Notificable cliente, double saldoPayPal) {
        this.cliente = cliente;
        this.saldoPayPal = saldoPayPal;
    }

    public double getSaldoPayPal() {
        return saldoPayPal;
    }

    public void setSaldoPayPal(double saldoPayPal) {
        this.saldoPayPal = saldoPayPal;
    }
        
   @Override
    public void procesarPago(double pago, Pagable pedido) {
        
        double saldoCompra = pedido.calcularTotal();
        boolean pagoValido = (saldoCompra <= pago && pago <= saldoPayPal);
        if (pagoValido) {
            pedido.setEstadoPagado(cliente);
        } else {
            pedido.setEstadoNoPagado(cliente);
        }
    }
    
}