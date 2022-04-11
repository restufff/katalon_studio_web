import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.CONTINUE_ON_FAILURE
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.checkerframework.checker.units.qual.Length
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO


CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.festDdtPath, 'festdata', true)

String name = excelData.getValue('Name', 1)

String mail = excelData.getValue('Mail', 1)

String randomInt = RandomStringUtils.randomNumeric(8)

String phone = '0811' + randomInt

String password = excelData.getValue('Password', 1)

String address = excelData.getValue('Address', 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))

WebUI.delay(2)

//Case 1. Cek Field Fullname 

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), name) //add name from excel variable
WebUI.takeScreenshot(GlobalVariable.sspath+GlobalVariable.tcName+'-1.png')
WebUI.delay(2)

//Case 2. Cek Jika Field Nama Lengkap diisi dengan menggunakan angka

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), randomInt)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'testqa'+randomInt+'@example.com')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPhone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)  //use password from default global variable

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), address) //add name from excel variable

WebUI.click(findTestObject('Page_Test exhibbition 2/checklistTermandCondition'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Safari 2021/btn_RegisterNow'),Keys.chord(Keys.ENTER))

//Use this to capture browser pop-up alert
BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))
ImageIO.write(image, 'png', new File(GlobalVariable.sspath + GlobalVariable.tcName + '-2.png'))
//end screen capture

WebUI.delay(2)

if(WebUI.verifyElementNotPresent(findTestObject("Object Repository/Page_Safari 2021/btn_Skip"),3,FailureHandling.CONTINUE_ON_FAILURE)) {

//Case 3. Cek Jika Field Fullname diisi dengan menggunakan special character
		WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), randomInt+ "#####@")
		
		
	} else if(WebUI.verifyElementPresent(findTestObject("Object Repository/Page_Safari 2021/btn_Skip"),3,FailureHandling.CONTINUE_ON_FAILURE)) {
	
		WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
		WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))
		WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), randomInt+ "#####@")
}


WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'testqa'+randomInt+'@example.com')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPhone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), password)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), address)

WebUI.click(findTestObject('Page_Test exhibbition 2/checklistTermandCondition'))
WebUI.sendKeys(findTestObject('Object Repository/Page_Safari 2021/btn_RegisterNow'),Keys.chord(Keys.ENTER))
//BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))
ImageIO.write(image, 'png', new File(GlobalVariable.sspath + GlobalVariable.tcName + '-3.png'))

WebUI.delay(2)


if(WebUI.verifyElementNotPresent(findTestObject("Object Repository/Page_Safari 2021/btn_Skip"),3,CONTINUE_ON_FAILURE)) {
	
//Case 4. Cek Jika Field Fullname tidak diisi
		WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), "")
		
	} else if(WebUI.verifyElementPresent(findTestObject("Object Repository/Page_Safari 2021/btn_Skip"),3,CONTINUE_ON_FAILURE)) {
	
		WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
		WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))
		WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), "")
}



WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'testqa'+randomInt+'@example.com')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPhone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), password)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), address)

WebUI.click(findTestObject('Page_Test exhibbition 2/checklistTermandCondition'))


WebUI.sendKeys(findTestObject('Object Repository/Page_Safari 2021/btn_RegisterNow'),Keys.chord(Keys.ENTER))
ImageIO.write(image, 'png', new File(GlobalVariable.sspath + GlobalVariable.tcName + '-4.png'))

WebUI.closeBrowser()



