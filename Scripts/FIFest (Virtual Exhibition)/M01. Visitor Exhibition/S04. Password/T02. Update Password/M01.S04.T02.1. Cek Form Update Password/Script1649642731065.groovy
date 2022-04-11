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

//SET NEW PASSWORD
String updateP = GlobalVariable.newP+'0'

//WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//Case 1. Cek Form Update Password
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
}

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-1.png')


//Case 2. Cek Form Update Password 2

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/safari-2021/lobby')
WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) ==
true) {
	WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
}

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-1.png')


//Case 3. Cek User Melakukan Update Password

WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_Exit_oldpassword'), GlobalVariable.newP)

WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_wrong old password_newpassword'), updateP)

WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_password cannot be the same as before_020a2d'),updateP)

WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password_1'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/button_Exit'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//Test Login

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), updateP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) ==
	true) {
		WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))
	}
	
	WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))
	
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
	
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_Profile'))
	
	WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-2.png')
	
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password'))
	
	//Restoring Global Variable NewP
	
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_Exit_oldpassword'), updateP)
	
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_wrong old password_newpassword'), GlobalVariable.newP)
	
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_password cannot be the same as before_020a2d'),GlobalVariable.newP)
	
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password_1'))
	
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_Profile'))

//Case 4. Cek User Melakukan Update dengan password yang sama dengan password lama
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password'))
		
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_Exit_oldpassword'), GlobalVariable.newP)
		
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_wrong old password_newpassword'), GlobalVariable.newP)
		
	WebUI.setText(findTestObject('Object Repository/Page_Lobby - Safari 2021/input_password cannot be the same as before_020a2d'),GlobalVariable.newP)
	
	WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-3.png')
	WebUI.click(findTestObject('Object Repository/Page_Lobby - Safari 2021/button_Update Password_1'))
	WebUI.delay(5)
	
WebUI.closeBrowser()

