package co.com.AutoLetCode.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class multiplicacion extends PageObject {
    public static Target INPUT_FIRST_NUMBER = Target.the("Primer numero").located(By.id("number1Field"));
    public static Target INPUT_SECOND_NUMBER = Target.the("Segundo numero").located(By.id("number2Field"));

    public static Target BTN_CALCULATE = Target.the("Calcular el resultado").located(By.id("calculateButton"));

    public static Target OUTPUT_ANSWER = Target.the("Campo resultado").located(By.id("numberAnswerField"));
}
