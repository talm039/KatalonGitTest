import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/a_'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/label_ _switcher-indicator'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/label_'))

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input__businessNameHeb'), 'טלמזרחי')

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input_  _businessNameEng'), 'talmTest6')

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input_ _contactEmail'), 'asd@asd.com')

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input_ _contactPhoneNumber'), '1234569789')

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input_ _businessId'), '123456789')

WebUI.setText(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/input_ _customerNumber'), '00123456')

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/span_ _custom-control-indicator'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/span_'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/span__ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/span_httpscgconsolecreditguardcoildevconsole'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/button_'))

WebUI.click(findTestObject('Object Repository/NewMerchant/Page_Credit Guard Console/button__1'))

