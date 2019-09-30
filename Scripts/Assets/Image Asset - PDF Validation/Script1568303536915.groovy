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

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/a_Assets'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/button_Add Assets'))

WebUI.check(findTestObject('Assets/Page-Samsung Marketing Cloud/a_Single'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Dropdown arrow'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/div_Image (1)'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Assets/Upload_Asset_Image'), 'C:\\Adzu\\Asset\\AssetPDF.pdf')

WebUI.verifyElementText(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/PDF_Validation_Error'), 
    'Please upload PDF as a document asset')

