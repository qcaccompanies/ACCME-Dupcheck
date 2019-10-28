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

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpPekerjaan'), BUvarPekerjaan, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpPekerjaan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BUvarPekerjaan]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_TxtBadanUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BUvarBadanUsaha]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpNamaUsaha'), BUvarNamaUsaha, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpBidangUsaha'), BUvarBidangUsaha, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpBidangUsaha'), 0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.picklist.List'(findTestObject('Borrower/Borrower - Usaha/borrower-usaha-LOVbidangusaha'), FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_TxtSubBidangUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BUvarSubBidangUsaha]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_TxtTanggalMulaiBisnis'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

if (BUvarSesuaiDomisili == 'Ya') {
    Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower-Usaha-YaDomisili'), 0)
} else {
    Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_BtnALamatUsahaSamaDenganDomisili - Tidak'), 0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

    Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpAlamatKantor'), BUvarAlamatKantor, 0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

    Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpRT'), BUvarRT, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpRW'), BUvarRW, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpKodePos'), BUvarKodePos, 0)

    Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpKodePos'), 0)

    Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_LOVKodePos'), 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpPetunjukAlamat'), BUvarPetunjukAlamat, 0)
}

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpKodeArea'), BUvarKodeArea, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpNoTelponKantor'), BUvarNoTelponKantor, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpExt'), BUvarEXT, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpTeleponSeluler'), BUvarTeleponSeluler, 0)

not_run: Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpWebsite'), BUvarWebsite, 0)

not_run: Mobile.tap(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_TxtJenisAkunSosialMedia'), 0)

not_run: Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BUvarJenisAkunSosialMedia]), 
    0)

not_run: Mobile.setText(findTestObject('Borrower/Borrower - Usaha/Borrower_Usaha_InpAkunSosialMedia'), BUvarAkunSosialMedia, 
    0)

