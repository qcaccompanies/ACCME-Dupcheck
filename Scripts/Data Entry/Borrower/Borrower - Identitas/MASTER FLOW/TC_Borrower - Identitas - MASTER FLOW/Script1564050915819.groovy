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

WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpNoKTP'), BIvarNoKTP, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnMasaBerlaku-SeumurHidup'), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpNamaSesuaiIdentitas'), BIvarNama, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Identitas/Borrower_InpTempatLahir'), BIvarTempatLahir, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_InpTempatLahir'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BIvarTempatLahir]), 0)

not_run: Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnVerifikasiKTP'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtTanggalLahir'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : varTahun], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnCekDataPelanggan'), 0)

Mobile.waitForElementPresent(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnConfirm'), 120)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnCheckBox'), 60)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_BtnConfirm'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.tap(findTestObject('Borrower/Borrower - Identitas/Borrower_TxtStatusPerkawinan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIvarStatusPerkawinan]), 0, FailureHandling.STOP_ON_FAILURE)

