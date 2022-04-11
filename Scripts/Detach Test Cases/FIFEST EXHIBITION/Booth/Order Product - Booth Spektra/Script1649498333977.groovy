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

WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/arrow_boothSpektra'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-1.png')

WebUI.click(findTestObject('Booth-Order/Spektra_order/booth_spektra_orderproduct'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-2.png')

WebUI.delay(1)

WebUI.click(findTestObject('Booth-Order/Spektra_order/Modal_form_choose_region'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-3.png')
WebUI.delay(1)

WebUI.click(findTestObject('Booth-Order/Spektra_order/Modal_form_choose_product_type'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-4.png')
WebUI.delay(1)

WebUI.click(findTestObject('Booth-Order/Spektra_order/Modal_form_choose_retail_region'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-5.png')
WebUI.delay(1)

WebUI.click(findTestObject('Booth-Order/Spektra_order/Click_image_product'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-6.png')
WebUI.delay(2)

WebUI.click(findTestObject('Booth-Order/Spektra_order/Close_image_product'))

WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_click_orderProduct'))

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-7.png')
WebUI.delay(2)