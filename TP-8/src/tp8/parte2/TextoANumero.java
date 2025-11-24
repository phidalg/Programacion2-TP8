package tp8.parte2;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class TextoANumero {
    public static int convertirANumero(String texto) throws NumberFormatException {
        if (texto == null || texto.trim().isEmpty()) {
            throw new NumberFormatException("El texto no puede ser nulo o vacío");
        }
        texto = texto.trim();
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El texto '" + texto + "' no es un número válido");
        }
    }
}