package day5June2023;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotDemo2 {

		static WebDriver driver;

		public static void main(String[] args) throws IOException {
			 driver=new ChromeDriver();
			String url="https://www.letskodeit.com/practice";
			driver.get(url);
			driver.manage().window().maximize();
			captureScreenShot();
			driver.quit();

		}

		private static void captureScreenShot() throws IOException {
			Screenshot screenShot = 
					new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			ImageIO.write(screenShot.getImage(), "png", new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ScreenshotPkg\\error.png"));
			driver.quit();
			
		}

	


	}


