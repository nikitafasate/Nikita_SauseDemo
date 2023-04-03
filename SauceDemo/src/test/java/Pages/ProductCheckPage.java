package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductCheckPage {
	WebDriver ldriver;
	
	  public  ProductCheckPage(WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}
	 
	  @FindBy(xpath=("//select[@class='product_sort_container']"))
	  WebElement Findproduct;
	  
	  @FindBy(xpath=("//a[@id='item_3_title_link']//div[@class='inventory_item_name']"))
	  WebElement selectproduct;
	  
	  @FindBy(xpath=("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"))
	  WebElement clickadd;
	  
	  @FindBy(xpath=("//a[@class='shopping_cart_link']"))
	  WebElement cartlist1clic;
	  
	  @FindBy(xpath=("//div[@class='cart_list']"))
	  WebElement cartlist1;
	 
	 
	//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']
	  
	  @FindBy(id=("checkout"))
	  WebElement checkout;
	
	  //no product add in add to cart
	  @FindBy(xpath=("//button[@id='remove-test.allthethings()-t-shirt-(red)']"))
	  WebElement remove;
	  
	
	  
	  
	  @FindBy(xpath=("//a[@class='shopping_cart_link']"))
	  WebElement Findproduct1;
	  
	  @FindBy(xpath=("//div[@class='cart_list']"))
	  WebElement cartlist;
	 
	 	  
	  @FindBy(id=("checkout"))
	  WebElement checkout1;
	 
	  
	//div[@class='cart_quantity']
	  
		  public  void selectFilter()
	    {
			  Select select = new Select(Findproduct);
				// select.selectByxpath("//option[@value='za']");
				       select.selectByValue("za"); 
	    }
		  public void selectproduct()
		  {
	       selectproduct.click();
		  }
		  public void clickadd()
		  {
			  System.out.println("inside click add");
			  clickadd.click();
			  
		  }
		  
		  public void cartlist1clic()
		  {
			  System.out.println("inside cart list 1");
			  cartlist1.click();
			  System.out.println("after -----------------inside cart list 1");
		  }
		  public void cartlist1()
		  {
			  System.out.println("inside cart list 1");
			  cartlist1.click();
			  System.out.println("after -----------------inside cart list 1");
		  }
		  
		 		  public void checkout() throws InterruptedException
		  {
		 			  Thread.sleep(2000);
			  checkout.click();
      }
//no product added in to cart
	 public void remove()
	 {
		 remove.click();
	 }
       public void Findproduct1()
       {
    	   Findproduct1.click();
       }

     public void cartlist()
    {
	cartlist.click();
    }
    
	  public void checkout1()
	  {
		  checkout1.click();
 }


}