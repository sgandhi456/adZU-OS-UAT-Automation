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

WebUI.callTestCase(findTestCase('Login and Logout - Notifications/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Logout/Page_Samsung Marketing Cloud/span_gandhi'))

WebUI.click(findTestObject('Globalization/German/a_Globalisation Info'))

WebUI.click(findTestObject('Globalization/Page_Samsung Marketing Cloud/Culture _Dropdown'))

WebUI.delay(1)

WebUI.setText(findTestObject('Globalization/Page_Samsung Marketing Cloud/Culture_ddText'), 'English')

WebUI.click(findTestObject('Globalization/Page_Samsung Marketing Cloud/div_English (United Kingdom)'))

WebUI.click(findTestObject('Globalization/Page_Samsung Marketing Cloud/Page_Base/button_Save'))

