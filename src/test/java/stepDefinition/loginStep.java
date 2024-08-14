package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStep {
    WebDriver driver;
    @Given("cuando me encuentro en la web principal")
    public void cuando_me_encuentro_en_la_web_principal() {
       driver= new ChromeDriver();
       driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");

    }
    @When("ingreso mis credenciales correctas")
    public void ingreso_mis_credenciales_correctas() {
    driver.findElement(By.cssSelector("input#usr")).sendKeys("Janet");
    }
    @Then("me muestra el Dasboard principal")
    public void me_muestra_el_dasboard_principal() {


    }
}
