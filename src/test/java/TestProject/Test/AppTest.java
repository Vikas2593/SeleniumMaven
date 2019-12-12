package TestProject.Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	
	

	/**
	 * Hello world!
	 * @throws AWTException 
	 * @throws InterruptedException 
	 *
	 */
	
		
		    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
		  
		  
	

    public AppTest( String testName ) throws AWTException, InterruptedException
    {
    	  System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64/chromedriver");
		    WebDriver driver = new ChromeDriver();
		    Robot rb = new Robot();
		    
		    driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/");
		    WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']")));
		    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cucumber");
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(2000); 
		    driver.quit();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
