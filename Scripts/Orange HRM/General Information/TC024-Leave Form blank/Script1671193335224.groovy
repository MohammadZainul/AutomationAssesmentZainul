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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Orange HRM/Common/Edit General Information'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Organization Name_oxd-input'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Registration Number'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Tax ID'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Phone_oxd-input oxd-input--focus'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Fax'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Email'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Address Street 1'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_Address Street 2'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_City'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_StateProvince'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/input_ZipPostal Code'))

CustomKeywords.'commonUtils.clearElementText'(findTestObject('Orange HRM/General Information/textarea_Notes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Orange HRM/General Information/span_Required'))

WebUI.closeBrowser()

