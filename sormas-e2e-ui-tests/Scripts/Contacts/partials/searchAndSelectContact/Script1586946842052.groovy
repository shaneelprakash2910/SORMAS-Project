import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.hzi.Helper
import com.hzi.TestDataConnector
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.setText(findTestObject('Contacts/ContactsOverview/contact_search_field_name'),
	TestDataConnector.getValueByKey(GlobalVariable.gContactTestDataName, key))
WebUI.delay(1)
WebUI.click(Helper.createTestObjectWithXPath('//table[@aria-rowcount]//a'))