package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test(enabled=true)
	public void highschool(){
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highschool")
	public void highersecondary(){
		System.out.println("highersecondary");
		
	}
	@Test(dependsOnMethods="highersecondary")
	public void engineering(){
		System.out.println("engineering");
		
	}
}
