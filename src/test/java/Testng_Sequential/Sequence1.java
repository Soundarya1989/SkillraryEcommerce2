package Testng_Sequential;

import org.testng.annotations.Test;

public class Sequence1 {
	@Test(groups="smoke")
	public void demo1() {
		System.out.println("hi demo1");
		
		
	}
	@Test
	public void demo2()
	{
		System.out.println("hi demo2");
	}

}
