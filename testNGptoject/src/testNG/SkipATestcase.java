package testNG;

import org.testng.annotations.Test;

public class SkipATestcase {

	@Test(priority=0)
	public void startThecar(){
		System.out.println("Start the car");
	}
	@Test(priority=5,enabled=false)
	public void turnonTheMusic(){
		System.out.println("Music Turned on");
	}
	@Test(priority=1)
	public void putFuirstGear(){
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear(){
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear(){
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear(){
		System.out.println("Fourth Geaer");
	}
	
}
