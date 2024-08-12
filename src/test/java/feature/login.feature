Feature: Login

  Scenario: Login exitoso
    Given cuando me encuentro en la web principal
    When ingreso mis credenciales correctas
    Then me muestra el Dasboard principal
