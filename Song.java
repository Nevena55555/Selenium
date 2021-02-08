package objectsYT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Song {
	
	public static final String URL = "https://www.youtube.com/results?search_query=Rick+Astley";
	private static final String SONG_XPATH = "//*[@id=\"video-title\"]/yt-formatted-string";
	private static final String NEXT_XPATH = "//*[@id=\"video-title\"]";
	
	public static void playSong(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SONG_XPATH));
		we.click();

	}
	
	public static void playNext(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(NEXT_XPATH));
		we.click();
		
	}

}
