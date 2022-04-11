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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Virtual Exhibition CMS/select_Test Exhibbition 2 - Jakarta 1Safari_5ca4cf'), 
    'test-exhibbition-2', true)

//Case 1. Cek Input Email yang tidak terdaftar

WebUI.click(findTestObject('Object Repository/Page_Virtual Exhibition CMS/a_Visit Exhibition'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/i_Your browser does not support the video t_6ad3e2'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/a_Lupa Password'))

WebUI.setText(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/input_Next_email'), 'belum@daftar.co.id')


WebUI.sendKeys(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/button_Kirim OTP'),Keys.chord(Keys.ENTER))

BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))

ImageIO.write(image, 'png', new File(GlobalVariable.sspath + GlobalVariable.tcName + '-1.png'))

WebUI.delay(5)

WebUI.closeBrowser()

