package co.com.AutoLetCode.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoLetCode.userinterface.multiplicacion.BTN_CALCULATE;
import static co.com.AutoLetCode.userinterface.multiplicacion.INPUT_FIRST_NUMBER;
import static co.com.AutoLetCode.userinterface.multiplicacion.INPUT_SECOND_NUMBER;

public class Seleccionar_numeros implements Task {

    private final String firstNumber;
    private final String secondNumber;

    public Seleccionar_numeros(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstNumber).into(INPUT_FIRST_NUMBER),
                Enter.theValue(secondNumber).into(INPUT_SECOND_NUMBER),
                Click.on(BTN_CALCULATE)
        );
    }

    public static Seleccionar_numeros seleccionar(String firstNumber, String secondNumber) {
        return Instrumented.instanceOf(Seleccionar_numeros.class).withProperties(firstNumber, secondNumber);
    }
}
