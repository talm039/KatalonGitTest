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

WebUI.openBrowser('https://cg-uat.stage-rc.com/login')

WebUI.click(findTestObject('Object Repository/Login/Page_Credit Guard Console/label_'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Credit Guard Console/input_ _username'), 'strong@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Credit Guard Console/input_ _password'), 'tWxl1kWNWe6g2z1zeHH2cc2yO57Yqd1i')

WebUI.setText(findTestObject('Object Repository/Login/Page_Credit Guard Console/input__additionalIdentifier'), '1234')

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_Credit Guard Console/input__additionalIdentifier'), Keys.chord(
        Keys.ENTER))

