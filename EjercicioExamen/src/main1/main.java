package main1;

import java.util.concurrent.TimeUnit;
import javax.management.StringValueExp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Fran
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver navegador = new ChromeDriver();
       
        //Abro google
       
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       
        navegador.manage().window().maximize();
        navegador.get("https://www.google.com/search?q=calculadora+google&rlz=1C1UEAD_esES1075ES1076&oq=calculadora+go&gs_lcrp=EgZjaHJvbWUqDQgAEAAYgwEYsQMYgAQyDQgAEAAYgwEYsQMYgAQyBggBEEUYOTIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABKgCALACAA&sourceid=chrome&ie=UTF-8");
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("/html/body/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       
        WebElement cajaCalculadora = navegador.findElement(By.xpath("/html/body/div[6]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div"));
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        double base = 12.5678;
        double altura = 20.5555;
       
        cajaCalculadora.sendKeys(String.valueOf(base));
        navegador.findElement(By.xpath("/html/body/div[6]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
        cajaCalculadora.sendKeys(String.valueOf(altura));
        navegador.findElement(By.xpath("/html/body/div[6]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        cajaCalculadora.sendKeys("2");
        navegador.findElement(By.xpath("/html/body/div[6]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
       
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       
        double resultado = Double.parseDouble(cajaCalculadora.getText());
        System.out.println(resultado);
       
        //Abro la otra pagina
       
        navegador.get("https://web2.0calc.es/");
        navegador.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/input[2]")).sendKeys(String.valueOf(base));
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/button[9]")).click();
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/input[2]")).sendKeys(String.valueOf(altura));
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/button[9]")).click();
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/input[2]")).sendKeys("2");
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/p/button[1]")).click();
       
        navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/input[2]")).click();
        double resultado2 = Double.parseDouble(navegador.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/input[2]")).getAttribute("value"));
        System.out.println(resultado2);
        
        navegador.close();

        
    }
    
}
