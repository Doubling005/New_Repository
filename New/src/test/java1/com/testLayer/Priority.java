package com.testLayer;

import org.testng.annotations.Test;

public class Priority 
{

	
		  @Test(priority=1)
		  public void A()
		  {
			  System.out.println("hi success");
		  }
		  @Test(priority=2,invocationCount=2)
		  public void AB() 
		  {
			  System.out.println("hi 1 success");
		  }

		  @Test(priority=3)
		  public void B()
		  {
			  System.out.println("hi 3 success");
		  }
		  @Test(priority=4)
		  public void C() 
		  {
			  System.out.println("hi 4 success");
		  }
		  @Test(priority=1)
		  public void D() 
		  {
			  System.out.println("hi 5 success");
		  }

		}


