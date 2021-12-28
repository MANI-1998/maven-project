package com.pom_mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mini_Pom {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	
	@FindBy(xpath = "//h1[text()='Authentication']")
	private WebElement scroll_1;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement login;
	
	@FindBy(xpath ="(//a[@title='T-shirts'])[2]" )
	private WebElement tshirt;
	
	@FindBy(xpath = "//a[text()='Casual']")
	private WebElement centre_page;
	
	@FindBy(xpath ="//img[@title='Faded Short Sleeve T-shirts']" )
	private WebElement qv;
	
	@FindBy(xpath ="//iframe[@class='fancybox-iframe']" )
	private WebElement frame_1;
	
	@FindBy(name = "qty")
	private WebElement c1;
	
	@FindBy(name = "qty")
	private WebElement quantity;
	
	@FindBy(name = "group_1")
	private WebElement size;
	
	@FindBy(xpath = "//a[@title='Blue']")
	private WebElement colour;
	
	@FindBy(name = "Submit" )
	private WebElement sub;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	private WebElement ptc;
	
	@FindBy(xpath ="//td[text()='Total products']" )
	private WebElement summary_page;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement pc1;
	
	@FindBy(xpath = "//label[contains(text(),'as the')]")
	private WebElement address_page;
	
	@FindBy(name = "processAddress")
	private WebElement pc2;
	
	@FindBy(xpath = "//h1[text()='Shipping']")
	private WebElement shipping_page;
	
	@FindBy(name = "cgv")
    private WebElement pc3;
	
	@FindBy(name = "processCarrier")
    private WebElement pc4;
	
	@FindBy(xpath ="//li[@class='step_current last']" )
	private WebElement payment_page;
	
	@FindBy (xpath = "//a[@class='cheque']")
	private WebElement pc5;
	
	@FindBy(xpath = "//h1[text()='Order summary']")
	private WebElement check_payment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement pc6;
	
	@FindBy(xpath = "//h1[text()='Order confirmation']")
	private WebElement order_confirm;
	
	public WebElement getPtc() {
		return ptc;
	}

	public WebElement getSummary_page() {
		return summary_page;
	}

	public WebElement getPc1() {
		return pc1;
	}

	public WebElement getAddress_page() {
		return address_page;
	}

	public WebElement getPc2() {
		return pc2;
	}

	public WebElement getShipping_page() {
		return shipping_page;
	}

	public WebElement getPc3() {
		return pc3;
	}

	public WebElement getPc4() {
		return pc4;
	}

	public WebElement getPayment_page() {
		return payment_page;
	}

	public WebElement getPc5() {
		return pc5;
	}

	public WebElement getCheck_payment() {
		return check_payment;
	}

	public WebElement getPc6() {
		return pc6;
	}

	public WebElement getOrder_confirm() {
		return order_confirm;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getCentre_page() {
		return centre_page;
	}

	public WebElement getQv() {
		return qv;
	}

	public WebElement getFrame_1() {
		return frame_1;
	}

	public WebElement getC1() {
		return c1;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getSub() {
		return sub;
	}

	
	public Mini_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getScroll_1() {
		return scroll_1;
	}

	
}
