package com.pruebasIlana.co.utilis.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSiteDespegar {



    @Steps(shared = true)
    PageObject pruebaArus;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        pruebaArus.setDefaultBaseUrl(url);
        pruebaArus.open();
    }
}
