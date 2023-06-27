package day7June2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo3 {
  @Test(priority=1)
  public void reg() {
	  System.out.println("successfully registered...");
	  Assert.fail("Intentionally falling:REG");
  }
  @Test(priority=2, dependsOnMethods= {"reg"})
  public void login() {
	  System.out.println("user is successfully login");
	  Assert.fail("Intentionally failing:Login");
  
  }
  @Test(priority=3, dependsOnMethods= {"login","reg"})
  public void logout() {
	  System.out.println("user is successfully logout");
	  Assert.fail("Intentionally failing:Logout");
  
  }
  
}
