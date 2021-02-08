package testsYT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectsYT.HomeYT;
import objectsYT.Song;

public class TestYT {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/Nevena/Downloads/chromedriver");
		driver = new ChromeDriver();
	
	}
		
	@Test(priority = 1)
	public void testSearch() {
		driver.navigate().to("https://www.youtube.com/");
		
		HomeYT.typeSong(driver);
		HomeYT.pressSearch(driver);
		
		String current = driver.getCurrentUrl();
		String expected = Song.URL;
		
		Assert.assertEquals(current, expected);
		
	}
	
	@Test(priority = 2)
	public void testPlay() {
		driver.navigate().to(Song.URL);
		
		Song.playSong(driver);
		
		String current = driver.getCurrentUrl();
        String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		
		Assert.assertEquals(current, expected);
		
	}
	
	@Test(priority = 3)
	public void playNext() {
		
		driver.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		
		Song.playNext(driver);
		
		String current = driver.getCurrentUrl();
        String expected = "https://www.youtube.com/watch?v=yPYZpwSpKmA";
        
        Assert.assertEquals(current, expected);
		
	}
	

}
