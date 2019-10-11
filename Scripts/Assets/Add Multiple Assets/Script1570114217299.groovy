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

WebUI.click(findTestObject('Assets/Add Asset/button_Add Assets'))

WebUI.click(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/a_Multiple'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/a_Please Select'))

WebUI.click(findTestObject('Assets/Add Asset/div_Image (1)'))

WebUI.delay(1)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('Assets/Upload Assets/Upload_Asset_Image'), 
    'C:\\Adzu\\Asset\\sam.jpeg')

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/a_Please Select Asset Group'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/div_Code assets'), 0)

WebUI.click(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/div_Code assets'))

WebUI.delay(1)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('Assets/Upload Assets/Import Spreadsheet'), 
    'C:\\Adzu\\Asset\\Kiritest1.xlsx')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/h4_Success'), 'Success!')

WebUI.click(findTestObject('Assets/Add Multiple Assets/Page_Samsung Marketing Cloud/button_Ok'))

