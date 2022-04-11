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
import java.awt.Robot as Robot
import java.awt.event.InputEvent as InputEvent
import java.lang.Thread as Thread
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.ExcelData as ExcelData

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'([])

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fest-test.fifgroup.co.id:9003/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Virtual Exhibition CMS/select_Test Exhibbition 2 - Jakarta 1Safari_5ca4cf'), 
    'test-exhibbition-2', true)

WebUI.click(findTestObject('Object Repository/Page_Virtual Exhibition CMS/a_Visit Exhibition'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/i_Your browser does not support the video t_6ad3e2'))

WebUI.setText(findTestObject('Object Repository/Page_Test exhibbition 2/input_Next_email'), 'marvin@fifgroup.astra.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test exhibbition 2/input_Next_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_Test exhibbition 2/a_Lobby'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/i_Your browser does not support the audio e_97106f'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/img_Your browser does not support the audio_fcd48d'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/div'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/img_Your browser does not support the audio_fcd48d'))

WebUI.click(findTestObject('Object Repository/Page_Lobby - Test exhibbition 2/img_Your browser does not support the audio_fcd48d'))

WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/image_Marvin_noselect spot'))

WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/div_Sumbawa'))

WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/div_gadget'))

WebUI.click(findTestObject('Object Repository/Page_Booth - Test exhibbition 2/div_Spektra Store'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/button_Order Sekarang'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Nama Lengkap_fullname'))

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Nama Lengkap_fullname'), 'Marvin')

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_No. HP_mobilePhone1'), '081313131313')

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Tempat Lahir_birthPlace'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/div_Tanggal LahirTempat Lahir'))

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Tempat Lahir_birthPlace'), 'Munich')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_PriaWanita'), 'M', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Jenis Kelamin_npwpStatus'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/div_Data PersonalData KTPData DomisiliForm _fe6b89'))

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_No. NPWP_npwpNo'), '1234567890')

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/button_Data KTP'))

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/textarea_Alamat KTP_ktpAddress'), 'example')

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_No. KTP_noKTP'), '1234567890')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_Prov JambiProv Nusa Tenggara BaratPr_f422f6'), 
    '031', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_Kabupaten Kepulauan SeribuKota Jakar_f8b7b3'), 
    '03173', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_Kec CengkarengKec Grogol PetamburanK_b966bc'), 
    '0317301', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_Kel Cengkareng BaratKel Cengkareng T_737499'), 
    '0317301003', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product - Test exhibbition 2/select_11730'), '11730', true)

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_RT_ktpRt'), '08')

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_RW_ktpRw'), '06')

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/button_Data Domisili'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_Data Domisili_domisiliXktp'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/button_Data Order'))

WebUI.setText(findTestObject('Object Repository/Page_Product - Test exhibbition 2/input_DP_dp'), '200000')

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/button_Submit Order'))

WebUI.click(findTestObject('Object Repository/Page_Product - Test exhibbition 2/i_Exit_fas fa-arrow-left'))

