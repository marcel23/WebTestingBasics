import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.delay(6)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Medicare                                                                             Medicaid                                                                             None'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphicon-calendar'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_26'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Hi There')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.delay(6)

WebUI.closeBrowser()
