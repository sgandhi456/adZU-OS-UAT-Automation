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

WebUI.callTestCase(findTestCase('Login and Logout - Notifications/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Assets/Open Assets Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Assets/Search Assets/Page_Samsung Marketing Cloud/filter_icon'))

WebUI.setText(findTestObject('Assets/Search Assets/Page_Samsung Marketing Cloud/Text_SearchText'), search_text)

span_obj = WebUI.modifyObjectProperty(findTestObject('Assets/Search Assets/Page_Samsung Marketing Cloud/span_asset'), 'text', 
    'equals', search_text, false)

WebUI.click(span_obj)

WebUI.click(findTestObject('Object Repository/Assets/Search Assets/Page_Samsung Marketing Cloud/button_Hide'))

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Add Asset/Page-Samsung Marketing Cloud/div_Gallery_switcher-box sw-gallery'))

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Action_Menu/Action_Menu'))

WebUI.click(findTestObject('Assets/Download Asset/a_Download'))

