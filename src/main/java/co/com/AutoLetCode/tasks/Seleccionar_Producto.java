package co.com.AutoLetCode.tasks;

import co.com.AutoLetCode.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

import static co.com.AutoLetCode.userinterface.compra.*;

public class Seleccionar_Producto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECCION),
                Click.on(BTN_AÑADIR),
                Click.on(BTN_CARRITO)
        );}

    public static Seleccionar_Producto seleccionar() {
        return Instrumented.instanceOf(Seleccionar_Producto.class).newInstance();
    }
}
