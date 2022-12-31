package d;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPageActiPOM;
import com.actiTime.pom.TaskPage;

public class TestMethodActiLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void ValidLoginActi() throws InterruptedException {
   

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/");
		LoginPageActiPOM l=new LoginPageActiPOM(driver);
	//l.setLogin("admin1", "manager1");  
	Thread.sleep(3000);
	 l.setLogin("admin", "manager");
	 Thread.sleep(3000);
	 HomePage h=new HomePage(driver);
	 h.setTask();
	 Thread.sleep(2000);
	 TaskPage t= new TaskPage (driver);
	 t.setAddNEW();
	 Thread.sleep(2000);
	 t.setNewProject(driver);
	 
	 Thread.sleep(2000);
	// t.setCreateProject();
	 
	 h.setLogout();
	 
	 driver.close();


}
}
