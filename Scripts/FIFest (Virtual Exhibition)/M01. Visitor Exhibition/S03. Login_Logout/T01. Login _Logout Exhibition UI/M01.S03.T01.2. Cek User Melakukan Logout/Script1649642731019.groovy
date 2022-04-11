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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])
//WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//Case 1. Cek User Melakukan Login Kemudian Logout
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

WebUI.click(findTestObject('Page_Test exhibbition 2/btn_Next'))
WebUI.click(findTestObject('Page_Test exhibbition 2/btn_Kembali'))


while(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'),3,FailureHandling.CONTINUE_ON_FAILURE)==true) {
	WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
}
WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-1.png')

WebUI.click(findTestObject('Page_Lobby - Test exhibbition 2/btn_SoundOff'))

WebUI.click(findTestObject('Page_Lobby - Test exhibbition 2/btn_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/button_Exit'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-2.png')

WebUI.delay(5)

WebUI.closeBrowser()

