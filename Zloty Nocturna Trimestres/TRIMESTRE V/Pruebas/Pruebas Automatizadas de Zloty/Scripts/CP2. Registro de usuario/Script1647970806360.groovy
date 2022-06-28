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

WebUI.click(findTestObject('Object Repository/Page_Zloty - Principal/a_Registrate'))

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Nombre_name'), 'Usuario de prueba')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Email_email'), 'usuariodeprueba@correo.com')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_N. Contacto_phone'), '3217543433')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Laravel/select_Bogot D.C                           _c8b5ae'), 
    'Boyáca', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel/input_Introduce una contrasea_password'), 'GR1bKU6czY2zR77/ZdXCcA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel/input_Confirmar contrasea_password_confirmation'), 
    'GR1bKU6czY2zR77/ZdXCcA==')

WebUI.click(findTestObject('Object Repository/Page_Laravel/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_Laravel/b_Cerrar Sesin'))

