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

WebUI.click(findTestObject('OR_CURA/i_CURA Healthcare_fa fa-bars'))

WebUI.delay(6)

WebUI.click(findTestObject('OR_CURA/a_Login'))

WebUI.delay(6)

WebUI.setText(findTestObject('OR_CURA/input_Username_username'), 'John Doe')

WebUI.delay(6)

WebUI.setEncryptedText(findTestObject('OR_CURA/input_Password_password'), 'npnYCJoQVm0=')

WebUI.delay(6)

WebUI.click(findTestObject('OR_CURA/button_Login'))

WebUI.delay(6)

WebUI.click(findTestObject('OR_CURA/p_Login failed Please ensure the username and password are valid'))

WebUI.delay(6)

WebUI.closeBrowser()

