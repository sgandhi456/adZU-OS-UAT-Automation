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

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/a_S10'))

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Guidelines'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=5e861b2e-476e-47a7-8da6-1f8eaac0545d&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

