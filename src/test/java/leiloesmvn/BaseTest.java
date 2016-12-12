package leiloesmvn;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected ChromeDriver driver;

	@After
	public void encerra() {
		driver.close();
	}

	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "/home/samuel/chromedriver");
		this.driver = new ChromeDriver();
		driver.get("http://localhost:8080/leiloesmvn/apenas-teste/limpa");
	}
}
