package co.com.AutoLetCode.tasks;

import co.com.AutoLetCode.userinterface.InicioCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir_Pagina implements Task {

    public static Abrir_Pagina lapagina(){return Tasks.instrumented(Abrir_Pagina.class);}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(new InicioCalculadora()));
    }
}
