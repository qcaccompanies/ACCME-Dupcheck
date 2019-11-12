import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import com.detroitlabs.katalonmobileutil.component.Finder as Finder
import com.detroitlabs.katalonmobileutil.testobject.XPathBuilder as XPathBuilder
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor as ScrollFactor
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('dynamic object/Calendar_TxtTahun'), 0)

driver = MobileDriverFactory.getDriver()

String xpath = ''

xpath = XPathBuilder.createXPath('TextView')

List<RemoteWebElement> listElements = ((driver.findElementsByXPath(xpath)) as List<RemoteWebElement>)

if (listElements[(listElements.size() - 1)].getText() < varTahun) {
    varScrollUpDown = 'DownToUp'
} else {
    varScrollUpDown = 'UpToDown'
}

switch (varScrollUpDown.toString()) {
    case 'UpToDown':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextUpToDown'(varTahun)

        break
    case 'DownToUp':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextDownToUp'(varTahun)

        break
}

Mobile.tap(findTestObject('dynamic object/pickListItem_TextView', [('text') : varTahun]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Click_Tanggal'), 0)

Mobile.tap(findTestObject('dynamic object/Calendar_TxtSetel'), 0)

