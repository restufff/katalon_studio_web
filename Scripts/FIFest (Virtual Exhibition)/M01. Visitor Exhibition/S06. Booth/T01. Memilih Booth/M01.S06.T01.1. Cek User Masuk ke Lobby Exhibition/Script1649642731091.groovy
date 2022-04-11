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

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

//WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')


//Case 1. Cek User Masuk ke Lobby Exhibition
WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//test case 1.1
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))
while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) ==
	true) {
		WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
	}
	
	WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
	
	
	WebUI.delay(15)
WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-1.png')

WebUI.closeBrowser()
