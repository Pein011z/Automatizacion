package co.com.AutoLetCode.stepsdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.DataTable;
import co.com.AutoLetCode.questions.ValidacionCarrito;
import co.com.AutoLetCode.tasks.AbrirPagina;
import co.com.AutoLetCode.tasks.Seleccionar_Producto;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarritoStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de productos$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeProductos() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());

    }

    @Cuando("^seleccione un producto de los items disponibles$")
    public void seleccioneUnProductoDeLosItemsDisponibles() {
        theActorInTheSpotlight().attemptsTo(Seleccionar_Producto.seleccionar());
    }

    @Entonces("^se debe verificar que el carrito registre el item seleccionado$")
    public void seDebeVerificarQueElCarritoRegistreElItemSeleccionado() {
        theActorInTheSpotlight().should(seeThat(ValidacionCarrito.validacionCarrito()));
    }
}