import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.hzi.TestDataConnector as TestDataConnector
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Login/partials/LoginAsSurveillanceSupervisor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SurveillanceSupervisor/partials/SwitchToCases'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Surveillance/NewCaseView/div_NewCase_btn'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_Region_DDBox'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_Region_Berlin_DDItem'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_District_DDBox'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_District_Berlin_DDItem'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_HealthFacility_DDBox'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_HealthFacility_BerlinNationHospital_DDItem'))

String firstName = TestDataConnector.getValueByKey('GenericUsers', 'first_name_case')

WebUI.setText(findTestObject('Surveillance/NewCaseView/first_name_inputBox'), firstName)

String lastName = TestDataConnector.getValueByKey('GenericUsers', 'last_name_case')

WebUI.setText(findTestObject('Surveillance/NewCaseView/last_name_inputBox'), lastName)

WebUI.setText(findTestObject('Surveillance/NewCaseView/dateOfReport_inputBox'), '01/04/2020')

WebUI.setText(findTestObject('Surveillance/NewCaseView/dateOfSymptomOnset_inputBox'), '26/03/2020')

WebUI.setText(findTestObject('Surveillance/NewCaseView/div_DateOfBirthYear_inputBox'), '2000')

WebUI.setText(findTestObject('Surveillance/NewCaseView/div_DateOfBirthMonth_inputBox'), 'June')

WebUI.setText(findTestObject('Surveillance/NewCaseView/div_DateOfBirthDay_inputBox'), '7')

WebUI.click(findTestObject('Surveillance/NewCaseView/div_Sex_DDBox'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_Sex_Female_DDItem'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_PresentConditionOfPerson_DDBox'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_PresentConditionOfPerson_alive_DDItem'))

WebUI.click(findTestObject('Surveillance/NewCaseView/div_Save_btn'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Surveillance/NewCaseView/Comfirmation/div_check_confimation_lbl'), 5)) {
    WebUI.click(findTestObject('Surveillance/NewCaseView/Comfirmation/chooseExistingCase_radio'))

    WebUI.click(findTestObject('Surveillance/NewCaseView/Comfirmation/div_confirm_btn'))

    WebUI.delay(3)
}

if (isStandalone) {
    WebUI.closeBrowser()
}

