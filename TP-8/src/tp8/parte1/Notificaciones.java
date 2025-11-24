package tp8.parte1;

/**
 *
 * @author Pedro Hidalgo
 */
public enum Notificaciones {

    PAGOEXITOSO("El pago se procesó correctamente."),
    PAGORECHAZADO("El pago no pudo ser procesado."),;
    
    public final String notificacion;

    private Notificaciones(String notificacion) {
        this.notificacion = notificacion;
    }
    
}