package co.com.AutoLetCode.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static co.com.AutoLetCode.userinterface.compra.VERIFICACION;

public class ValidacionCarrito implements Question<Boolean> {
    private static final Logger logger = LoggerFactory.getLogger(ValidacionCarrito.class);
    private static final String MENSAJE_ESPERADO = "Checkout";

    public static ValidacionCarrito validacionCarrito(){
        return new ValidacionCarrito();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(VERIFICACION).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en el botón de verificación: " + texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el texto esperado en el botón de verificación: " + e.getMessage());
            return false;
        }
    }
}
