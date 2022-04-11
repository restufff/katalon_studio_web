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

WebUI.navigateToUrl('http://116.254.100.222:81/')

WebUI.click(findTestObject('Object Repository/Training/Page_Indocyber/a_Login'))

WebUI.setText(findTestObject('Object Repository/Training/Page_Indocyber/input_E-Mail Address_email'), 'marvin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Training/Page_Indocyber/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Training/Page_Indocyber/button_Login'))

WebUI.click(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/a_Form 1'))

int idx = 20;

for (int i = 1; i <= idx; i++) {
	int poin = 0
		if(i % 2 == 0) {
				WebUI.setText(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/input_Name_txtName'), 'Jaka')
			} else {
				WebUI.setText(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/input_Name_txtName'), 'Susan')
		}
	
	poin = i

	if(i % 3 == 0) {
		poin *= 3
	}

	if (i % 4 == 0) {
				poin *= 4
			}
			
			if (i % 5 == 0) {
				poin *= 5
			}
				
		WebUI.setText(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/input_poin_txtPoin'), String.valueOf(poin))
		WebUI.takeScreenshot(GlobalVariable.ssTraining+GlobalVariable.tcName+'_'+i+'.png')
		WebUI.click(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/input_poin_btnSubmit'))
}
		
		
	WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Training/Page_Indocyber  Katalon Test/a_Logout'))

WebUI.closeBrowser()

