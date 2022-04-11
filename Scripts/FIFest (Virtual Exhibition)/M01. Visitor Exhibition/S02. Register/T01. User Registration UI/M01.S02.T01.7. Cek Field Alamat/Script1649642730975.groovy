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


Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('/Users/fifqa/Documents/festdata.xlsx', 'festdata', true)
String chars = "abcdefghijklmnopqrstuvwxyz0123456789"
String randomInt = RandomStringUtils.randomNumeric(10)
public static String randomString(String chars, int length) {
  Random rand = new Random();
  StringBuilder sb = new StringBuilder();
  for (int i=0; i<length; i++) {
	sb.append(chars.charAt(rand.nextInt(chars.length())));
  }
  return sb.toString();
}

//int randomInt = new Random().nextInt(9999 - 10 + 1) + 10
String name = excelData.getValue('Name', 2)
String mail = randomString(chars, 10)+'@'+randomInt.toString()
String phone = randomInt
String password = excelData.getValue('Password', 2)
String address = excelData.getValue('Address', 2)





//WebUI.comment("TEST SCENARIO ${GlobalVariable.tcName} ..")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

//Case 1. Cek Field Alamat

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), address)
WebUI.takeScreenshot(GlobalVariable.sspath+GlobalVariable.tcName+'-1.png')
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Kembali'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Register'))

//Case 2. Cek Jika Field Alamat tidak diisi

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtFullname'), randomString(chars, 10))

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), mail)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPhone'), '081'+phone)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), password)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtAddress'), '')

WebUI.click(findTestObject('Page_Test exhibbition 2/checklistTermandCondition'))
WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_RegisterNow'))
WebUI.delay(2)
WebUI.takeScreenshot(GlobalVariable.sspath+GlobalVariable.tcName+'-2.png')

WebUI.delay(3)
WebUI.closeBrowser()



