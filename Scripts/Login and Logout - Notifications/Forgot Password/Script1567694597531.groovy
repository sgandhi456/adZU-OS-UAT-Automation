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

WebUI.click(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/Forgot password'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/input_Enter your email address to receive a link to reset your password_email'), 
    'k.kirithan@hotmail.com')

WebUI.click(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/button_Reset'))

WebUI.click(findTestObject('Object Repository/Login/Page_Samsung Marketing Cloud/button_Ok'))

WebUI.closeBrowser()

