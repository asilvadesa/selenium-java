import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

    @Test
    @DisplayName("Deve interagir com RadioButton")
    void radioButtonTest(){
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/campo_treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        Assertions.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
    }

    @Test
    @DisplayName("Deve interagir com Checkbox")
    void checkBoxTest(){
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/campo_treinamento/componentes.html");
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assertions.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
    }

    @Test
    @DisplayName("Deve interagir com Combo")
    void comboBoxTest(){
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/campo_treinamento/componentes.html");
        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(element);
        //combo.selectByIndex(2);
        //combo.selectByValue("superior");
        combo.selectByVisibleText("Mestrado");

        Assertions.assertEquals("Mestrado", combo.getFirstSelectedOption().getText());

    }

    @AfterEach
    void close(){
        driver.quit();
    }
}
