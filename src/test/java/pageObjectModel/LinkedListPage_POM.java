package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;
//import utils.utility;
public class LinkedListPage_POM {
	
	public static WebDriver driver = BaseClass.getdriver();
    String link_lt = Configreader.linklist_getstarted();
	String tryEditorURL = Configreader.tryEditorURL();
	String linklist_ds=Configreader.linklist_getstarted();
	String linklist_intro=Configreader.linklist_int();
	//Utility util =new Utility();
	
	// Homepage Web Elements 
	@FindBy(xpath="//div[3][@class='col']//a") WebElement getstart_linkedlist;
	// LinkedListPage Web Elements
	@FindBy(xpath ="//ul[1]/a[@class='list-group-item']") WebElement introductionLink;
//	@FindBy(xpath = "//a[@href='introduction']") 	WebElement introductionLink;
	@FindBy(xpath = "//a[@href='creating-linked-list']") WebElement creatinglinkedlistLink;
	@FindBy(xpath = "//a[@href='types-of-linked-list']") 	WebElement typesOfLinkedList;
	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']") 	WebElement implementLLInPythonLink;
	@FindBy(xpath = "//a[@href='traversal']")	WebElement traversalLink;
	@FindBy(xpath = "//a[@href='insertion-in-linked-list']") WebElement insertionLink;
	@FindBy(xpath = "//a[@href='deletion-in-linked-list']")	WebElement deletionLink;
	@FindBy(xpath = "//a[@href='/linked-list/practice']") WebElement practiceQuestionLink;
    @FindBy(xpath = "//a[@href='/tryEditor']") 	WebElement tryHereLink;
	
	@FindBy(xpath = "//*[@id='answer_form']/button") WebElement run_button;
	@FindBy(xpath="//form/div/div/div/textarea") WebElement textarea_element;
	@FindBy(id = "output")	WebElement output;

	public LinkedListPage_POM() {
		PageFactory.initElements(driver, this);
	}

//	public void dropdown_linkedlist() {
//		LoggerLoad.info("----------------------------Click" + drop_down.getText() + "on drop down----------------------------------------");
//		drop_down.click();
//		LoggerLoad.info("Click" + dropdown_linkedlist.getText() + " From the drop down");
//		dropdown_linkedlist.click();
//	}
//	public String getpagetitle_linkedlist() {
//		String title = driver.getTitle();
//		return title;
//	}
//  
	
	public void getstarted_button_linkedlist()
	{
		getstart_linkedlist.click();
		//driver.get(link_lt);
	}
	
	public void ll_ds()
	{
		driver.get(linklist_ds);
	}
	public void Clickon_introductionLink() {
		LoggerLoad.warn("***************************Introduction link**********************************************");
//		LoggerLoad.info("Click On " + introductionLink.getText() + "On Linked List Page");
//		introductionLink.click();
//		LoggerLoad.info("Title of the Page" + driver.getTitle());
         driver.get(linklist_intro);
		
	}

	public void TryHereLink(String Btname,String DsName) {
		tryHereLink.click();
		LoggerLoad.info("User Clicked on" + Btname+ " Button" + DsName );
	}

//	public void Enter_PythonCode(String pythonCode)throws InterruptedException {
//		editorInput.sendKeys(pythonCode);
//	}

	public void Clickon_runButton() {
		
		run_button.click();
		LoggerLoad.info("User Clicked on Run button");

	}

	public String click_textarea(String str)
	{
		 textarea_element.sendKeys(str);
		return str;
	}
	
	
	public String capture_alert() throws InterruptedException
	{
		Thread.sleep(1000);
		String gt_text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		LoggerLoad.warn("--------------ERROR MESSAGE FROM ALERT-------------"+gt_text);
		return gt_text;
		
	}
	
	
	
	
	public void navigateTotryEditor() {
		driver.get(tryEditorURL);
		LoggerLoad.info("-----------------------------------User is in editor page-----------------------------------");
		
	}
	public void navigateTo(String pagename) {
	//	String urlName = Configreader.geturl(pagename);
	//	driver.get(urlName);
		
	}
	public void Clickon_creatinglinkedlistLink() {
		LoggerLoad.info("Click" + creatinglinkedlistLink.getText() + "On Linked List Page");
		creatinglinkedlistLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());

	}

	public void Clickon_typesOfLinkedLink() {
		LoggerLoad.info("Click" + typesOfLinkedList.getText() + "On Linked List Page");
		typesOfLinkedList.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());

	}

	public void Clickon_implementLLInPythonLink() {
		LoggerLoad.info("Click" + implementLLInPythonLink.getText() + "On Linked List Page");
		implementLLInPythonLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());
	}
	public void Clickon_Traversal() {
		LoggerLoad.info("Click" +traversalLink.getText() + "On Linked List Page");
		 traversalLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());
	}
	public void Clickon_Insertion() {
		LoggerLoad.info("Click" +insertionLink.getText() + "On Linked List Page");
		 insertionLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());
	}
	public void Clickon_Deletion() {
		LoggerLoad.info("Click" +deletionLink.getText() + "On Linked List Page");
		 deletionLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());
	}	
	public void Clickon_PracticeQuestion() {
		LoggerLoad.info("Click" +practiceQuestionLink.getText());
		practiceQuestionLink.click();
		LoggerLoad.info("Title of the Page" + driver.getTitle());
	}	

	public void display_result()
	{
		String res=output.getText();
		System.out.println("***********RESULT:"+res); 
		
	}

	



}




