import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

    @Test
    public void teste(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Assertions.assertEquals("Google", driver.getTitle());
    }
}
