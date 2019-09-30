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

WebUI.deleteAllCookies()

WebUI.callTestCase(findTestCase('Login and Logout - Notifications/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/a_Assets'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_Gallery_switcher-box sw-gallery'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_ActionDropdown'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/a_Preview'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/i_Back'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_ActionDropdown'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/a_Download'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_ActionDropdown'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/a_Share'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/ul_selectuseremail'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_SearchingEmail'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_Kirithan Kandasamy  (kkirithanhotmailcom)'))

WebUI.click(findTestObject('Assets/Page-Samsung Marketing Cloud/Page-Samsung Marketing Cloud/a_Share'))

