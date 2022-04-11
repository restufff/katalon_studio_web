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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory


Object excelData = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.orderCustDdt, 'CustData', true)

String name = excelData.getValue('NamaLengkap', 1)

String phone = excelData.getValue('NomorHP', 1)

String birthDate = excelData.getValue('TanggalLahir', 1)

String PlaceofBirth = excelData.getValue('TempatLahir', 1)

String gender = excelData.getValue('JenisKelamin', 1)

String marriedStatus = excelData.getValue('MaritalStatus', 1)

String homeStatus = excelData.getValue('StatusRumah', 1)

String lastDegree = excelData.getValue('PendidikanTerakhir', 1)

String income = excelData.getValue('PenghasilanPerbulan', 1)

String expense = excelData.getValue('PengeluaranPerbulan', 1)

String npwp = excelData.getValue('NPWP',1)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_namaLengkap'), name)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_nomorHP'), phone)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_TanggalLahir'), birthDate)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_TempatLahir'), PlaceofBirth)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_TempatLahir'), PlaceofBirth)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropdown_jenisKelamin'),
findTestData('Data Files/Data Order/Data Order Customer').getValue('JenisKelamin', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropdown_MartialStatus'),
	findTestData('Data Files/Data Order/Data Order Customer').getValue('MaritalStatus', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropdown_StatusRumah'),
	findTestData('Data Files/Data Order/Data Order Customer').getValue('StatusRumah', 1), true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Booth-Order/Spektra_order/dropdown_PendidikanTerakhir'),
	findTestData('Data Files/Data Order/Data Order Customer').getValue('PendidikanTerakhir', 1), true)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_penghasilanPerbulan'), income)

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_pengeluaranPerbulan'), expense)

WebUI.click(findTestObject('Object Repository/Booth-Order/Spektra_order/Click_mempunyaiNpwp'))

WebUI.setText(findTestObject('Object Repository/Booth-Order/Spektra_order/inputText_NPWP'), npwp)
//WebUI.delay(2)