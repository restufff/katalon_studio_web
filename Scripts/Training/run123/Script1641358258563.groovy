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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://116.254.100.222:81/login')

WebUI.setText(findTestObject('Training/loginPage/txtLogin'), 'marvin@example.com')

WebUI.setEncryptedText(findTestObject('Training/loginPage/txtPassword'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Training/loginPage/btn_Login'))

WebUI.click(findTestObject('Training/transactionPage/tab_Transaction'))

WebUI.click(findTestObject('Training/transactionPage/btn_Order'))

WebUI.click(findTestObject('Training/transactionPage/btn_Ayam'))

WebUI.click(findTestObject('Training/transactionPage/btn_AyamGoreng'))

WebUI.setText(findTestObject('Training/transactionPage/txtName'), 'marvin')

WebUI.setText(findTestObject('Training/transactionPage/txtAddress'), 'example street')

WebUI.setText(findTestObject('Training/transactionPage/txtPhone'), '001122334455')

WebUI.click(findTestObject('Training/transactionPage/btn_OrderSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Indocyber  Katalon Test/a_Form 1'))

WebUI.setText(findTestObject('Object Repository/Page_Indocyber  Katalon Test/input_Name_txtName'), 'Susan')

WebUI.setText(findTestObject('Object Repository/Page_Indocyber  Katalon Test/input_poin_txtPoin'), '50')

WebUI.click(findTestObject('Object Repository/Page_Indocyber  Katalon Test/input_poin_btnSubmit'))

WebUI.click(findTestObject('Training/formExample_1/deleteSusan33'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Training/dashboardPage/btn_Logout'))

WebUI.closeBrowser()

