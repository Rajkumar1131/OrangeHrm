package loginPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.lang.invoke.ConstantCallSite

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


import internal.GlobalVariable
import webAutomation.Verifications
import webAutomation.WebActions


public class Login {
	WebActions actions = new WebActions();
	Verifications verifications = new Verifications();


	@Keyword
	def login() {
	}

	@Keyword
	def checkLogo() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/logo"), "There is no logo")
	}

	@Keyword
	def enterUserName(userName) {
		actions.sendKeys(findTestObject("Object Repository/login/userName"), userName)
	}

	@Keyword
	def enterPasswor(password) {
		actions.sendKeys(findTestObject("Object Repository/login/password"), password)
	}

	@Keyword
	def clickOnLogin() {
		actions.click(findTestObject("Object Repository/login/loginBtn"))
	}

	@Keyword
	def verifyLogin() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/userIcon"), "Login failed - User icon is not showin")
		verifications.verifyElementPresent(findTestObject("Object Repository/login/dashboard"), "Login failed - Dashboard is not showin")
		verifications.verifyElementPresent(findTestObject("Object Repository/login/logo"), "Login failed - logo is not showin")
	}

	@Keyword
	def clickOnUserIcon() {
		actions.click(findTestObject("Object Repository/login/userIcon"))
	}

	@Keyword
	def clickOnLogout() {
		actions.click(findTestObject("Object Repository/login/logoutBtn"))
	}

	@Keyword
	def logout() {
		this.clickOnUserIcon();
		this.clickOnLogout();
		this.verifyLogout();
	}

	@Keyword
	def verifyLogout() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/userName"), "Logout failed - User name is not showin")
		verifications.verifyElementPresent(findTestObject("Object Repository/login/password"), "Logout failed - Password is not showin")
		verifications.verifyElementPresent(findTestObject("Object Repository/login/loginBtn"), "Logout failed - Login button is not showin")
	}

	@Keyword
	def invalidUserName(userName) {
		actions.sendKeys(findTestObject("Object Repository/login/userName"), userName)
	}

	@Keyword
	def enterValidPassword(password) {
		actions.sendKeys(findTestObject("Object Repository/login/password"), password)
	}

	@Keyword
	def verifyErrorMessageForInvalidCredentials() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/InvalidCredentials"), "There is no error message for invalid credentials")
	}

	@Keyword
	def enterInvalidPass(password) {
		actions.sendKeys(findTestObject("Object Repository/login/password"),password)
	}

	@Keyword
	def verifyErrorMesageForSpace() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/EmptySpacesForLogin"), "Error message should display")
	}

	@Keyword
	def verifyReset() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/forgotPassword"), "Login failed-forgot password is not showing")
	}

	@Keyword
	def clickOnResetPassword() {
		actions.click(findTestObject("Object Repository/login/forgotPassword"))
	}

	@Keyword
	def enterUserNameReset(userName) {
		actions.sendKeys(findTestObject("Object Repository/login/ForgotPasswordUserName"), userName)
	}

	@Keyword
	def clickOnCancel() {
		actions.click(findTestObject("Object Repository/login/forgotPasswordCancelButton"))
	}

	@Keyword
	def verifyLandingPage()  //if we click on cancel button for reset password it should comeback to home page
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/forgotPassword"), "login page-it is not showing login page")
	}

	@Keyword
	def verifyErrorMesage()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/invalidUserNameForResetingPassword"),"It should show error message")

	}

	@Keyword
	def search(search)
	{
		actions.sendKeys(findTestObject("Object Repository/login/Search"),search)
	}

	@Keyword
	def addButtonInAdmin()
	{
		actions.click(findTestObject("Object Repository/login/AddButtonInAdmin"))
	}


	@Keyword
	def selectOptionInAdmin()
	{
		actions.click(findTestObject("Object Repository/login/DropDownOptionInAdmin"))
	}

	@Keyword
	def clickOnAdminInAdmin()
	{
		actions.click(findTestObject(""))
	}

	@Keyword
	def verifyAdmin()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/Admin"), "There is no admin module")
	}

	@Keyword
	def verifyPim()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/PIM"), "there is no PIM module")
	}

	@Keyword
	def clickOnPim()
	{
		actions.click(findTestObject("Object Repository/login/PimModule"))
	}
	@Keyword
	def enterEmpNameInPim(empName)
	{
		actions.sendKeys(findTestObject("Object Repository/login/EmpNamePim"), empName)
	}

	@Keyword
	def clickOnAddInPim()
	{
		actions.click(findTestObject("Object Repository/login/AddButtonInPim"))
	}

	@Keyword
	def enterFirstNameInPim(firstName)
	{
		actions.sendKeys(findTestObject("Object Repository/login/FirstNameInPim"), firstName)
	}

	@Keyword
	def enterLastNameInPim(lastName)
	{
		actions.sendKeys(findTestObject("Object Repository/login/LastNameInPim"), lastName)
	}

	@Keyword
	def clickOnSaveInPim()
	{
		actions.click(findTestObject("Object Repository/login/SaveButtonInPim"))
	}

	@Keyword
	def verifyProfileCreatedPim()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/ProfileCreatedInPim"), "profile not created")
	}
	@Keyword
	def verifyRequirements()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/RequirementsModule"),"There is no requirements module")
	}

	@Keyword
	def verifyDashboard()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/DashboardModule"),"Dashboard is not showing")
	}

	@Keyword
	def clickOnMyInfo()
	{
		actions.click(findTestObject("Object Repository/login/MyInfoButton"))
	}

	@Keyword
	def verifyMyProfile()
	{
		verifications.verifyElementPresent(findTestObject("Object Repository/login/EmployeeImageInMyInfo"), "there is no employee image")
	}

	@Keyword
	def clickOnPerformance() {

		actions.click(findTestObject("Object Repository/login/PerformanceModule"))
	}

	@Keyword
	def enterEmpNameInPerformance(empName) {

		actions.sendKeys(findTestObject("Object Repository/login/empnameInPerformance"), empName)
	}

	@Keyword
	def clickOnEmpNameInPerfo() {

		actions.click(findTestObject("Object Repository/login/SelectNameInPerfo"))
	}

	/*@Keyword
	 def clickOnDropdownInPerforJobTitle() {
	 actions.click(findTestObject("Object Repository/login/dropDownInPerformance"))
	 }
	 */
	@Keyword
	def clickOnSoftware() {

		actions.click(findTestObject("Object Repository/login/dropDownInPerformance"))
		actions.click(findTestObject("Object Repository/login/softwareEngineer"))

	}

	@Keyword
	def clickOnDropdownButtonOfSubunitInPerformance() {
		actions.click(findTestObject("Object Repository/SubUintInPerformance"))
	}

	@Keyword
	def selectEngineeringOptInSubunit() {

		actions.click(findTestObject("Object Repository/login/SelectEngineeringInSubunit"))
	}

	@Keyword
	def clickOnIncludeInperf() {

		actions.click(findTestObject("Object Repository/login/IncludeInPerformance"))
	}

	@Keyword
	def selectCurrentAndPastEmployeesInPerfo() {

		actions.click(findTestObject("Object Repository/login/CurrentAndPastEmployeeInclude"))
	}

	@Keyword
	def clickOnReview() {
		actions.click(findTestObject("Object Repository/login/clickOnReview"))
	}

	@Keyword
	def selectInProgressOption() {

		actions.click(findTestObject("Object Repository/login/InProgressOptionInReview"))
	}
	@Keyword
	def selectOption() {
		actions.click(findTestObject("Object Repository/login/reviewStatus"))
	}
	@Keyword
	def clickOnFromDate() {

		actions.click(findTestObject("Object Repository/login/FromDate"))
		actions.click(findTestObject("Object Repository/login/clickOnDropdownButtonToselectYearInPerfo"))
		actions.click(findTestObject("Object Repository/login/SelectYear"))
		actions.click(findTestObject("Object Repository/login/clickOnDropdownButtonToselectMonth"))
		actions.click(findTestObject("Object Repository/login/SelectMonth"))
		actions.click(findTestObject("Object Repository/login/SelectDate"))

	}

	/*@Keyword
	 def clickOndropDownButtonTOselectYearInPerfo() {
	 }
	 @Keyword
	 def selectYearInPerfo() {
	 }
	 @Keyword
	 def clickOnDropdownButtonToSelectMonthInperfo() {
	 }
	 @Keyword
	 def selectMonthInPerfor() {
	 }
	 @Keyword
	 def selectDate() {
	 }*/

	@Keyword
	def clickOnToDate() {
		actions.click(findTestObject("Object Repository/login/ToDate"))
		actions.click(findTestObject("Object Repository/login/clickOnDropdownButtonToselectYearInPerfo"))
		actions.click(findTestObject("Object Repository/login/selectToYear"))
		actions.click(findTestObject("Object Repository/login/clickOnDropdownButtonToselectMonth"))
		actions.click(findTestObject("Object Repository/login/SelectMonthInTodate"))
		actions.click(findTestObject("Object Repository/login/SelectDate"))

	}


	/*@Keyword
	 def selectYearForToDateInPerfor() {
	 }
	 @Keyword
	 def selectMonthInToDatePerfo() {
	 }*/

	@Keyword
	def clickOnSerachInPerformance() {
		actions.click(findTestObject("Object Repository/login/searchButtonInPerformance"))
		this.verifyNoRecordsFoundInPerfor()
	}

	@Keyword
	def clickOnTimeModule() {

		actions.click(findTestObject("Object Repository/login/TimeModule"))
	}

	@Keyword
	def clickOnAttendanceInTimeMod() {

		actions.click(findTestObject("Object Repository/login/attendanceInTime"))
	}

	@Keyword
	def clickOnMyRecords() {
		actions.click(findTestObject("Object Repository/login/MyRecordsInAttendance"))
	}

	@Keyword
	def clickOndropdownInTime() {
		actions.click(findTestObject("Object Repository/login/clickOnDropdownInTime"))
	}

	@Keyword
	def clickOnViewInTimeModule() {

		actions.click(findTestObject("Object Repository/login/ViewOptionInTimeModule"))
	}

	@Keyword
	def selectYearInTimeModule() {

		actions.click(findTestObject("Object Repository/login/SelectYearInTimeModule"))
	}

	@Keyword
	def selectMonthInTimeModule() {

		actions.click(findTestObject("Object Repository/login/SelectMonthInTimeModule"))
	}

	@Keyword
	def selectDateInTimeModule() {

		actions.click(findTestObject("Object Repository/login/SelectDateInTimeModule"))
	}



	@Keyword
	def verifyNoRecordsFoundInPerfor() {

		verifications.verifyElementPresent(findTestObject("Object Repository/login/noRecordsFoundInPerfor"),"There is no message")
	}

	@Keyword
	def errorMessageWhenUnknownNameEnteredInPerf() {

		verifications.verifyElementPresent(findTestObject("Object Repository/login/InvalidmessageWhenUnknownNameEnteredInPerof"), "there is no error message")
	}

	@Keyword
	def test1() {

		def m=["Object Repository/login/AdminModule", "Object Repository/login/PimModule", "Object Repository/login/LeaveModule", "Object Repository/login/TimeModule", "Object Repository/login/RecruitmentModule", "Object Repository/login/MyInfoModule", "Object Repository/login/PerformanceModule", "Object Repository/login/DashboardModule", "Object Repository/login/DirectoryModule", "Object Repository/login/maintenanceModule", "Object Repository/login/BuzzModule"]
		String [] n=["Admin", "PIM", "Leave", "Time", "Recruitment", "My info", "Performance", "Dashboard", "Directory", "Maintanence", "Buzz"]
		for(int i in 0..11)
		{


			verifications.verifyElementPresent(findTestObject(m[i]),10,"there is no element")
		}


	}

	@Keyword
	def m() {
		admin =findTestCase('Object Repository/login/AdminModule')
		pim =findTestObject('Object Repository/login/PimModule')
		def m=[admin, pim]
		for(def i:m)
		{


			WebUI.verifyElementPresent(i, 3000)
		}

	}
	@Keyword
	def m1() {
		verifications.verifyElementPresent(findTestObject("Object Repository/login/Page_Admin"),"There is no element")
	}

	@Keyword
	def clickOnM2() {
		def objectsArray = ['Object Repository/login/AdminModule', 'Object Repository/login/PimModule', 'Object Repository/login/LeaveModule', 'Object Repository/login/TimeModule', 'Object Repository/login/RecruitmentModule', 'Object Repository/login/MyInfoModule', 'Object Repository/login/PerformanceModule', 'Object Repository/login/DashboardModule', 'Object Repository/login/DirectoryModule', 'Object Repository/login/maintenanceModule', 'Object Repository/login/BuzzModule']


		for (def i = 0; i < objectsArray.size(); i++) {
			def object = findTestObject(objectsArray[i])
			WebUI.verifyElementPresent(object, 10)


		}
	}
	@Keyword
	def clickOnM3() {

		def n=["Admin"]
		for (def i = 0; i < n.size(); i++) {
			def m=n[i]
			def object=findTestObject("Page_${m}")
			WebUI.verifyElementPresent(object, 10)


		}

	}

	@Keyword
	def clickOnVerifyAllModules() {

		def n=["Admin", "PIM", "Leave", "Time", "Recruitment", "My Info", "Performance", "Dashboard", "Directory", "Maintenance", "Buzz"]

		for (def i = 0; i < n.size(); i++) {
			def m=n[i]
			def object=findTestObject("login/AdminModule",['moduleName':m])
			WebUI.verifyElementPresent(object, 10)
		}
	}

	@Keyword
	def loginWithValidCredentials(userName,password) {

		this.enterUserName(userName)
		this.enterPasswor(password)
		this.clickOnLogin()
		this.logout()
	}

	@Keyword
	def loginWithInvalidCreds(userName,password) {

		this.enterUserName(userName)
		this.enterPasswor(password)
		this.clickOnLogin()
		this.verifyErrorMessageForInvalidCredentials()


	}

	@Keyword
	def enterAllRequiredFieldsInPerform(empName) {

		this.enterEmpNameInPim(empName)
		actions.click(findTestObject("Object Repository/login/SelectNameInPerfo"))
		this.clickOnSoftware()
		this.clickOnDropdownButtonOfSubunitInPerformance()
		this.selectEngineeringOptInSubunit()
		this.clickOnIncludeInperf()
		this.selectCurrentAndPastEmployeesInPerfo()
		this.clickOnReview()
		this.selectInProgressOption()


	}



	@Keyword
	def dashboardModuleDetails() {

		actions.click(findTestObject("Object Repository/login/DashboardModule"))//click on dashboard

		actions.click(findTestObject("Object Repository/login/clickOnTime"))//click On time to select time

		actions.click(findTestObject("Object Repository/login/dropDownToselectTimeInDashboard"))//dropdown option to select date

		actions.click(findTestObject("Object Repository/login/clickOnUpToselectDate"))

		actions.click(findTestObject("Object Repository/login/clickOnMinutes"))

		actions.click(findTestObject("Object Repository/login/clickOnAm"))

		actions.click(findTestObject("Object Repository/login/clickOnOut"))


	}

	@Keyword
	def clickOnDropDownOptinInAdminToSelect() {

		actions.click(findTestObject("Object Repository/login/DropDownOptionInAdmin"))
	}
	@Keyword
	def selectAdmin() {

		actions.click(findTestObject("Object Repository/login/selectAdmin"))
	}

	@Keyword
	def selectEmpNameInAdmin() {

		actions.click(findTestObject("Object Repository/login/selectEmpnameInAdmin"))
	}

	@Keyword
	def addAdminInAdminModule(userName,password,empName) {

		/*actions.sendKeys(findTestObject("Object Repository/login/userName"), userName)
		 actions.sendKeys(findTestObject("Object Repository/login/password"), password)*/

		enterUserName(userName)

		enterPasswor(password)

		clickOnLogin()

		actions.click(findTestObject("Object Repository/login/clickOnAdmnModule"))

		actions.click(findTestObject("Object Repository/login/AddButtonInAdmin"))

		clickOnDropDownOptinInAdminToSelect()

		selectAdmin()

		enterEmpNameInPerformance(empName)

		selectEmpNameInAdmin()

		WebUI.delay(10)

	}


	@Keyword
	def enterEmpId(empId) {

		actions.sendKeys(findTestObject("Object Repository/login/EmpId"),empId)

	}

	@Keyword
	def clickOnDropdownToselectEmpStatus() {

		actions.click(findTestObject("Object Repository/login/dropdownInPimToselectEmpStatus"))
	}

	@Keyword
	def selectEmploymentStatus() {

		actions.click(findTestObject("Object Repository/login/EmploymentStatusInPim"))
	}

	@Keyword
	def clickOnDropdownToSelectSupervisor() {
		actions.click(findTestObject("Object Repository/pimModule/dropdownForSupervisor"))
	}

	@Keyword
	def selectSupervisor() {
		actions.click(findTestObject("Object Repository/pimModule/supervisorName"))
	}


	@Keyword
	def clickOnDropDownInSubUnitInPim() {
		actions.click(findTestObject("Object Repository/pimModule/clickOnDropdowninSubUnit"))
	}

	@Keyword
	def checkEmployeeListInPimModule(userName,password,empName,empId,supervisorName) {

		enterUserName(userName)

		enterPasswor(password)

		clickOnLogin()

		clickOnPim()

		enterEmpNameInPim(empName)

		enterEmpId(empId)

		clickOnDropdownToselectEmpStatus()

		selectEmploymentStatus()

		clickOnIncludeInperf()

		selectCurrentAndPastEmployeesInPerfo()

		clickOnDropdownToSelectSupervisor()

		selectSupervisor()

		clickOnDropDownInSubUnitInPim()

		selectEngineeringOptInSubunit()

	}

	@Keyword
	def clickOnAddEmployeeInPim() {

		actions.click(findTestObject("Object Repository/pimModule/Add Employye"))
	}



	@Keyword
	def addEmployeeInPIM(userName,password,firstName,lastName) {

		enterUserName(userName)

		enterPasswor(password)

		clickOnLogin()

		clickOnPim()

		clickOnAddEmployeeInPim()

		enterFirstNameInPim(firstName)

		enterLastNameInPim(lastName)


	}


	@Keyword
	def clickOnreportsInPim() {

		actions.click(findTestObject("Object Repository/pimModule/reports"))
	}

	@Keyword
	def enterReportName(name) {

		actions.sendKeys(findTestObject("Object Repository/pimModule/enterReportName"),name)
	}

	@Keyword
	def selectReportName() {

		actions.click(findTestObject("Object Repository/pimModule/reportName"))
	}

	@Keyword
	def employeeReports(name) {

		clickOnPim()
		clickOnreportsInPim()
		enterReportName(name)
		selectReportName()

	}


	def enterAllDetailsInLeaveList()




}
