import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// CHrome Driver Execute
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Object
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to("https://www2.hm.com/en_in/index.html");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        String signinBtnXpath= "//button[@class=\"CGae mYRh vEfo __5DXf\"]";
        String acceptCookiesXpath= "//button[@id=\"onetrust-accept-btn-handler\"]";
        Thread.sleep(2000);
        driver.findElement(By.xpath(acceptCookiesXpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(signinBtnXpath)).click();
        Thread.sleep(2000);
        BecomeMember m= new BecomeMember();
        m.Member(driver);
        /*String emailInputXpath= "//input[@id=\"email\"]";
        String passInputXpath= "//input[@id=\"password\"]";
        String email = "cnidhi785@gmail.com";
        String password= "Get@Rate817";
        driver.findElement(By.xpath(emailInputXpath)).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath(passInputXpath)).sendKeys(password);
        Thread.sleep(2000);
        String SignInXpath= "//button[@class=\"CGae mYRh qYgv ovgq _JU0\" and @type=\"submit\"]";
        driver.findElement(By.xpath(SignInXpath)).click();
        Thread.sleep(9000);
        driver.quit();*/

    }
}