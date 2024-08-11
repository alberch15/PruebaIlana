package com.pruebasIlana.co.pages;


import io.cucumber.java.zh_cn.假如;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WrappedWebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class DespegarPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"lgpd-banner\"]/div/div/em")
    protected WebElementFacade btn_Entendido;

    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/div[3]/ul/li[1]/a/div/label")
    protected WebElementFacade btn_Alojamiento;

    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/div[3]/ul/li[2]/a/div")
    protected WebElementFacade btn_Vuelos;

    @FindBy(xpath = "/html/body/div[2]/nav/div[2]/div/div[3]/ul/li[3]/a/div")
    protected WebElementFacade btn_Paquetes;

    //localizadores prueba hotel
    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[1]/div/div/div/input")
    protected WebElementFacade input_DestinoHotel;

    @FindBy(xpath = "//span[@class='item-text'][em[text()='Cartagena']]")
    protected WebElementFacade opt_cartagena;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input")
    protected WebElementFacade input_fechaIn;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[1]/div/div[1]/div[3]/div[21]")
    protected WebElementFacade fechaIn;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/input")
    protected WebElementFacade input_fechaSal;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[1]/div/div[1]/div[3]/div[26]")
    protected WebElementFacade fechaSal;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/button")
    protected WebElementFacade btn_buscarHotel;


    //Localizadores prueba vuelos
    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/div/input")
    protected WebElementFacade input_destinoVuelo;

    @FindBy(xpath = "//li[@class='item -active' and .//span[@class='item-text']/em[text()='Medellín']]")
    protected WebElementFacade opt_Medellin;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input")
    protected WebElementFacade input_FechaId;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[2]/div/div[1]/div[3]/div[21]")
    protected WebElementFacade fechaId;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input")
    protected WebElementFacade input_FechaVu;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[2]/div/div[1]/div[3]/div[26]")
    protected WebElementFacade fechaVu;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div[3]/div[3]/button")
    protected WebElementFacade btn_buscarVuelo;

    //Localizadores Prueba Paquetes
    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[1]/div/div[2]/div/div/input")
    protected WebElementFacade input_destinoPaquete;

    @FindBy(xpath = "//li[@class='item -active'][span[@class='item-text']/em[text()='Medellín']]")
    protected WebElementFacade opt_MedellinPaquete;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input")
    protected WebElementFacade input_FechaInPaquete;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[2]/div/div[1]/div[3]/div[21]")
    protected WebElementFacade fechaIdPaquete;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/input")
    protected WebElementFacade input_FechaVuPaquete;

    @FindBy(xpath = "//*[@id=\"component-modals\"]/div[1]/div[2]/div/div[1]/div[3]/div[26]")
    protected WebElementFacade fechaVuPaqueta;

    @FindBy(xpath = "//*[@id=\"searchbox-v2\"]/div/div/div/div/div/div[3]/div[4]/button")
    protected WebElementFacade btn_buscarPaquete;





    public String selectedOption;

    public WebElement getRandomElement() {
        List<WebElement> elements = List.of(btn_Alojamiento, btn_Vuelos, btn_Paquetes);
        List<String> options = List.of("Alojamiento", "Vuelos", "Paquetes");
        int randomIndex = new Random().nextInt(elements.size());
        selectedOption = options.get(randomIndex);
        return elements.get(randomIndex);
    }

}
