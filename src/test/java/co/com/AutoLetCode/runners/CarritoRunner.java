package co.com.AutoLetCode.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/añadir_producto_carrito.feature",
        glue = {"co.com.AutoLetCode.stepsdefinitions", "co.com.AutoLetCode.utils.hooks"},
        snippets = SnippetType. CAMELCASE)

public class CarritoRunner {
}