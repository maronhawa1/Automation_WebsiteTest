import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver=new ChromeDriver();
    String url;
    String email;
    String password;
    String name;

    login(  String email, String password ) {

        this.email = email;
        this.password = password;

    }



    public String getEmail() {
        return this.email;
    }

    public String setEmail(String newEmail) {
        return this.email = newEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public String setPassword(String newPassword) {
        return this.password = newPassword;
    }
    public void makeLogin(String url){

        driver.get(url);
        WebElement emailUser=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        emailUser.sendKeys(this.email);
        WebElement passwordUser=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
        passwordUser.sendKeys(this.password);
        WebElement btnLogin=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        btnLogin.click();

    }
    public void goToCart(){
        WebElement gotocart=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
        gotocart.click();
    }
    public void goToContactus(){
        driver.navigate().to("https://automationexercise.com/contact_us");
    }


}

