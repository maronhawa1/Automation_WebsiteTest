import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class loginMain {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driverLogin=new ChromeDriver();
        driverLogin.get("https://automationexercise.com/login");
        Scanner in = new Scanner(System.in);
        String email="",password="";
        System.out.println("Enter email");
        email= in.next();
        System.out.println("Enter passwod");
        password=in.next();
        login user=new login(email,password);
        WebElement emailInput=driverLogin.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        emailInput.sendKeys(user.getEmail());
        WebElement passwordInput=driverLogin.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
        passwordInput.sendKeys(user.getPassword());
        WebElement btnLogin=driverLogin.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        btnLogin.click();

   // user.goToContactus();

    }

}
