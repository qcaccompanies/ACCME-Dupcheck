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

Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNamaLengkapTanpaSingkatan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNamaLengkapTanpaSingkatan'), BIUvarNamaLengkapTanpaSingkatan, 
    0)

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNamaPanggilan'), BIUvarNamaPanggilan, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNoNPWP'), BIUvarNoNPWP, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNamaNPWP'), BIUvarNamaNPWP, 0)

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpNamaIbuKandung'), BIUvarNamaIbuKandung, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/Borrower_TxtPendidikan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIUvarPendidikan]), 0)

if (BIUvarAlamatMenyurat == 'Domisili') {
    Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/borrower-InfoUmum-Domisili'), 0)
} else if (BIUvarAlamatMenyurat == 'Kantor') {
    Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/borrower-InfoUmum-Kantor'), 0)
} else if (BIUvarAlamatMenyurat == 'Bisnis') {
    Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/borrower-InfoUmum-Bisnis'), 0)
}

Mobile.setText(findTestObject('Borrower/Borrower - Info Umum/Borrower_InpAlamatEmail'), BIUvarAlamatEmail, 0)

Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/Borrower_TxtSumberDanaUangMuka'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIUvarSumberDanaUangMuka]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/Borrower_TxtSumberDanaAngsuran'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIUvarSumberDanaAngsuran]), 0)

Mobile.tap(findTestObject('Borrower/Borrower - Info Umum/Borrower_TxtKepemilikanDana'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BIUvarKepemilikanDana]), 0)

