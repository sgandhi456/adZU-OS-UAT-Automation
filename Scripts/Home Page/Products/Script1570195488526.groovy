import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper


WebUI.scrollToElement(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/h3_Product Categories'), 0)

WebUI.click(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/li_Mobile'))

//IE Code
/*WebDriver driver = DriverFactory.getWebDriver()
Actions action = new Actions(driver)
WebElement sourceElement = WebUiCommonHelper.findWebElement(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/span_Mobile'), 20)
WebElement destElement = WebUiCommonHelper.findWebElement(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/a_Tablet'), 20)

action.moveToElement(sourceElement)
WebUI.delay(1)
action.click(destElement).release().build().perform()*/



WebUI.mouseOver(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/span_Mobile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Home Page/Products/Page_Samsung Marketing Cloud/a_Tablet'), FailureHandling.CONTINUE_ON_FAILURE)

url = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?ProductId=3c94d341-7b69-f55b-d7b1-39e99ee8a4a8&ProductText=Tablet', 
    false)

