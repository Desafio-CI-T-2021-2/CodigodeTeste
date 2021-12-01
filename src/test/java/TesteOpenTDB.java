/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Matheus
 */
public class TesteOpenTDB {
    
    static OpenTDB opentdb;
    static WebDriver driver;
    
    public TesteOpenTDB() {
    }
    
    @BeforeAll
    public static void setUpClass() {                
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        //                       Alterar este endereço para a localização do chromedriver.exe em seu computador
        File arquivo = new File("C:\\Users\\Matheus\\Desktop\\Desafio CI&T\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", arquivo.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("https://opentdb.com/browse.php");
        opentdb = new OpenTDB(driver);
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testePesquisaNoBanco(){
         opentdb.buscaNoBanco(driver);
     }
    
     @Test
     public void testePesquisaCategoria() {
        opentdb.buscaPorCategoria(driver);
    }
     
     @Test
     public void testePesquisaAutor(){
        opentdb.buscaPorAutor(driver);
     }
}
