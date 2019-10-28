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

if (BDvarDomisili == 'Tidak') {
    Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_BtnAlamatDomisiliSamaDenganIdentitas - Tidak'), 0, 
        FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpAlamatLengkap'), BDvarAlamatLengkap, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpRT'), BDvarRT, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpRW'), BDvarRW, 0)

    Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpKodePos'), BDvarKodePos, 0)

    Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_Domisili_LOVKodePos'), 0)
} else {
    Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_BtnAlamatDomisiliSamaDenganIdentitas - Ya'), 0, FailureHandling.OPTIONAL)
}

Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpNegaraDomisili'), BDvarNegaraDomisili, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.3, 1000)

Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_InpNegaraDomisili'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BDvarNegaraDomisili]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.4, 1000)

Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpPetunjukAlamat'), BDvarPetunjukAlamat, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_TxtTinggalSejakTahun'), 0)

Mobile.scrollToText(BDvarTinggalSejakTahun, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BDvarTinggalSejakTahun]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower_TxtStatusTempatTinggal'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BDvarStatusTempatTinggal]), 0)

Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpKodeArea'), BDvarKodeArea, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpNoTelponFixedLine'), BDvarNoTelponFixedLine, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Domisili/Borrower_InpTelponSelular'), BDvarTelponSelular, 0)

if (BDvarROAO == 'Ya') {
    Mobile.tap(findTestObject('Borrower/Borrower - Domisili/Borrower-Domisili-AlamatDomisiliROAO'), 0, FailureHandling.OPTIONAL)
}

