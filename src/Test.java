import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.BekleVeKapat;
import static Utility.BaseDriver.driver;

public class Test {
        @org.junit.Test
        public void Akakce() {

            driver.get("https://www.akakce.com/");

            MyFunction.Wait(1);

            WebElement hesapAc = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[text()='Hesap Aç']"));
            hesapAc.click();
            MyFunction.Wait(1);

            WebElement ad = driver.findElement(By.xpath("//span[@class='frm_v8']/input[@id='rnufn']"));
            ad.sendKeys("TestUser");
            MyFunction.Wait(1);

            WebElement soyad = driver.findElement(By.xpath("//span[@class='frm_v8']/input[@id='rnufs']"));
            soyad.sendKeys("Tester");
            MyFunction.Wait(1);

            WebElement eMail = driver.findElement(By.xpath("//span[@class='frm_v8']/input[@id='rnufe1']"));
            eMail.sendKeys("testuser123@example.com");
            MyFunction.Wait(1);

            WebElement eMailAgain = driver.findElement(By.xpath("//span[@class='frm_v8']/input[@id='rnufe2']"));
            eMailAgain.sendKeys("testuser123@example.com");
            MyFunction.Wait(1);

            WebElement password = driver.findElement(By.cssSelector("input[name='rnufp1']"));
            WebElement passwordAgain = driver.findElement(By.cssSelector("input[name='rnufp2']"));
            password.sendKeys("Deneme.123");
            passwordAgain.sendKeys("Deneme.123");

            WebElement kadin = driver.findElement(By.xpath("//input[@type='radio' and @name='rngc' and @id='rngf']"));
            kadin.click();
            MyFunction.Wait(1);

            WebElement cityBox = driver.findElement(By.cssSelector("select[name='locpr']"));
            WebElement ilceBox = driver.findElement(By.cssSelector("select[name='locds']"));
            WebElement daysBox = driver.findElement(By.cssSelector("select[name='bd']"));
            WebElement mountsBox = driver.findElement(By.cssSelector("select[name='bm']"));
            WebElement yearsBox = driver.findElement(By.cssSelector("select[name='by']"));

            Select city = new Select(cityBox);
            Select ilce = new Select(ilceBox);
            Select days = new Select(daysBox);
            Select months = new Select(mountsBox);
            Select years = new Select(yearsBox);

            city.selectByValue("34");
            ilce.selectByValue("441");
            days.selectByValue("1");
            months.selectByValue("1");
            years.selectByValue("1990");

            WebElement checkBox = driver.findElement(By.name("rnufpca"));
            checkBox.click();
            MyFunction.Wait(1);
            WebElement hesapAcBox = driver.findElement(By.cssSelector("input[id='rfb']"));
            hesapAcBox.click();
            MyFunction.Wait(1);

            BekleVeKapat();

            WebElement addogrumu=driver.findElement(By.xpath("//a[text()='TestUser']"));
            if(addogrumu.getText().contains("TestUser"))
                System.out.println("Test başarılı bir şekilde gerçekleşmiştir.");
            else
                System.out.println("Test başarısızdır.");



            driver.get("https://www.akakce.com");
            MyFunction.Wait(1);

            WebElement girisYap=driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[2]"));
            girisYap.click();

            WebElement ePosta=driver.findElement(By.xpath("//*[@id=\"life\"]"));
            ePosta.sendKeys("er.ondr@hotmail.com");

            WebElement sifre= driver.findElement(By.cssSelector("#lifp"));
            sifre.sendKeys("Technostudy1234");

            WebElement grsYap= driver.findElement(By.cssSelector("#lfb"));
            grsYap.click();

            BekleVeKapat();

            System.out.println("*********** KULLANICI GİRİŞİ BAŞARILI ************");




        }


    }



