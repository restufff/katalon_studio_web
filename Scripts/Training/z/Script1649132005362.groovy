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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import groovy.transform.ThreadInterrupt
import internal.GlobalVariable
import newPackage.DragAndDropKeywords
import java.awt.Robot
import java.awt.event.InputEvent
import java.lang.Thread
import com.kms.katalon.core.util.KeywordUtil

import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData


WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

WebUI.openBrowser('')

WebUI.maximizeWindow()
WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://www.google.com/')



WebUI.mouseOver(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))
bot.mousePress(InputEvent.BUTTON1_MASK)
bot.mouseMove(600, 0)
bot.mouseRelease(InputEvent.BUTTON1_MASK)
Robot bot = new Robot()

//bot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
//bot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
//Thread.sleep(5000);


//WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 600,     0)
//WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
//WebUI.refresh()
//WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), -600,	0)

WebUI.closeBrowser()

