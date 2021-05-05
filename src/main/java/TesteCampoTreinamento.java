import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {

    private WebDriver driver;

    @Test
    @DisplayName("Deve interagir com TextField")
    void textFieldTest(){
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/campo_treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Anderson");

        Assertions.assertEquals("Anderson",  driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    @Test
    @DisplayName("Deve interagir com TextArea")
    void textAreaTest(){
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/campo_treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste de Area");

        Assertions.assertEquals("Teste de Area",  driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    @AfterEach
    void close(){
        driver.quit();
    }
}
