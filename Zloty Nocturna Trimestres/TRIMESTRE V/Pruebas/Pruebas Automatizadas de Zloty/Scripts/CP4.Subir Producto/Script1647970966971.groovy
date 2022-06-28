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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/Page_Zloty - Principal/a_Iniciar Sesin'))

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Email_email'), 'jczcespedes@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel/input_Contrasea_password'), 'GR1bKU6czY2zR77/ZdXCcA==')

WebUI.click(findTestObject('Object Repository/Page_Laravel/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Laravel/a_Realizar Donacin e Intercambio'))

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Cerrar Sesin_name'), 'Pantalon')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Cerrar Sesin_description'), 'Pantalon talla S Azul')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Cerrar Sesin_stocks'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Laravel/select_Tipo de Intercambio'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Laravel/select_Categoria                           _ceee95'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Laravel/select_Estado                              _137394'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Laravel/input_Fecha de donacin_btn colorBoton'))

WebUI.click(findTestObject('Object Repository/Page_SQLSTATEHY000 General error 1364 Field_e42b50/div_IlluminateDatabaseQueryException     SQ_ea5cf4'))

