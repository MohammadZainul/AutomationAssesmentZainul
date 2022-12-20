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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Object Repository/ColorNote/Search Word/Search 1 word/Search Button'), 0)

Mobile.setText(findTestObject('Object Repository/ColorNote/Search Word/Search 1 word/Search Text'), 'Test', 0)

Mobile.tap(findTestObject('ColorNote/Edit Note/Edit Text Note/Search Result'), 0)

//Mobile.tap(findTestObject('Object Repository/ColorNote/Edit Note/Edit Text Note/Note Menu'), 0)
//Mobile.tap(findTestObject('Object Repository/ColorNote/Edit Note/Edit Text Note/TextView - Note'), 0)
Mobile.tap(findTestObject('Object Repository/ColorNote/Edit Note/Edit Text Note/EditButton'), 0)

Mobile.setText(findTestObject('ColorNote/Edit Note/Revert Edit/Edit Text Area'), 'Test Edit Abc', 0)

Mobile.tap(findTestObject('ColorNote/Edit Note/Revert Edit/More Button'), 0)

Mobile.tap(findTestObject('ColorNote/Edit Note/Revert Edit/Revert button'), 0)

Mobile.tap(findTestObject('ColorNote/Edit Note/Revert Edit/android.widget.Button - OK'), 0)

Mobile.closeApplication()

