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

CustomKeywords.'loginPage.Login.enterUserName'('Admin')

CustomKeywords.'loginPage.Login.enterPasswor'('admin123')

//CustomKeywords.'loginPage.Login.verifyLogin'()
CustomKeywords.'loginPage.Login.clickOnLogin'()

CustomKeywords.'loginPage.Login.clickOnPerformance'()

//CustomKeywords.'loginPage.Login.enterEmpNameInPerformance'('paul Colling')



//CustomKeywords.'loginPage.Login.clickOnDropdownInPerforJobTitle'()

//CustomKeywords.'loginPage.Login.clickOnSoftware'()

//CustomKeywords.'loginPage.Login.clickOnDropdownButtonOfSubunitInPerformance'()

//CustomKeywords.'loginPage.Login.selectEngineeringOptInSubunit'()

//CustomKeywords.'loginPage.Login.clickOnIncludeInperf'()

/*CustomKeywords.'loginPage.Login.selectCurrentAndPastEmployeesInPerfo'()

CustomKeywords.'loginPage.Login.clickOnReview'()

CustomKeywords.'loginPage.Login.selectInProgressOption'()

CustomKeywords.'loginPage.Login.clickOnFromDate'()

CustomKeywords.'loginPage.Login.clickOndropDownButtonTOselectYearInPerfo'()

CustomKeywords.'loginPage.Login.selectYearInPerfo'()

CustomKeywords.'loginPage.Login.clickOnDropdownButtonToSelectMonthInperfo'()

CustomKeywords.'loginPage.Login.selectMonthInPerfor'()

CustomKeywords.'loginPage.Login.selectDate'()

CustomKeywords.'loginPage.Login.clickOnToDate'()

CustomKeywords.'loginPage.Login.clickOndropDownButtonTOselectYearInPerfo'()

CustomKeywords.'loginPage.Login.selectYearForToDateInPerfor'()

CustomKeywords.'loginPage.Login.clickOnDropdownButtonToSelectMonthInperfo'()

CustomKeywords.'loginPage.Login.selectMonthInToDatePerfo'()

CustomKeywords.'loginPage.Login.selectDate'()

CustomKeywords.'loginPage.Login.clickOnSerachInPerformance'()

CustomKeywords.'loginPage.Login.verifyNoRecordsFoundInPerfor'()*/


CustomKeywords.'loginPage.Login.enterAllRequiredFieldsInPerform'("d")

CustomKeywords.'loginPage.Login.clickOnFromDate'()

CustomKeywords.'loginPage.Login.clickOnToDate'()


//WebUI.delay(10)
//WS.delay(10)
//Mobile.delay(10)
CustomKeywords.'loginPage.Login.clickOnSerachInPerformance'()