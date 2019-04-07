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

// Opent the Browser 
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/index.php/auth/login')

//Verify this is the correct page
WebUI.verifyElementPresent(findTestObject('Object Repository/OR_OrangeHRM Login/Page_OrangeHRM/OrangeHRMLogo'), 3)

//Click on User Name box
WebUI.click(findTestObject('Object Repository/OR_OrangeHRM Login/Page_OrangeHRM/UserNameBox'))

//Enter User Name Admin
WebUI.setText(findTestObject('Object Repository/OR_OrangeHRM Login/Page_OrangeHRM/UserNameBox'), 'Admin')

//click on PW box
WebUI.click(findTestObject('Object Repository/OR_OrangeHRM Login/Page_OrangeHRM/PasswordBox'))

//Enter Password 'Admin123'
WebUI.setEncryptedText(findTestObject('Object Repository/OR_OrangeHRM Login/Page_OrangeHRM/PasswordBox'), 'hUKwJTbofgPU9eVlw/CnDQ==')

//Click Login Button
WebUI.click(findTestObject('OR_OrangeHRM Login/Page_OrangeHRM/LoginButton'))


WebUI.closeBrowser()

