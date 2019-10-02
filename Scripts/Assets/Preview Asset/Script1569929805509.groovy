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

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Samsung Marketing Cloud/Page-Samsung Marketing Cloud/div_Gallery_switcher-box sw-gallery'))

WebUI.delay(1)

WebUI.click(findTestObject('Assets/Action_Menu/Action_Menu'))

WebUI.click(findTestObject('Assets/Preview Asset/Page_Samsung Marketing Cloud/a_Preview'))

WebUI.delay(1)

CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot'('C:\\Adzu\\Screenshot\\Preview Asset\\Asset_actual.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched'('C:\\Adzu\\Screenshot\\Preview Asset\\Asset_expected.png', 
    'C:\\Adzu\\Screenshot\\Preview Asset\\Asset_actual.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Assets/Preview Asset/Page_Samsung Marketing Cloud/Exit_Preview'))

