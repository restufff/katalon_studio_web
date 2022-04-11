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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])


Object excelData = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.registrasiPath, 'Registrasi', true)
//String chars = "abcdefghijklmnopqrstuvwxyz0123456789"
//String randomInt = RandomStringUtils.randomNumeric(10)
//public static String randomString(String chars, int length) {
//  Random rand = new Random();
//  StringBuilder sb = new StringBuilder();
//  for (int i=0; i<length; i++) {
//	sb.append(chars.charAt(rand.nextInt(chars.length())));
//  }
//  return sb.toString();
//}
//int randomInt = new Random().nextInt(9999 - 10 + 1) + 10
String name = excelData.getValue('NamaLengkap', 1)
String mail = excelData.getValue('Email', 1)
String phone = excelData.getValue('NoHP', 1)
String password = excelData.getValue('Password', 1)
String address = excelData.getValue('Alamat', 1)

//WebUI.comment("TEST SCENARIO ${GlobalVariable.tcName} ..")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByLabel(findTestObject('FEST-EXIB/Spektra - Tangerang/Spektra Expo - Tangerang'), 
    'SPEKTRA EXPO - Tangerang', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

//Case 1. Cek tombol Register Now

//WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), name)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), mail)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPhone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), password)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), address)
WebUI.takeScreenshot(GlobalVariable.sspath+GlobalVariable.tcName+'-1.png')
WebUI.click(findTestObject('Page_Test exhibbition 2/checklistTermandCondition'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_RegisterNow'))
WebUI.delay(1)
WebUI.takeScreenshot(GlobalVariable.sspath+GlobalVariable.tcName+'-2.png')
CustomKeywords.'com.validation.web.registrasiValidation.verifyRegistration'()
//WebUI.verifyElementPresent(findTestObject('Object Repository/FEST-EXIB/Spektra - Tangerang/FormLogin_SpektraTangerang'),5, 
//	FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)
WebUI.closeBrowser()



