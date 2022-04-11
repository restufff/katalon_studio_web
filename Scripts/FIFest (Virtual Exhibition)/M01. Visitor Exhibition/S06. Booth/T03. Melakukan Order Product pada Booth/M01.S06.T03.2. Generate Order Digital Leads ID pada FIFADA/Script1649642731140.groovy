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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.util.KeywordUtil

WebUI.comment("TEST SCENARIO $GlobalVariable.tcName")

'Call custom keyword to verify wich element is clicking'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

'Visit web FIFADA Backend and maximize it'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://fifada-qa-lb01.fifgroup.co.id/backend/')

WebUI.maximizeWindow()

'Login Into FIFADA'
WebUI.setText(findTestObject('Object Repository/FIFADA_Backend/inputText_Username_FIFADA'), GlobalVariable.username_FIFADA)

WebUI.setEncryptedText(findTestObject('Object Repository/FIFADA_Backend/inputText_Password_FIFADA'), GlobalVariable.password_FIFADA)

WebUI.click(findTestObject('Object Repository/FIFADA_Backend/btn_login_FIFADA'))

WebUI.comment('This is validate order from booth Spektra')

'Visit tab Spektra-Interest'
WebUI.click(findTestObject('Object Repository/FIFADA_Backend/btn_Spektra_FIFADA'))

WebUI.click(findTestObject('Object Repository/FIFADA_Backend/btn_spektra-interest_FIFADA'))

eleWidht = WebUI.getElementWidth(findTestObject('FIFADA_Backend/slider'))

TestObject slider = findTestObject('Object Repository/FIFADA_Backend/slider')

WebUI.waitForElementClickable(slider, 10)

WebUI.dragAndDropToObject(findTestObject('Object Repository/FIFADA_Backend/slider'), findTestObject('Object Repository/FIFADA_Backend/btn_Interest'))

WebUI.click(findTestObject('Object Repository/FIFADA_Backend/btn_Interest'))

WebUI.verifyElementPresent(findTestObject('FIFADA_Backend/form_spektra_FIFDA'), 5)

WebUI.waitForElementClickable(findTestObject('FIFADA_Backend/option_Interest_FIFADA'), 3)

WebUI.selectOptionByLabel(findTestObject('FIFADA_Backend/option_Interest_FIFADA'), 'Yes', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/FIFADA_Backend/btn_Cancel_FIFADA'), 2)

WebUI.click(findTestObject('Object Repository/FIFADA_Backend/btn_Save_FIFADA'))

WebUI.switchToDefaultContent()

def rowIndex = 1
def trackingNumber = WebUI.getText(findTestObject('Object Repository/FIFADA_Backend/table_data', ['rowIndex' : rowIndex]))

'Spektra Interest Data'
KeywordUtil.logInfo(trackingNumber)
