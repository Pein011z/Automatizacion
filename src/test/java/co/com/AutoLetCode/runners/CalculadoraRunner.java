package co.com.AutoLetCode.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hacer_multiplicacion.feature",
        glue = {"co.com.AutoLetCode.stepsdefinitions", "co.com.AutoLetCode.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class CalculadoraRunner {
}