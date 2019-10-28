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

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Pekerjaan'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Pekerjaan'), GUvarPekerjaan, 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : GUvarPekerjaan]), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Badan Usaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GUvarBadanUsaha]), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Nama Usaha'), GUvarNamaUsaha, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Bidang Usaha'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Bidang Usaha'), GUvarBidangUsaha, 0)

CustomKeywords.'mobile.picklist.List'(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_Usaha_LOVBidangUsaha'), FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Sub Bidang Usaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GUvarSubBidangUsaha]), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Tanggal Mulai Bisnis'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Alamat Kantor'), GUvarAlamat, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH RT'), GUvarRT, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH RW'), GUvarRW, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Kode Pos'), GUvarKodePos, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Kode Pos'), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_USH LOV Kode Pos'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Petunjuk Alamat'), GUvarPtnjkAlamat, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Telepon Seluler'), GUIvarTeleponseluler, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Website'), GUvarWebsite, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Janis Akun Sosial Media'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GUvarJenisSosmed]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Usaha/Guarantor_ USH Akun Sosial Media'), GUvarSosmed, 0)

