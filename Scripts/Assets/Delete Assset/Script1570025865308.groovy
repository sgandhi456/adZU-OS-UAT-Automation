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

//WebUI.callTestCase(findTestCase('Login and Logout - Notifications/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Assets/Open Assets Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Assets/Search Asset'), [('spn_obj') : '', ('search_text') : 'update asset'], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

WebUI.click(findTestObject('Assets/Action_Menu/Action_Menu'))

WebUI.click(findTestObject('Assets/Delete Asset/Page_Samsung Marketing Cloud/a_Edit'))

WebUI.click(findTestObject('Assets/Delete Asset/Page_Samsung Marketing Cloud/button_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Delete Asset/Page_Samsung Marketing Cloud/button_Yes'))

WebUI.delay(1)

