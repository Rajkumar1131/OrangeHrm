package webAutomation

import java.text.BreakIterator

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class Verifications {


	WebActions actions = new WebActions()
	@Keyword
	def verifyElementPresent(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!WebUI.verifyElementPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementPresentAndContinueOnFailure(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!WebUI.verifyElementPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			KeywordUtil.markFailed(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotPresent(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!(WebUI.verifyElementNotPresent(element, maxWaitTime, FailureHandling.OPTIONAL))) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementsCount(TestObject element, def count, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		def actualCount = 0;
		for(int i=0;i<=maxWaitTime/5;i++) {
			actualCount = actions.getElementCount(element)
			if(actualCount==count) {
				i=100;
			}
			WebUI.delay(5)
		}
		if(actualCount != count) {
			KeywordUtil.markFailed(failureDescription)
		}
	}


	@Keyword
	def verifyElementNotPresentAndContinuewOnFailure(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!WebUI.verifyElementNotPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailed(failureDescription)
		}
	}

	@Keyword
	def verifyTextMatch(String actual, String expected, String failureDescription){
		actions.takeScreenshot()
		if(!(WebUI.verifyMatch(actual, expected, false, FailureHandling.OPTIONAL))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementVisible(TestObject element, String failureDescription){
		actions.takeScreenshot()
		if(!(WebUI.verifyElementVisible(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotVisible(TestObject element, String failureDescription){
		actions.takeScreenshot()
		if(!(WebUI.verifyElementNotVisible(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}
	@Keyword
	def verifyElementNotVisibleAndContinuewOnFailure(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!WebUI.verifyElementNotVisible(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailed(failureDescription)
		}
	}

	@Keyword
	def verifyElementClickable(TestObject element, String failureDescription){
		actions.takeScreenshot()
		if(!(WebUI.verifyElementClickable(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotClickable(TestObject element, String failureDescription){
		actions.takeScreenshot()
		if(!(WebUI.verifyElementNotClickable(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyTextboxEditable(TestObject element){
	}


	@Keyword
	def verifyElementPresentInMobile(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		actions.takeScreenshot()
		if(!Mobile.verifyElementExist(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			Mobile.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyObjectsMatch(def actual, def expected, String failureDescription){
		actions.takeScreenshot()
		if(!actual.equals(expected)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}
}
