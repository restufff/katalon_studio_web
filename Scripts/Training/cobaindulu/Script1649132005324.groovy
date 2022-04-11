import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.googlecode.javacv.cpp.opencv_ml.CvSVMSolver.GetRow as GetRow
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.DragAndDropByOffsetKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.transform.ThreadInterrupt
import internal.GlobalVariable
import newPackage.DragAndDropKeywords
import java.awt.Robot
import java.awt.event.InputEvent
import java.lang.Thread
import com.kms.katalon.core.util.KeywordUtil

import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData


Robot bot = new Robot()
WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//test case 2.1
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

//test case 2.3
while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
}
WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
WebUI.delay(2)

while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 3, FailureHandling.CONTINUE_ON_FAILURE)==
	true) {
		WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'),-900,-100)
	//	WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
		
	}
WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/leftArrow'), 800,     0)
WebUI.mouseOver(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/divcenterLogo'))
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 500,     0)
WebUI.mouseOver(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/divcenterLogo'))
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 200,     0)
WebUI.mouseOver(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/divcenterLogo'))
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 200,     0)
WebUI.mouseOver(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/divcenterLogo'))
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 200,     0)
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/leftArrow'))
WebUI.delay(4)

WebUI.closeBrowser()

