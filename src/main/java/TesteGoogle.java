import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

    private ChromeDriver driver;

    @Test
    @DisplayName("Open browser with selenium for first test")
    public void teste(){
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().setSize(new Dimension(1200,765));
        driver.manage().window().maximize();
        Assertions.assertEquals("Google", driver.getTitle());
    }

    @AfterEach
    public void close(){
        driver.quit();
    }
}
