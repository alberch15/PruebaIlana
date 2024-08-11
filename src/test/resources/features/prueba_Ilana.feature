@suite
Feature: CP01

  Background: Yo como usuario quiero

  @CompraAleatoria
  Scenario: compra en pagina web despegar
    Given el usuario navega al sitio web
    When Selecciona aleatoriamente alguno de los servicios
    When Diligenciar informacion requerida