package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import utils.Configreader;
import utils.LoggerLoad;
import utils.Utility;

public class ArrayPage_POM {
	public static WebDriver driver =BaseClass.getdriver();
	String url =Configreader.applicationUrl();
	String homePageurl=Configreader.homePage();
	String arrayPageurl =Configreader.arrayPageURL();
	String arrayinphython =Configreader.ArraysinPythonpageurl();
	String arrayinphythontryEditor =Configreader.tryEditorURL();
	String arraylistpage =Configreader.arraylisturl();
	String arraybasicoperationpage =Configreader.arraybasicoperationutl();
	String arrayaplicationspage =Configreader.arrayapplicationurl();
	String arraypracticepage =Configreader.arraypracticepageurl();
	String arryauestionpage =Configreader.arrayquestionurl();
	String QuestionFindNumberswithEvenNumberofDigits =Configreader.QuestionFindNumberswithEvenNumberofDigitsurl();
	String QuestionSquaresofaSortedArrayurlpage =Configreader.QuestionSquaresofaSortedArrayurl();
	Utility util= new Utility();
	
//	@FindBy(xpath= "//a[@href='/login']")WebElement signin;
//	@FindBy (xpath="//input[@id='id_username']")WebElement Username ;
//	@FindBy (xpath="//input[@id='id_password']")WebElement password ;
//	@FindBy (xpath="//input[@value='Login']") WebElement login;
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//*[@id=\"content\"]/li[2]/a")WebElement arraysUsingListLink;
	@FindBy (xpath="//a[text()='Basic Operations in Lists']") WebElement basicOperationsInListsLink;
	@FindBy (xpath="//a[@href='applications-of-array']") WebElement applicationsOfArrayLink;
	@FindBy (xpath="//a[text()='Practice Questions']") WebElement practiceQuestionsLink;
	@FindBy (xpath="//a[text()='Search the array']") WebElement searchTheArrayLink;
	@FindBy (xpath="//a[text()='Max Consecutive Ones']")WebElement maxConsecutiveOnesLink;
	@FindBy (xpath="//a[text()='Find Numbers with Even Number of Digits']") WebElement findNumbersWithEvenNumberOfDigitsLink;
	@FindBy (xpath="//a[text()='Squares of  a Sorted Array']") WebElement squaresOfASortedArrayLink;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement submitbtnmessage;
	
	@FindBy (xpath = "//a[@href ='array']")WebElement getStartedarray;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryHereLink;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//button[text()='Run']") WebElement runButton;
	@FindBy (xpath="//pre[@id='output']") WebElement output;
	@FindBy (id="answer_form") WebElement answerform;
	@FindBy (xpath="//input[@value='Submit']") WebElement submitButton;
	
	
	public   ArrayPage_POM () {
		PageFactory.initElements(driver,this);
	}
	
	public void homepage() {
		driver.get(homePageurl);
	}
	
	
//	public void SigninPageUrl() {
//		driver.get(signinurl);
//	}

//	public void signinclick() {
//		signin.click();
//	}
//	public void enterUserName(String username) {
//		Username.click();
//		Username.clear();
//		Username.sendKeys(username);
//	}
//
//	public void enterPassword(String pwd) {
//		password.click();
//		password.clear();
//		password.sendKeys(pwd);
//	}
//	public void loginbtn(){
//		login.click();
//		LoggerLoad.info("user enter valid username and password pom ds");
//	}
	
	public void arraypage() {
		driver.get(arrayPageurl);		
	}
	
	public void arrayphythonpage() {
		driver.get(arrayinphython);		
	}
	
	public void arrayphythonpagetry() {
		driver.get(arrayinphythontryEditor);		
	}
	
	public void arrayinlist() {
		driver.get(arraylistpage);		
	}
	
	public void arrayinbasicoperation() {
		driver.get(arraybasicoperationpage);		
	}
	public void arrayinapplication() {
		driver.get(arrayaplicationspage);		
	}
	public void arrayinpracticepage() {
		driver.get(arraypracticepage);		
	}
	
	public void arrayinquestionpage() {
		driver.get(arryauestionpage);		
	}
	public void arrayinQuestionFindNumberswithEvenNumberofDigits() {
		driver.get(QuestionFindNumberswithEvenNumberofDigits);		
	}
	public void arrayinQuestionSquaresofaSortedArrayurlpage() {
		driver.get(QuestionFindNumberswithEvenNumberofDigits);		
	}
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForSubmit() {
		waitForElement(submitbtnmessage);
	}
		
	
	public void  navigateTo(String pagename)
	{
		String urlName= Configreader.geturl(pagename);
		driver.get(urlName);
	}

	
	public void clickArraysInPythonLink()
	{
		LoggerLoad.info("User clicks on " +arraysInPythonLink.getText() + " in Array Page");
		arraysInPythonLink.click();
	}
	
	public void clickTryHereLink() {
		tryHereLink.click();
	}
	
	public void fetchPythonCode(String PythonCode)
	{

		editorInput.sendKeys(PythonCode);
	}
	
	public void fetchPythonCode2(String PythonCode)
	{
		editorInput.clear();
		editorInput.sendKeys(PythonCode);
	}
	
	public void clickRunButton() {			
			runButton.click();
	}
	
	public String fetchOutput()
	{
		
		String Result = output.getText();
		return Result;
	}
	
public String alertarray() {
	    
		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Get the text of the alert
		String alertText = alert.getText();

		// Accept or dismiss the alert
		alert.accept(); // To accept the alert
		// alert.dismiss(); // To dismiss the alert
	    LoggerLoad.warn("checking alert message from tryeditor array "+ alertText );
	    return alertText;
}

public String alertarraylist() {
    
	// Wait for the alert to appear
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	// Get the text of the alert
	String alertText = alert.getText();

	// Accept or dismiss the alert
	alert.accept(); // To accept the alert
	// alert.dismiss(); // To dismiss the alert
    LoggerLoad.warn("checking alert message from tryeditor array "+ alertText );
    return alertText;
}

	public void clickArraysUsingListLink()
	{
		arraysUsingListLink.click();
	}
	
	public void clickbasicOperationsInListsLink()
	{
		basicOperationsInListsLink.click();
		
	}
	
	public String getarraybasicpage() {
		String title1 = driver.getTitle();
		return title1;
	}
	
	public void clickapplicationsOfArrayLink()
	{
		applicationsOfArrayLink.click();
	}
	
	public void clickpracticeQuestionsLink()
	{
		practiceQuestionsLink.click();
		
	}
	
	public String title() {
		String titleofpage = driver.getTitle();
		return titleofpage;
	}
	public void clickSearchTheArrayLink()
	{
		searchTheArrayLink.click();
	}
	
	public String getEditorText() {
		return editorInput.getText();
	}
	public void clearEditorText() {
		editorInput.clear();
	}
	
	public void clickFindNumbersWithEvenNumberOfDigitsLink()
	{
		findNumbersWithEvenNumberOfDigitsLink.click();
	}
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public String submitOutput()	{		
		String Result = submitbtnmessage.getText();
		return Result;
	}
	public void clickSquaresOfASortedArrayLink()
	{
		squaresOfASortedArrayLink.click();
	}
	
	
	/*
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
	public void getStartedArrayButton() {
		
		getStartedarray.click();
		
	}
	public void clickTryHereLink(String buttonName, String dataStructureName) {
		
		tryHereLink.click();
	}
	
	public void fetchPythonCode(String PythonCode)
	{
		editorInput.sendKeys(PythonCode);
	}
	
	public void clickRunButton() {
		
		runButton.click();
	}
	
	public String fetchOutput()
	{
		util.waitForElement(output);
		String Result = output.getText();
		return Result;
	}
	
	public String fetchErrorMessage()
	{
		String errorMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMessage;
	}
	
	public void clickArraysUsingListLink()
	{
		arraysUsingListLink.click();
	}
	
	public void clickbasicOperationsInListsLink()
	{
		basicOperationsInListsLink.click();
		
	}
	
	public void clickapplicationsOfArrayLink()
	{
		applicationsOfArrayLink.click();
	}
	
	public void clickpracticeQuestionsLink()
	{
		practiceQuestionsLink.click();
		
	}
	
	public void clickSearchTheArrayLink()
	{
		searchTheArrayLink.click();
	}
	
	public void enterPracticeQuestions(String sheetname, int rownumber) throws InvalidFormatException, IOException
	{
		util.waitForElement(answerform);
		String code=Utility.getCodefromExcel(sheetname, rownumber);
		util.enterPythonCodeForPractice(code, editorInput);
		
	}
	public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
	{
		String expectedResult=util.getResultfromExcel(sheetName, rowNumber);
		return expectedResult;
	}
	public String getActualResult()
	{
		util.waitForElement(output);
		return output.getText();
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void clickMaxConsecutiveOnesLink()
	{
		maxConsecutiveOnesLink.click();
	}
	
	public void clickFindNumbersWithEvenNumberOfDigitsLink()
	{
		findNumbersWithEvenNumberOfDigitsLink.click();
	}
	
	public void clickSquaresOfASortedArrayLink()
	{
		squaresOfASortedArrayLink.click();
	}
	*/
}
