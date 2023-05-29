package testNgExamples;

import org.testng.annotations.Test;

public class SettingPriority {

	@Test(priority = 0)
	public void Start()
	{
		System.out.println("Start the Car");
	}
	@Test(priority = 1)
	public void FirstGear()
	{
		System.out.println("Put First Gear");
	}
	@Test(priority = 2)
	public void Move()
	{
		System.out.println("Release the clutch slowly");
	}
	@Test(priority = 3)
	public void Stop()
	{
		System.out.println("Stop the car");
	}
}
