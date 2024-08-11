package com.pruebasIlana.co.definitions;

import com.pruebasIlana.co.pages.DespegarPage;
import com.pruebasIlana.co.steps.DespegarStep;
import com.pruebasIlana.co.utilis.website.WebSiteDespegar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;

public class DespegarDef {

    DespegarPage despegarPage;

    @Steps(shared = true)
    WebSiteDespegar url;

    @Steps(shared = true)
    DespegarStep despegar;

    @Given("el usuario navega al sitio web")
    public void el_usuario_navega_al_sitio_web() {
        url.navigateTo("https://www.despegar.com.co/");
    }

    @When("Selecciona aleatoriamente alguno de los servicios")
    public void seleccionaAleatoriamenteAlgunoDeLosServicios() {
        despegar.SeleccionarAleatorio();
    }

    @When("Diligenciar informacion requerida")
    public void diligenciarInformacionRequerida() {

        WebElement randomElement = despegarPage.getRandomElement();
        randomElement.click();
        String option = despegarPage.selectedOption;

        if (option != null) {
            switch (option) {
                case "Alojamiento":
                    despegar.FormularioHotel();
                    break;
                case "Vuelos":
                    despegar.FormularioVuelos();
                    break;
                case "Paquetes":
                    despegar.FormularioPaquetes();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        } else {
            System.out.println("La opción seleccionada es null, no se puede proceder con el switch.");

        }
    }


}
