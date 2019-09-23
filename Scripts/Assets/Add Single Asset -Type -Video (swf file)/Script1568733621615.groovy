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

WebUI.click(findTestObject('Assets/Page_Samsung Marketing Cloud/a_Assets'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Assets/Page_Samsung Marketing Cloud/button_Add Assets'))

WebUI.check(findTestObject('Assets/Page_Samsung Marketing Cloud/a_Single'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Assets/Page_Samsung Marketing Cloud/Dropdown arrow'))

WebUI.click(findTestObject('Assets/Video Asset/div_Video'))

WebUI.click(findTestObject('Assets/Video Asset/radiobutton_File_typeOfVideo'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Assets/Video Asset/Upload_Asset_Video'), 'C:\\Adzu\\Asset\\AssetSWF.swf')

WebUI.delay(2)

WebUI.click(findTestObject('Assets/Page_Samsung Marketing Cloud/AssetGroup_dd'))

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Video Asset/Page_Samsung Marketing Cloud/AssetGroup_2ndOption'))

WebUI.setText(findTestObject('Assets/Page_Samsung Marketing Cloud/input_Name_Asset_Name (1)'), 'VideoAsset_AutoTest2')

WebUI.click(findTestObject('Assets/Page_Samsung Marketing Cloud/button_Save'))

