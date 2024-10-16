package stepFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps2 {
WebDriver driver;
String url="https://letcode.in";
@Given("User navigate the application")
    public void userNavigateApplication(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(url);
}
@Given("User Click the login link")
    public void userclicktheloginlink(){
    driver.findElement(By.linkText("Log in")).click();
}
@When("User click the login Btn")
    public void userClicktheLoginBtn(){
    driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[2]")).click();
}
@Then("Login should be success")
    public void loginshouldbeSuccess(){
    System.out.println("login has completed successfully......");

}
@Given("User enter the username as {string}")
    public void userentertheusernameas(String username){
    driver.findElement(By.name("email")).sendKeys(username);

}
@Given("User enter the password as{string}")
    public void userenterthepasswordas(String pwd){
    driver.findElement(By.name("password")).sendKeys(pwd);
}
}
