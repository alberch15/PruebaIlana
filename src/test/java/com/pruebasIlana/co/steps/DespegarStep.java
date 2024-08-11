package com.pruebasIlana.co.steps;

import com.pruebasIlana.co.pages.DespegarPage;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.Scanner;


public class DespegarStep extends DespegarPage {
    @Before
    public void configureWebDriver() {
        String chromeDriverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        Serenity.setSessionVariable("chromeDriverPath").to(chromeDriverPath);
    }

    DespegarPage despegarPage;

    @Step("Selecciona aleatoriamente alguno de los servicios")
    public void SeleccionarAleatorio() {
        btn_Entendido.isDisplayed();
        btn_Entendido.click();
        despegarPage.getRandomElement().click();
    }

    @Step("formulario para hotel")
    public void FormularioHotel() {
        input_DestinoHotel.isDisplayed();
        input_DestinoHotel.click();
        waitABit(1000);
        input_DestinoHotel.sendKeys("Cartagena");
        waitABit(1000);
        opt_cartagena.isDisplayed();
        opt_cartagena.click();
        waitABit(1000);
        input_fechaIn.isDisplayed();
        input_fechaIn.click();
        waitABit(1000);
        fechaIn.isDisplayed();
        fechaIn.click();
        waitABit(1000);
        input_fechaSal.isDisplayed();
        input_fechaSal.click();
        waitABit(1000);
        fechaSal.isDisplayed();
        fechaSal.click();
        btn_buscarHotel.click();
    }

    @Step("formulario para vuelos")
    public void FormularioVuelos() {
        input_destinoVuelo.isDisplayed();
        input_destinoVuelo.click();
        waitABit(1000);
        input_destinoVuelo.sendKeys("Medellin");
        opt_Medellin.isDisplayed();
        opt_Medellin.click();
        waitABit(1000);
        input_FechaId.isDisplayed();
        input_FechaId.click();
        waitABit(1000);
        fechaId.isDisplayed();
        fechaId.click();
        waitABit(1000);
        input_FechaVu.isDisplayed();
        input_FechaVu.click();
        waitABit(1000);
        fechaVu.isDisplayed();
        fechaVu.click();
        waitABit(1000);
        btn_buscarVuelo.click();

    }


    @Step("Formulario para paquetes")
    public void FormularioPaquetes() {
        input_destinoPaquete.isDisplayed();
        input_destinoPaquete.click();
        waitABit(1000);
        input_destinoPaquete.sendKeys("medellin");
        waitABit(1000);
        opt_MedellinPaquete.isDisplayed();
        opt_MedellinPaquete.click();
        waitABit(1000);
        input_FechaInPaquete.isDisplayed();
        input_FechaInPaquete.click();
        waitABit(1000);
        fechaIdPaquete.isDisplayed();
        fechaIdPaquete.click();
        waitABit(1000);
        input_FechaVuPaquete.isDisplayed();
        input_FechaVuPaquete.click();
        waitABit(1000);
        fechaVuPaqueta.isDisplayed();
        fechaVuPaqueta.click();
        waitABit(1000);
        btn_buscarPaquete.click();
    }



}
