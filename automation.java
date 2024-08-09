import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class automation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.com/");

        // Verify the correct page by printing the URL and Title
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //clicking on the global button
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-tertiary uitk-spacing global-navigation-nav-button']")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //clicking on india
        driver.findElement(By.xpath("//*[@id=\"site-selector\"]/option[19]")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //clicking on english
        driver.findElement(By.xpath("//*[@id=\"language-selector\"]/option[1]")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //clicking on save button
        driver.findElement(By.xpath("//*[@id=\"app-layer-disp-settings-picker\"]/section/div[5]/button")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //clicking on the flights
        driver.findElement((By.xpath("//*[@id=\"multi-product-search-form-1\"]/div/div/div/div/div[1]/ul/li[2]/a/span"))).click();

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //departure kolkata
        driver.findElement(By.xpath("//*[@id='FlightSearchForm_ROUND_TRIP']/div/div[1]/div/div[1]/div/div/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"origin_select\"]")).sendKeys("kolkata");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"origin_select-menu\"]/section/div/div[2]/div/ul/div[1]/li/div/div/button")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //destination hyderabad
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"destination_select\"]")).sendKeys("hyderabad");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"destination_select-menu\"]/section/div/div[2]/div/ul/div[1]/li/div/div/button")).click();

        //selecting data
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/div/div/div/button")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr[2]/td[6]/div")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[2]/table/tbody/tr[3]/td[2]/div")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/footer/div/button")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //selecting adults
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[3]/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[3]/div/div[2]/div/div/section/div[1]/div/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"travelers_selector_done_button\"]")).click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //clicking on search
        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();

        System.out.println("Please solve the CAPTCHA, then press Enter...");
        new Scanner(System.in).nextLine();

        //clicking on flight
        driver.findElement(By.xpath("//*[@id=\"AQqaAgqEAnY1LXNvcy1kZDc5YjM3OGUyZDk0ZDVhYTk5YzRjNzdmNjliN2Y1OS0xMjktMzItNTEyfjIuU35BUW9DQ0JzU0J3aW9HeEFKR0Jnb0FsZ0NjQUI2REhSeVlYWmxiR1oxYzJsdmJvZ0I2b2FvUlF-QVFvckNpa0l0b29CRWdRMk5URXpHTUtnQVNDSEhpaWU3dGtDTUp2djJRSTRUa0FBV0FGeUJrNHdTVkJTVkFvb0NpWUl0b29CRWdNeU9ETVloeDRnd3FBQktPNzkyUUl3NXY3WkFqaE1RQUJZQVhJRVREQkpVQklLQ0FzUUFSZ0lLZ0kyUlJnQ0lnUUlBUkFDS0FJd0F3EQAAAAAA_d9AIgEBKgUSAwoBMRJHChoKCjIwMjQtMTAtMTASA0NDVRoDSFlEMAE4AQoaCgoyMDI0LTEwLTExEgNIWUQaA0NDVTABOAESBxIFQ09BQ0gaAhACIAIaCAgBEgQaACIA\"]/div/div/button")).click();

    }
}
