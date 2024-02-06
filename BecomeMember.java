import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class BecomeMember {

    public void Member(WebDriver driver) throws InterruptedException {
        String BecomeAMemberBtn = "//button[@class=\"CGae mYRh Ubu_\"]";
        driver.findElement(By.xpath(BecomeAMemberBtn)).click();
        Thread.sleep(2000);
        String MemberEmail = "//input[@class=\"psxM\" and @id=\"email\"]";
        String Email="dnidhi8178@gmail.com";
        driver.findElement(By.xpath(MemberEmail)).sendKeys(Email);
        Thread.sleep(4000);
        String CreatePassword = "//input[@id=\"password\"]";
        String Password ="Nidhi@123";
        driver.findElement(By.xpath(CreatePassword)).sendKeys(Password);
        int date = 26;
        int month = 01;
        int year = 1998;
        Thread.sleep(3000);
        String MemberDate = "//input[@class=\"gdRO\" and @placeholder=\"DD\"]";
        driver.findElement(By.xpath(MemberDate)).sendKeys(String.valueOf(date));
        Thread.sleep(3000);
        String MemberMonth = "//input[@class=\"gdRO\" and @placeholder=\"MM\"]";
        driver.findElement(By.xpath(MemberMonth)).sendKeys(String.valueOf(month));
        Thread.sleep(3000);
        String MemberYear = "//input[@class=\"gdRO\" and @placeholder=\"YYYY\"]";
        driver.findElement(By.xpath(MemberYear)).sendKeys(String.valueOf(year));
        String Arrow="//*[contains(text(), \"ADD MORE & GET MORE\")]";
        Thread.sleep(3000);
        driver.findElement(By.xpath(Arrow)).click();
        String FirstName="Nidhi";
        String MemberFirstName= "//input[@id=\"firstName\"]";
        Thread.sleep(3000);
        driver.findElement(By.xpath(MemberFirstName)).sendKeys(FirstName);
        String LastName="Kumari";
        String MemberLastName="//input[@id=\"lastName\"]";
        Thread.sleep(3000);
        driver.findElement(By.xpath(MemberLastName)).sendKeys(LastName);
        String Gender= "//select[@id=\"gender\"]";
        Thread.sleep(3000);
        WebElement w= driver.findElement(By.xpath(Gender));
        Select dropdown= new Select(w);
        Thread.sleep(2000);
        dropdown.selectByIndex(1);
        String PostalCode= "122016";
        String MemberPostalCode= "//input[@id=\"postalCode\"]";
        Thread.sleep(2000);
        driver.findElement(By.xpath(MemberPostalCode)).sendKeys(PostalCode);
        String checkbox= "//input[@id=\"hmNewsSubscription\"]";
        Thread.sleep(2000);
        driver.findElement(By.xpath(checkbox)).click();
        String BecomeAMember= "//button[@class=\"CGae mYRh qYgv ovgq _VyP\"]";
        Thread.sleep(2000);
        driver.findElement(By.xpath(BecomeAMember)).click();
    }
}
