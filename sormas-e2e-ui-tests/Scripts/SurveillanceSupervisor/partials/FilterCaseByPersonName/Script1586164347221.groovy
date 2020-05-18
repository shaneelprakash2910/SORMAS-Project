import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Search for Person
WebUI.setText(findTestObject('Surveillance/SearchView/Filter/input_search_person_inputBox'), personName)

// Wait one second for ui update
WebUI.delay(1)

// Open first entry
WebUI.click(findTestObject('Surveillance/SearchView/a_Search_Entry_link'))

