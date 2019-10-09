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

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Featured Content/div_Apps and services'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=5075ceaf-edd9-4a3a-9f3f-da02a2811a8b&TagsID=42b30424-09d5-4c8e-b4a0-3c8ea22522da', 
    false)

