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
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit

Object dataExcel = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.orderCustDdt, 'KTPData', true)

String address = dataExcel.getValue('Alamat', 1)

String numberKTP = dataExcel.getValue('Nomor', 1)

String province = dataExcel.getValue('Provinsi', 1)

String City = dataExcel.getValue('Kota', 1)

String district = dataExcel.getValue('Kecamatan', 1)

String ward = dataExcel.getValue('Kelurahan', 1)

String postalCode = dataExcel.getValue('Kodepos', 1)

String rt = dataExcel.getValue('RT', 1)

String rw = dataExcel.getValue('RW', 1)

String nominalDP = dataExcel.getValue('NominalDP', 1)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_alamatKTP'), address)
WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_NoKTP'), numberKTP)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropDownMenu_Provinsi'),
	findTestData('Data Files/Data Order/DataOrderKTP').getValue('Provinsi', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropDownMenu_Kota'),
	findTestData('Data Files/Data Order/DataOrderKTP').getValue('Kota', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropDownMenu_Kecamatan'),
	findTestData('Data Files/Data Order/DataOrderKTP').getValue('Kecamatan', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropDownMenu_kelurahan'),
	findTestData('Data Files/Data Order/DataOrderKTP').getValue('Kelurahan', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropDownMenu_kodePos'),
	findTestData('Data Files/Data Order/DataOrderKTP').getValue('Kodepos', 1), true)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_rt'), rt)
WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_rw'), rw)

WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-8.png')
WebUI.delay(2)


//data domisili
WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_DataDomisili'))
WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/checkBoxbtn_samaDenganKTP'))
WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-4-9.png')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_DataOrder'))
WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-5-0.png')
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_DP'), nominalDP)
WebUI.takeScreenshot((GlobalVariable.sspath + GlobalVariable.tcName) + '-5-1.png')
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/btn_SubmitOrder'))
BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))
ImageIO.write(image, 'png', new File((GlobalVariable.sspath + GlobalVariable.tcName) + '-5-2.png'))

WebUI.delay(1)