package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;
    
    public ElementsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
        this.actions = new Actions(driver);
    }

    public void userIsOnTextBoxPage() {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 300);
    }

    public void writeFullNameAs(String fullName) {
        By fullName_ = By.xpath("//input[@id='userName']");
        elementHelper.sendKey(fullName_,fullName);
    }

    public void writeEmailAs(String email) {
        By email_ = By.xpath("//input[@id='userEmail']");
        elementHelper.sendKey(email_, email);

    }

    public void writeCurrentAddressAs(String currentAddress) {
        By currentAddress_ = By.xpath("//textarea[@id='currentAddress']");
        elementHelper.sendKey(currentAddress_, currentAddress);
    }

    public void writePermanentAddressAs(String permanentAddress) {
        By permanentAddress_ = By.xpath("//textarea[@id='permanentAddress']");
        elementHelper.sendKey(permanentAddress_, permanentAddress);
    }

    public void clickToSubmitButton() {
        elementHelper.scrollByAmount(driver, 200);
        By submit = By.xpath("//button[@id='submit']");
        elementHelper.click(submit);
    }

    public void clickToElementsButton() {
        elementHelper.sleep(3000);
        elementHelper.scrollByAmount(driver, 200);
        By elements = By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]");
        elementHelper.click(elements);
    }

    public void clickToTextBoxButton() {
        By textBox = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
        elementHelper.click(textBox);
    }

    public void checkThatAUserRecordNamedHasBeenCreated(String name) {
        By element = By.xpath("//p[@id='name']");
        elementHelper.testWebElementText(element, name);
    }

    public void userIsOnCheckBoxPage() {
        By checkBoxMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
        elementHelper.click(checkBoxMenu);
    }

    public void clickToHomeCheckBox() {
        By homeCheckBox = By.xpath("//span[@class='rct-checkbox']//*[name()='svg']");
        elementHelper.click(homeCheckBox);
    }

    public void expectedMessage(String expected) {
        By checkBoxClickResult = By.xpath("//span[normalize-space()='You have selected :']");
        elementHelper.testWebElementText(checkBoxClickResult,expected);
    }

    public void userIsOnRadioButtonMenu() {
        By radioButtonMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.click(radioButtonMenu);
    }

    public void clickToYesRadioButton() {
        By radioButtonClick = By.xpath("//label[@for='yesRadio']");
        elementHelper.click(radioButtonClick);
    }

    public void checkThatTheMessageYouHaveSelectedYesAppearsOnTheScreen() {
        By expectedMessage = By.xpath("//p[@class='mt-3']");
        elementHelper.testWebElementText(expectedMessage, "You have selected Yes");
    }

    public void userIsOnWebTablesMenu() {
        By webTablesMenu = By.xpath("//span[normalize-space()='Web Tables']");
        elementHelper.click(webTablesMenu);
    }

    public void clickToAddButton() {
        By addUser = By.xpath("//button[@id='addNewRecordButton']");
        elementHelper.click(addUser);
    }

    public void checkThatTheRegistrationFormIsOpened() {
        elementHelper.sleep(2000);
        By registrationForm = By.xpath("//div[@id='registration-form-modal']");
        elementHelper.testWebElementText(registrationForm, "Registration Form");
    }

    public void writeFirstNameAs(String name) {
        By firstName = By.xpath("//input[@id='firstName']");
        elementHelper.sendKey(firstName, name);
    }

    public void writeSecondNameAs(String secondName) {
        By secondName_ = By.xpath("//input[@id='lastName']");
        elementHelper.sendKey(secondName_, secondName);
    }

    public void writeUserEmailAs(String email) {
        By email_ = By.xpath("//input[@id='userEmail']");
        elementHelper.sendKey(email_, email);
    }

    public void writeAgeAs(String age) {
        By age_ = By.xpath("//input[@id='age']");
        elementHelper.sendKey(age_, age);
    }

    public void writeSalaryAs(String salary) {
        By salary_ = By.xpath("//input[@id='salary']");
        elementHelper.sendKey(salary_, salary);

    }

    public void writeDepartmentAs(String department) {
        By department_ = By.xpath("//input[@id='department']");
        elementHelper.sendKey(department_, department);
    }

    public void clickRegistrationFormSubmitButton() {
        By submit = By.xpath("//button[@id='submit']");
        elementHelper.click(submit);
    }

    public void checkUser(String user) {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 400);
        By search = By.xpath("//input[@id='searchBox']");
        elementHelper.sendKey(search, user);
        By expectedUser = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
        elementHelper.testWebElementText(expectedUser, user);
    }

    public void search(String name) {

    }

    public void clickToEditButton() {
    }

    public void updateEmailAs(String email) {
    }

    public void searchFromList(String name) {
    }

    public void checkIfYourEmailIsUpdated() {
    }

    public void clickToDeleteButton() {
    }

    public void listMustBeEmpty() {
    }
}
