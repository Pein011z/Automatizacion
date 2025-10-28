package co.com.AutoLetCode.stepsdefinitions;

import co.com.AutoLetCode.tasks.Abrir_Pagina;
import co.com.AutoLetCode.tasks.Seleccionar_numeros;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculadoraStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de la calculadora$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeLaCalculadora() {
        theActorInTheSpotlight().wasAbleTo(Abrir_Pagina.lapagina());
    }

    @Cuando("^ingrese los dos numero y presione el boton calculate$")
    public void ingreseLosDosNumeroYPresioneElBotonCalculate(DataTable table) {
         java.util.Map<String, String> row = table.asMaps(String.class, String.class).get(0);
        theActorInTheSpotlight().attemptsTo(Seleccionar_numeros.seleccionar(row.get("First number"), row.get("Second Number")));
    }

    @Entonces("^la calculadora debe mostrar el resultado$")
    public void laCalculadoraDebeMostrarElResultado() {
    }
}
