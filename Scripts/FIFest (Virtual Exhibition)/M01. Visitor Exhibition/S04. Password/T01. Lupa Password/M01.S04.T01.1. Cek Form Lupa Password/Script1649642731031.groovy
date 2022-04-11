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

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Virtual Exhibition CMS/select_Test Exhibbition 2 - Jakarta 1Safari_5ca4cf'), 
    'test-exhibbition-2', true)

//Case 1. Cek Form Lupa Password

WebUI.click(findTestObject('Object Repository/Page_Virtual Exhibition CMS/a_Visit Exhibition'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/i_Your browser does not support the video t_6ad3e2'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/a_Lupa Password'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-1.png')

//Case 2. Cek field Email
WebUI.setText(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/input_Next_email'), 'marvin@fifgroup.astra.co.id')

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-2.png')

//Case 3. Cek Send OTP

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/button_Kirim OTP'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-3.png')

WebUI.delay(20)

//Case 4. Cek Form Input OTP

//Lakukan input OTP secara manual

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-1.png')

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/button_Selanjutnya'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-2.png')

//Case 5. Cek Form Password Baru

WebUI.setText(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/input_Next_newpassword'), GlobalVariable.newP)

WebUI.setText(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/input_password cannot be the same as before_020a2d'), GlobalVariable.newP)

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-5-1.png')

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2 - Forgot Password/button_Perbarui'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/i_Your browser does not support the video t_6ad3e2'))

//TEST LOGIN DENGAN PASSWORD BARU

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), 'marvin@fifgroup.astra.co.id')

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

WebUI.delay(5)

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-5-2.png')

WebUI.closeBrowser()

