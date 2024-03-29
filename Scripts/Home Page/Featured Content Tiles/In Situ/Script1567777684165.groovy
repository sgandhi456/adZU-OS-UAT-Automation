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

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Featured Content/h3_Featured Content'), 0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Featured Content/div_In Situ'))

url = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=3e2987b7-0ebc-4c12-a09c-ba5960d14ecf', 
    false)

