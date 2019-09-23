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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#')

WebUI.setText(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/Username_Text'), 'k.kirithan@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/Password_text'), 'hsPFm2cfhkw=')

WebUI.click(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/button_Login'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Login/Page_Samsung Marketing Cloud/div_Error                        Invalid username or password'), 
    'Error: Invalid username or password')

