package tp8.parte1;


/**
 *
 * @author Pedro Hidalgo
 */
public class Cliente implements Notificable {

    @Override
    public void notificar(Notificaciones notificacion) {
        System.out.println(notificacion.notificacion);
    }

}