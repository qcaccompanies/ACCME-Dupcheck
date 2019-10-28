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

if (GDvarDomisili == 'Tidak') {
    Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor-Domisili-TidakDomisili'), 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Alamat Lengkap'), GDvarAlamatLengkap, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM RT'), GDvarRT, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM RW'), GDvarRW, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Kode Pos'), GDvarKodePos, 0)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Kode Pos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor-Domisili-12420'), 0)
} else {
    Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor-Domisili-YaDomisili'), 0)
}

Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Negara'), GDvarNegara, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Negara'), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_Domisili_LOVNegaraDomisili'), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.5, 1000)

Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Petunjuk Alamat'), GDvarPtjkAlamat, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Tinggal Sejak Tahun'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GDvarTngglSejakTahun]), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Status Tempat Tinggal'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GDvarStatusTT]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Kode Area'), GDvarNoTlp1, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Domisili/Guarantor_ DM Telepon Fixed Line'), GDvarNoTlp2, 0)

