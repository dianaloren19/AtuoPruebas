package co.com.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesArticuloPage {

    public static final Target ITEM_ARTICULO = Target.the("Característica del artículo").locatedBy("/html/body/div[7]/div/div[2]/div/div[2]/div[8]/div/div/ul/li[5]/div/span");
    public static final Target ITEM_ENVIO_DESDE = Target.the("Envío del artículo").locatedBy("(//div[@class='sku-property-text'])[1]");
    public static final Target INPUT_CANTIDAD = Target.the("Input cantidad").locatedBy("/html/body/div[7]/div/div[2]/div/div[2]/div[9]/span/span/span[2]/input");
    public static final Target BOTON_ANADIR_CESTA = Target.the("Botón añadir a la cesta").locatedBy("/html/body/div[7]/div/div[2]/div/div[2]/div[13]/span[2]/button");
    public static final Target BOTON_VER_CESTA = Target.the("Botón ver la cesta").locatedBy("/html/body/div[12]/div[2]/div/div/div/div[2]/a");

}
