package newSauce;

import org.testng.annotations.Test;

public class SearchTestcase {
	@Test(groups= {"smoke"},priority=1,enabled=false)
	void searchById()
	{
		System.out.println("ID");
	}
	
	
	@Test(groups= {"functional"},priority=2)
	void searchByName()
	{
		System.out.println("Name");
	}

	@Test
	void searchByImage()
	{
		System.out.println("IMage");
	}
}
