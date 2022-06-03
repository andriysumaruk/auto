import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class tests extends BaseClass {
    public tests(RemoteWebDriver driver) {
        super(driver);
    }
    public void test(){
        driver.findElement(By.id("test")).click();
    }
}