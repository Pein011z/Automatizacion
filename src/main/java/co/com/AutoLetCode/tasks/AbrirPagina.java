package co.com.AutoLetCode.tasks;

import co.com.AutoLetCode.userinterface.InicioLetCode;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task{
    InicioLetCode inicioLetCode;
    public static AbrirPagina lapagina(){return Tasks.instrumented(AbrirPagina.class);}
    @Override
    public <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(inicioLetCode));}
}