

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus
 */
public class OpenTDB {
    
    static WebDriver driver;
    
    public OpenTDB(WebDriver driver){
        this.driver = driver;
    }
    
    public void buscaNoBanco(WebDriver driver){
        WebElement campoBusca = driver.findElement(By.id("query"));
        campoBusca.sendKeys("Science: Computers");
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        search.click();
    }
    
    public void buscaPorCategoria(WebDriver driver){
        WebElement campoBusca = driver.findElement(By.id("query"));
        campoBusca.sendKeys("Science: Computers");
        
        Select tipoCategoria = new Select(driver.findElement(By.id("type")));
        tipoCategoria.selectByValue("Category");
                
        WebElement search = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        search.click();
    }
    
    public void buscaPorAutor(WebDriver driver){
        WebElement campoBusca = driver.findElement(By.id("query"));
        campoBusca.sendKeys("Coldflame");
        
        Select tipoCategoria = new Select(driver.findElement(By.id("type")));
        tipoCategoria.selectByValue("User");
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        search.click();
    }
    
}
