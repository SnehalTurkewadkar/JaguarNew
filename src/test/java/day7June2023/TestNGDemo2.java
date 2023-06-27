package day7June2023;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo2 {
  @Test(priority=2)
  public void  timepass() {
	  System.out.println("User has lot of time, killing time");
  }
  @Test (priority=-1)
  public void reg() {
	  System.out.println("user registered");
  }
  @Test(priority=0)
  public void Login() {
	  System.out.println("user is successfully login");
	  throw new SkipException("intentionally skiping a test script1");
  }
  @Test (priority=2)
  public void Logout() {
	  System.out.println("user is successfully logout");
	  throw new SkipException("intentionally skiping a test script2");
  }
}
