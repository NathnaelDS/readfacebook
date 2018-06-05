import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class automating {
    static String mypass = "IaMZB3l0v3d!";
    public static void main(String[] args) {
        method4();

    }

    public static void method1() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Length of page source: " + driver.getPageSource().toString().length());

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        driver.close();
    }

    public static void method2() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.navigate().to("https://www.google.com");

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        driver.navigate().to("https://www.reddit.com");

        driver.navigate().refresh();
        driver.navigate().back();
        driver.close();
    }

    public static void method3() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.google.com");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Addis Ababa University");
        WebElement searchBtn = driver.findElement(By.name("btnK"));
            searchBtn.click();


        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }

        searchBox.clear();
        driver.close();
    }
    public static void method4() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        WebElement id = driver.findElement(By.id("email"));
        id.sendKeys("natisoni@yahoo.com");

        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys(mypass);
        pass.submit();


        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }
        WebElement notificationValue = driver.findElement(By.id("notificationsCountValue"));
        System.out.println("You have "+notificationValue.getText()+ " new notifications.");



        //id.clear();
        //pass.clear();
        driver.close();
    }



}
