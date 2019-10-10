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

WebUI.callTestCase(findTestCase('Login and Logout - Notifications/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/a_S10'))

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Guidelines'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=5e861b2e-476e-47a7-8da6-1f8eaac0545d&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Agency Briefs'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=0ad5caeb-cdde-46cb-a9dd-7bb8735ec59c&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_PVI assets'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=4bafa835-d8d1-4004-8e9e-0ff0b92e7079&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Product specifications'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?TagsID=8c18aa0f-a509-43b8-9830-0e5ff51e26de&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Dot com'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=bc05e939-0b63-6606-a1c7-39e942e52731&MediaChannelText=Samsung.com&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Members'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=148bbef1-bee6-3420-4504-39e942e6eacc&MediaChannelText=Members&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Customer support'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=fb8329fc-9545-1ceb-e72d-39e942e67719&MediaChannelText=%09Customer%20Care%20Services&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_eRetail'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=2e70a285-f254-76e1-b316-39e942e56d30&MediaChannelText=eRetail&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Retail marketing'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=5e98f30f-0197-d02e-ff7c-39e942e93d93&MediaChannelText=Retail%20Marketing&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Digital media'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=fd3717a5-4374-4940-3df3-39e942e5ea44&MediaChannelText=Digital%20Media&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_CDM'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=e66cdcea-6007-2467-35e9-39e942e6aae3&MediaChannelText=CDM&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Social'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=8aa42629-2b35-f82d-6471-39e942e63134&MediaChannelText=Social&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_TVC'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=faad2f4d-3e9b-e423-0e58-39e942e7549f&MediaChannelText=TVC&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_OOH'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=9646ec57-a493-cca4-29f4-39e942e908d2&MediaChannelText=Outdoor&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Print'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=5e85e800-fd9e-e834-1d6b-39e942e7fb57&MediaChannelText=Print&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_PR'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=aee045f8-766b-ac5b-c1e6-39e942e8307b&MediaChannelText=PR&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Events'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=d92b26b7-8819-05b5-3c42-39e942e868a3&MediaChannelText=Events&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

WebUI.navigateToUrl('https://samsung-adzu4-staging.codeworldwide.com/#page/GB/en-GB/AllDevices/S10')

WebUI.scrollToElement(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/h1_Available Adaptations'), 
    0)

WebUI.click(findTestObject('Home Page/Homa Page Tiles/Campaigns/Page_Samsung Marketing Cloud/a_Partnerships'))

WebUI.delay(1)

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://samsung-adzu4-staging.codeworldwide.com/#page/Assets?MediaChannelId=81245dbf-22f9-2849-1b99-39e942e97661&MediaChannelText=Partnerships&CampaignID=51a8da8e-2afa-4c47-ae26-e14f01ff5e7c&CampaignText=S10%20Test%20Campaign', 
    false)

