package co.com.AutoLetCode.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class compra extends PageObject{
    public static Target BTN_SELECCION = Target.the("Seleccion Producto").located(By.xpath("/html/body/app-root/app-home/section/div/div[2]/div[1]/div/footer/button"));
    public static Target BTN_AÑADIR=  Target.the("Añadir el producto seleccionado al carrito").located(By.xpath("/html/body/app-root/app-productlist/section/div[2]/div[1]/div/div/div[1]/button"));
    public static Target BTN_CARRITO= Target.the("Clic boton inicio sesión").located(By.xpath("/html/body/app-root/app-productlist/section/div[1]/div/div[2]/app-cartvalue/button[1]"));
    public static Target VERIFICACION = Target.the("Verificacion de que el elemento se añadió correctamente").located(By.xpath("/html/body/app-root/app-cart/section/div/div[1]/div[2]/div/button"));

}