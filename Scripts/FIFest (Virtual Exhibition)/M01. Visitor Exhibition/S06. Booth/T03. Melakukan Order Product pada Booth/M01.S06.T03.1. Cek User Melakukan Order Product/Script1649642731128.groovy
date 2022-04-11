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
import com.kms.katalon.core.webui.keyword.builtin.DragAndDropByOffsetKeyword as DragAndDropByOffsetKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.transform.ThreadInterrupt as ThreadInterrupt
import internal.GlobalVariable as GlobalVariable
import newPackage.DragAndDropKeywords as DragAndDropKeywords
import java.awt.event.InputEvent as InputEvent
import java.lang.Thread as Thread
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO

WebUI.comment("TEST SCENARIO $GlobalVariable.tcName ..")

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

'Open Browser'
WebUI.openBrowser('')

'Maximize Window'
WebUI.maximizeWindow()

'Go to FIFGroup fest'
WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

'Select Test Exhibbition 2 - Jakarta 1'
WebUI.selectOptionByValue(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/select_Test Exhibbition 2 - Jakarta 1Safari_863b58'), 
    'safari-2021', true)

WebUI.click(findTestObject('Object Repository/FEST-EXIB/exhibitonSelect_Dashboard/btn_visitExhibition'))

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Skip'))

//test case 2.1

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtEmail'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_Safari 2021/txtPassword'), GlobalVariable.newP)

WebUI.click(findTestObject('Object Repository/Page_Safari 2021/btn_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Next'))


WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/btn_Lobby'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

//WebUI.delay(3)

WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 600, 0)

//WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), -600, 0)

//test case 2.2-3
WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'))

//WebUI.delay(1)

//test case 2.4
WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/safari-2021/lobby')

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

//while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'), 3, FailureHandling.CONTINUE_ON_FAILURE)==
//	true) {
//		WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/centerArrow'),10,0)
//	}
//test case 2.4
WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/test-exhibbition-2/lobby/95c72a7fa3a5fd3d2634beb5946b48a3')

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))

'Order in Booth Spektra'
WebUI.callTestCase(findTestCase('Test Cases/Detach Test Cases/FIFEST EXHIBITION/Booth/Order Product - Booth Spektra'), [:], FailureHandling.STOP_ON_FAILURE)

'Fill Data General'
WebUI.callTestCase(findTestCase('Test Cases/Detach Test Cases/FIFEST EXHIBITION/Booth/Data Excel - Data General'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_DataKtp'))

'Fill Data KTP'
WebUI.callTestCase(findTestCase('Test Cases/Detach Test Cases/FIFEST EXHIBITION/Booth/Data Excel - Data KTP'), [:], FailureHandling.STOP_ON_FAILURE)



//if (true) {
//	WebUI.verifyElementPresent(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_NPWP'),4){
//		WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_DataKtp'))
//		
//	}
//	
//}else {
	
	//}


//WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/test-exhibbition-2/lobby/95c72a7fa3a5fd3d2634beb5946b48a3')
//
//WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
//
//WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/arrow_boothDanastra'))
//
//WebUI.click(findTestObject('Booth-Order/Danastara_order/booth_danastra_orderproduct'))
//
//WebUI.delay(5)
//
//WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-5.png')
//
//WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/test-exhibbition-2/lobby/95c72a7fa3a5fd3d2634beb5946b48a3')
//
//WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/btn_SoundOff'))
//
//WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/arrow_boothAmitra'))
//
//WebUI.delay(5)
//
//WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-6.png')

WebUI.closeBrowser()

