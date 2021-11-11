import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KP_Project1 {
    public static void main(String[] args) {
        String baseUrl = "https://www.google.co.uk";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
    }

    public void method() {
        System.out.println("hinal1");

    }
}
