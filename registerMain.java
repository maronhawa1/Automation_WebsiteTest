import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class registerMain {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        Scanner scan=new Scanner(System.in);
        String name="";
        String email="";
        String title,password="";
        String firstName="",lastName="",address="",country="",state="",city="",zipCode="",phone="";
        int day=0,month=0,year=0,doneDetails=0;

        while (doneDetails==0) {
            System.out.println("Enter name");
            name = scan.next();
            System.out.println("Enter email");
            email = scan.next();
            System.out.println("Enter password");
            password = scan.next();
            System.out.println("Enter day of birth");
            day = scan.nextInt();
            System.out.println("Enter month of birth");
            month = scan.nextInt();
            System.out.println("enter year of birth");
            year = scan.nextInt();
            System.out.println("enter firstname");
            firstName = scan.next();
            System.out.println("enter lastname");
            lastName = scan.next();
            System.out.println("enter address");
            address = scan.next();
            System.out.println("enter country");
            country = scan.next();
            System.out.println("enter city ");
            city = scan.next();
            System.out.println("enter state");
            state = scan.next();
            System.out.println("enter zipcode");
            zipCode = scan.next();
            System.out.println("enter phone");
            phone = scan.next();
            doneDetails++;
        }
        if(doneDetails==1) {
            driver.get("https://automationexercise.com/login");
            register user1 = new register(name, email, password, day, month, year, firstName, lastName, address, country, state, city, zipCode, phone);
            WebElement nam = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
            nam.sendKeys(user1.getName());
            WebElement em = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
            em.sendKeys(user1.getEmail());
            WebElement log = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
            log.click();



                WebElement emailExist = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
                String res = emailExist.getText();
                user1.emailIsExist(res);
                Thread.sleep(1000);

        }
        register user1 = new register(name, email, password, day, month, year, firstName, lastName, address, country, state, city, zipCode, phone);

        WebElement nameuser=driver.findElement(By.xpath("//*[@id=\"name\"]"));
       nameuser.sendKeys(user1.getName());

     WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
     pass.sendKeys(user1.getPassword());


    }
}
